package com.ea.blackLister.repos;

import com.ea.blackLister.beans.Episode;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EpisodeRepository extends JpaRepository<Episode,Integer> {
}
