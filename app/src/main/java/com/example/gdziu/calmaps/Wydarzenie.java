package com.example.gdziu.calmaps;

import java.io.Serializable;

public class Wydarzenie implements Serializable {
    private int _id;
    private String summary;
    private String location;
    private String startDate;
    private String comment;
    public Wydarzenie(){}
    public Wydarzenie(String summary, String location, String startDate, String comment) {
        super();
        this.summary = summary;
        this.location = location;
        this.startDate = startDate;
        this.comment = comment;
    }
    @Override
    public String toString() {
        return "Wydarzenie: [id=" + _id + ", summary=" + summary + ", location=" + location
                + " startDate"+startDate + ", comment" + comment +"]";
    }
    public String getSummary() { return summary; }
    public String getLocation() { return location; }
    public String getStartDate() { return startDate; }
    public String getComment() { return comment; }
    public int getId() { return _id; }
    public void setId(int id) { this._id = id; }
}
