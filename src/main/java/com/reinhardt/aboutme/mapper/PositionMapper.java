package com.reinhardt.aboutme.mapper;

import com.reinhardt.aboutme.entities.Position;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class PositionMapper implements RowMapper<Position> {
    @Override
    public Position mapRow(ResultSet resultSet, int i) throws SQLException {
        Position position = new Position();
        position.setId(resultSet.getInt("id"));
        position.setCompany(resultSet.getString("company"));
        position.setTitle(resultSet.getString("title"));
        position.setStartmonth(resultSet.getString("startmonth"));
        position.setEndmonth(resultSet.getString("endmonth"));
        position.setStartyear(resultSet.getString("startyear"));
        position.setEndyear(resultSet.getString("endyear"));
        return position;
    }
}
