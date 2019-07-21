package com.reinhardt.aboutme.entities;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import java.io.Serializable;

@Entity
@Table(name = "description")
public class Description implements Serializable {

    private static final long serialVersionUID = 1L;

    @EmbeddedId
    private DescriptionId descriptionId;

    @Column(name = "description")
    private String description;

    public DescriptionId getDescriptionId() {
        return descriptionId;
    }

    public void setDescriptionId(DescriptionId descriptionId) {
        this.descriptionId = descriptionId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
