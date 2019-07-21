package com.reinhardt.aboutme.service;

import com.reinhardt.aboutme.dao.DescriptionDao;
import com.reinhardt.aboutme.dto.Description;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class DescriptionService {

    @Autowired
    private DescriptionDao descriptionDao;

    public List<Description> getAllDescriptions(){
        List<Description> descriptions = new ArrayList<>();
        descriptionDao.getAllDescriptions().forEach((description -> {
            Description descriptionDto = new Description();
            descriptionDto.setId(String.valueOf(description.getDescriptionId().getId()));
            descriptionDto.setPositionId(String.valueOf(description.getDescriptionId().getPositionId()));
            descriptionDto.setDescriptions(Arrays.asList(description.getDescription()));
            descriptions.add(descriptionDto);
        }));
        return descriptions;
    }

}
