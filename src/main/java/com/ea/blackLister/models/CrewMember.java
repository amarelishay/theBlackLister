package com.ea.blackLister.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CrewMember {
    private String job;
    private String department;
    private String creditId;
    private boolean adult;
    private int gender;
    private int id;
    private String knownForDepartment;
    private String name;
    private String originalName;
    private double popularity;
    private String profilePath;
}
