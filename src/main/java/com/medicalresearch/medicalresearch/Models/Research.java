package com.medicalresearch.medicalresearch.Models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "research")
public class Research {

    @Id
    @Column(name = "id")
    private String id;
    @Column(name = "name")
    private String name;
    @Column(name = "description")
    private String description;
    @Column(name = "symptoms")
    private String symptoms;
    @Column(name = "duration")
    private String duration;
    @Column(name = "mortalityrate")
    private String mortalityrate;
    @Column(name = "imageaddress")
    private String imageaddress;

    public Research() {
    }



    public Research(String id, String name, String description, String symptoms, String duration, String mortalityrate, String imageaddress) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.symptoms = symptoms;
        this.duration = duration;
        this.mortalityrate = mortalityrate;
        this.imageaddress = imageaddress;

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSymptoms() {
        return symptoms;
    }

    public void setSymptoms(String symptoms) {
        this.symptoms = symptoms;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String getMortalityrate() {
        return mortalityrate;
    }

    public void setMortalityrate(String mortalityrate) {
        this.mortalityrate = mortalityrate;
    }

    public String getImageaddress() {
        return imageaddress;
    }

    public void setImageaddress(String imageaddress) {
        this.imageaddress = imageaddress;
    }

}
