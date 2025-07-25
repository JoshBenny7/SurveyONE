package com.example.survey.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "responses")
public class Response {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String username;
    private String topic;
    private int form_no;
    private String q1;
    private String q2;
    private String q3;
    private String q4;
    private String q5;

    // Getters and setters
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }

    public String getTopic() {
        return topic;
    }
    public void setTopic(String topic) {
        this.topic = topic;
    }

    public int getForm_no() {
        return form_no;
    }
    public void setForm_no(int form_no) {
        this.form_no = form_no;
    }

    public String getQ1() {
        return q1;
    }
    public void setQ1(String q1) {
        this.q1 = q1;
    }

    public String getQ2() {
        return q2;
    }
    public void setQ2(String q2) {
        this.q2 = q2;
    }

    public String getQ3() {
        return q3;
    }
    public void setQ3(String q3) {
        this.q3 = q3;
    }

    public String getQ4() {
        return q4;
    }
    public void setQ4(String q4) {
        this.q4 = q4;
    }

    public String getQ5() {
        return q5;
    }
    public void setQ5(String q5) {
        this.q5 = q5;
    }
}
