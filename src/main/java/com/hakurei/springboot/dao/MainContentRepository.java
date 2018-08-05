package com.hakurei.springboot.dao;

import com.hakurei.springboot.entity.MainContent;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MainContentRepository  extends CrudRepository<MainContent,Long> {

    @Query("select c from MainContent c where c.title =:title")
    public MainContent findByName(@Param("title") String title);
}
