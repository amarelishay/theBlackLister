package com.ea.blackLister.service;

import com.ea.blackLister.beans.Episode;
import lombok.RequiredArgsConstructor;
import com.ea.blackLister.models.EpisodeResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.ea.blackLister.repos.EpisodeRepository;

import java.util.List;

@RequiredArgsConstructor
@Service
public class EpisodeServiceImpl implements EpisodeService{
    private final RestTemplate restTemplate;
    private final EpisodeRepository episodeRepository;
    @Value("${open.theblacklist.api.base.url}")
    private String webApi;
    @Value("${open.theblacklist.api.base.episode.url}")
     private String imgUrl ;

    public String getUrl(String url,int seasonNumber, int episodeNumber) {
        return String.format(url, seasonNumber, episodeNumber);
    }
    @Override
    public Episode getEpisodeByIdFromApi(int seasonId, int episodeId) {
        String url=getUrl(webApi,seasonId,episodeId);
        EpisodeResult episodeResult=restTemplate.getForObject(url, EpisodeResult.class);
        String imageUrl=restTemplate.getForObject(getUrl(imgUrl,seasonId,episodeId), String.class);
        Episode episode=Episode.builder().episodeId(episodeResult.getEpisodeNumber())
                .seasonId(2)
                .characters(episodeResult.getGuestStars())
                .imgUrl(imageUrl)
                .build();
        episodeRepository.save(episode);
        return episode;
    }

    @Override
    public List<Episode> GetAllEpisodes() {
        return null;
    }

    @Override
    public List<Episode> findAllFromApi() {
        return null;
    }
}
