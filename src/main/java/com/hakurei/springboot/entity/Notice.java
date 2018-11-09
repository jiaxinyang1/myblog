package com.hakurei.springboot.entity;

import javax.persistence.*;

@Entity
@Table(name = "notice")
public class Notice {

    @Id
    @SequenceGenerator(name="notice_seq", sequenceName="notice_seq",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="notice_seq")
    @Column(name = "id")
    private Integer id;
    private String  Date;
    private String  content;



    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String date) {
        Date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}
