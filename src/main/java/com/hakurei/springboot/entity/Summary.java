package com.hakurei.springboot.entity;



import javax.persistence.*;

@Entity
@Table(name="summary")

public class Summary {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer  id;
    private String title;
    private String Date;
    private String classification;
    private String brief;

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

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }



    public String getBrief() {
        return brief;
    }

    public void setBrief(String brief) {
        this.brief = brief;
    }
    @Override
    public String toString() {
        return  "id: "+id+", title: "+title+", Date: "+Date+", classification: "+classification+", Brief: "+brief;
    }
}
