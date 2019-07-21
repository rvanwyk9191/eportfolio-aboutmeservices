package com.reinhardt.aboutme.service;

import com.reinhardt.aboutme.dao.PositionDao;
import com.reinhardt.aboutme.dto.Position;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PositionService {

    @Autowired
    private PositionDao positionDao;

    public List<Position> getAllPositions(){
        List<Position> positions = new ArrayList<>();
        positionDao.getAllPositions().forEach((position -> {
            Position positionDto = new Position();
            positionDto.setId(position.getId());
            positionDto.setTitle(position.getTitle());
            positionDto.setCompany(position.getCompany());
            positionDto.setEndmonth(position.getEndmonth());
            positionDto.setEndyear(position.getEndyear());
            positionDto.setStartmonth(position.getStartmonth());
            positionDto.setStartyear(position.getStartyear());
            positions.add(positionDto);
        }));
        return positions;
    }

}
