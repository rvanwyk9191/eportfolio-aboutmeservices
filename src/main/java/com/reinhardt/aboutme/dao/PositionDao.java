package com.reinhardt.aboutme.dao;

import com.reinhardt.aboutme.entities.Position;
import com.reinhardt.aboutme.mapper.PositionMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Repository
public class PositionDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Position> getAllPositions(){
        return jdbcTemplate.query("select * from aboutme.position", new PositionMapper());
    }

}
