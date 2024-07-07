package com.ea.blackLister.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EpisodeResult {


        private String airDate;
        private int episodeNumber;
        private List<CrewMember> crew;
        private List<GuestStar> guestStars;

}
