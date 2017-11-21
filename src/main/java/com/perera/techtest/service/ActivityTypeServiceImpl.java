package com.perera.techtest.service;

import com.perera.techtest.model.ActivityType;
import com.perera.techtest.repo.ActivityTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityTypeServiceImpl implements ActivityTypeService {

    @Autowired
    private ActivityTypeRepository activityTypeRepository;

    @Override
    public List<ActivityType> getAll() {
        return (List<ActivityType>) activityTypeRepository.findAll();
    }
}
