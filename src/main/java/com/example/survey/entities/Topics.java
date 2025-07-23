package com.example.survey.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "topics")
public class Topics {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String topic;
    private String description;
    @Column(name = "no_of_forms") // Optional: matches DB column
    private int noOfForms;

    // Getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic){
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public int getNoOfForms() {
        return noOfForms;
    }

    public void setNoOfForms(int noOfForms) {
        this.noOfForms = noOfForms;
    }
}
