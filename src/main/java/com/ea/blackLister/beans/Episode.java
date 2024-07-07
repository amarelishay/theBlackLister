package com.ea.blackLister.beans;

import lombok.*;
import com.ea.blackLister.models.GuestStar;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "episodes")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Episode {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    private int id;

    private int episodeId;
    private int seasonId;
    @Column(length = 40)
    private String name;
    private String imgUrl;
    private String details;
    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinTable(name = "episode_guest_stars",
            joinColumns = @JoinColumn(name = "episode_id"),
            inverseJoinColumns = @JoinColumn(name = "guest_star_id"))
    private List<GuestStar> characters = new ArrayList<>();
}