package com.hakurei.springboot.entity;

import javax.persistence.*;

@Entity
@Table(name = "content")
public class MainContent {

    @Id
    @SequenceGenerator(name="content_seq", sequenceName="content_seq",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="content_seq")
    @Column(name = "id")
    private Integer id;
    private String  title;
    private String  description;
    private String  maincontent;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getMainContent() {
        return maincontent;
    }

    public void setMainContent(String mainContent) {
        this.maincontent = mainContent;
    }

    @Override
    public String toString() {
        return "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", mainContent='" + maincontent + '\'' ;
    }
}
