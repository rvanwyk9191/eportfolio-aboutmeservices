package com.reinhardt.aboutme.entities;

import javax.persistence.Embeddable;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Embeddable
public class DescriptionId {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Id
    private int positionid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getPositionId() {
        return positionid;
    }

    public void setPositionId(int positionid) {
        this.positionid = positionid;
    }
}
