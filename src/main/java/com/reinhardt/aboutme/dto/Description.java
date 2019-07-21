package com.reinhardt.aboutme.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class Description {

    @JsonProperty("id")
    private String id;

    @JsonProperty("posotionid")
    private String positionId;

    @JsonProperty("descriptions")
    private List<String> descriptions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPositionId() {
        return positionId;
    }

    public void setPositionId(String positionId) {
        this.positionId = positionId;
    }

    public List<String> getDescriptions() {
        return descriptions;
    }

    public void setDescriptions(List<String> descriptions) {
        this.descriptions = descriptions;
    }
}
