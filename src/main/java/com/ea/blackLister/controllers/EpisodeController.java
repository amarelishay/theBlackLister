package com.ea.blackLister.controllers;


import com.ea.blackLister.beans.Episode;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ea.blackLister.service.EpisodeService;

import java.util.List;

@RestController
@RequestMapping("api/episode")
@RequiredArgsConstructor
public class EpisodeController {
    private final EpisodeService episodeService;

//    @GetMapping("/{id}")
//    public Episode getById(@PathVariable int id) throws RickAndMortyExceptions {
//        System.out.println(episodeService.getEpisodeById(id));
//        return episodeService.getEpisodeById(id);
//    }
//    @GetMapping("/getfromapi/{id/}")
//    public Episode getByIdFromApi(@PathVariable int seasonId,int episodeId) /* throws RickAndMortyExceptions */ {
@GetMapping("/{seasonId}/{episodeId}")
public Episode getByIdFromApi(@PathVariable("seasonId") int seasonId, @PathVariable("episodeId") int episodeId){
        System.out.println(episodeService.getEpisodeByIdFromApi(seasonId, episodeId));
        return episodeService.getEpisodeByIdFromApi(seasonId, episodeId);
    }
    @GetMapping
    public List<Episode> getEpisodes(){
        return episodeService.GetAllEpisodes();
    }
    @GetMapping("/getallfromapi")
    public List<Episode> getEpisodesFromApi(){
        return episodeService.findAllFromApi();
    }

}
