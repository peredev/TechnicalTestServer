package com.perera.techtest.service;

import com.perera.techtest.model.Activity;
import com.perera.techtest.repo.ActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ActivityServiceImpl implements ActivityService {

    @Autowired
    private ActivityRepository activityRepository;

    @Override
    public List<Activity> getAll() {
        return (List<Activity>) activityRepository.findAll();
    }

    @Override
    public List<Activity> getByContactId(Long contactId) {
        return activityRepository.getActivityByContactId(contactId);
    }

    @Override
    public Activity save(Activity activity) {
        return activityRepository.save(activity);
    }

    @Override
    public void delete(Activity activity) {
        activityRepository.delete(activity);
    }
}
