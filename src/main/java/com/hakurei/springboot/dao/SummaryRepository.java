package com.hakurei.springboot.dao;

import com.hakurei.springboot.entity.Summary;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface SummaryRepository extends CrudRepository<Summary,Long> {

}
