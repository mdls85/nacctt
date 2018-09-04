package com.example.mdls8.nacctt.models;

public class Washroom {

    private String name;
    private double lat;
    private double longit;
    private int clean_level;
    private boolean disability_able;
    private String intuitive_directions;
    private String comments;

    public Washroom(String name, double lat, double longit) {
        this.name = name;
        this.lat = lat;
        this.longit = longit;
    }

    public Washroom(double lat, double longit) {
        this.lat = lat;
        this.longit = longit;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getLat() {
        return lat;
    }

    public void setLat(double lat) {
        this.lat = lat;
    }

    public double getLongit() {
        return longit;
    }

    public void setLongit(double longit) {
        this.longit = longit;
    }

    public int getClean_level() {
        return clean_level;
    }

    public void setClean_level(int clean_level) {
        this.clean_level = clean_level;
    }

    public boolean isDisability_able() {
        return disability_able;
    }

    public void setDisability_able(boolean disability_able) {
        this.disability_able = disability_able;
    }

    public String getIntuitive_directions() {
        return intuitive_directions;
    }

    public void setIntuitive_directions(String intuitive_directions) {
        this.intuitive_directions = intuitive_directions;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }
}
