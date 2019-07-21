package com.reinhardt.aboutme.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Position {

    @JsonProperty("id")
    private int id;

    @JsonProperty("title")
    private String title;

    @JsonProperty("company")
    private String company;

    @JsonProperty("startmonth")
    private String startmonth;

    @JsonProperty("startyear")
    private String startyear;

    @JsonProperty("endmonth")
    private String endmonth;

    @JsonProperty("endyear")
    private String endyear;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getStartmonth() {
        return startmonth;
    }

    public void setStartmonth(String startmonth) {
        this.startmonth = startmonth;
    }

    public String getStartyear() {
        return startyear;
    }

    public void setStartyear(String startyear) {
        this.startyear = startyear;
    }

    public String getEndmonth() {
        return endmonth;
    }

    public void setEndmonth(String endmonth) {
        this.endmonth = endmonth;
    }

    public String getEndyear() {
        return endyear;
    }

    public void setEndyear(String endyear) {
        this.endyear = endyear;
    }
}
