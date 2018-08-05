package com.hakurei.springboot.dao;

import com.hakurei.springboot.entity.Comment;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;


public interface CommentRepository extends CrudRepository<Comment,Long> {


    @Query("select com from Comment com where com.belong=:belong")
    public List findAllByBelong(@Param("belong") String belong);
}

