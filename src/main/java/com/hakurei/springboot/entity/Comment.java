package com.hakurei.springboot.entity;

import javax.persistence.*;

@Entity
@Table(name = "comment")
public class Comment {

    @Id
    @SequenceGenerator(name="comment_seq", sequenceName="comment_seq",allocationSize=1)
    @GeneratedValue(strategy=GenerationType.SEQUENCE, generator="comment_seq")
    @Column(name = "id")
    private Integer id;
    private String  nickname;
    private String  date;
    @Column(columnDefinition = "LONGTEXT")
    private String  content;
    private String  belong;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getBelong() {
        return belong;
    }

    public void setBelong(String belong) {
        this.belong = belong;
    }

}
