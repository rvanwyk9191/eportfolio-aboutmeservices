package com.reinhardt.aboutme.mapper;

import com.reinhardt.aboutme.entities.Description;

import com.reinhardt.aboutme.entities.DescriptionId;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class DescriptionMapper implements RowMapper<Description> {

    @Override
    public Description mapRow(ResultSet resultSet, int i) throws SQLException {
        Description description = new Description();
        DescriptionId descriptionId = new DescriptionId();
        descriptionId.setPositionId(resultSet.getInt("positionid"));
        descriptionId.setId(resultSet.getInt("id"));
        description.setDescriptionId(descriptionId);
        description.setDescription(resultSet.getString("text"));
        return description;
    }
}
