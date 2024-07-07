package com.ea.blackLister.service;

import com.ea.blackLister.beans.Episode;

import java.util.List;

public interface EpisodeService {
    Episode getEpisodeByIdFromApi(int seasonId, int episodeId);

    List<Episode> GetAllEpisodes();
    List<Episode> findAllFromApi();
}
