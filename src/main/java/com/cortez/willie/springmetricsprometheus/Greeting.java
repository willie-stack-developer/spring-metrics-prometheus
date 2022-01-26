package com.cortez.willie.springmetricsprometheus;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "greeting")
public class Greeting {
    @Id
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "content")
    private String content;

    public Greeting(Long id, String content) {
        this.id = id;
        this.content = content;
    }

    public Greeting() {

    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}