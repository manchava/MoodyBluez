package com.moodybluez.enterprise.dto;

import lombok.Data;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public @Data
class Mood {

    @Id
    @Column(name = "moodid", nullable = false)
    private int moodID;

    @Basic
    @Column(name = "description", nullable = false, length = 15)
    private String description;


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mood mood = (Mood) o;
        return moodID == mood.moodID && Objects.equals(description, mood.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(moodID, description);
    }
}
