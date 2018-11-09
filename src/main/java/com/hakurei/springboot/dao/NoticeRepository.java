package com.hakurei.springboot.dao;

import com.hakurei.springboot.entity.Notice;
import org.springframework.data.repository.CrudRepository;

public interface NoticeRepository  extends CrudRepository<Notice,Long> {
}
