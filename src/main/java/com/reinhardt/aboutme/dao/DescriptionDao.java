package com.reinhardt.aboutme.dao;

import com.reinhardt.aboutme.entities.Description;
import com.reinhardt.aboutme.mapper.DescriptionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DescriptionDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Description> getAllDescriptions(){
        return jdbcTemplate.query("select * from aboutme.description", new DescriptionMapper());
    }

}
