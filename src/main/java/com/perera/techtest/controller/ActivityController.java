package com.perera.techtest.controller;

import com.perera.techtest.model.Activity;
import com.perera.techtest.repo.ActivityRepository;
import com.perera.techtest.model.ActivityType;
import com.perera.techtest.repo.ActivityTypeRepository;
import com.perera.techtest.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/activities")
@CrossOrigin
public class ActivityController {

    @Autowired
    private ActivityService activityService;

    @Autowired
    private ActivityTypeRepository activityTypeRepository;

    @GetMapping("/all")
    public @ResponseBody List<Activity> getAll() {
        return activityService.getAll();
    }

    @GetMapping("/allByContact/{id}")
    public @ResponseBody List<Activity> getByContact(@PathVariable("id") Long contactId) {
        return activityService.getByContactId(contactId);
    }

    @PostMapping("/save")
    public @ResponseBody List<Activity> saveActivity(@RequestBody Activity activity) {
        activityService.save(activity);
        return getAll();
    }

    @GetMapping("/types")
    public @ResponseBody List<ActivityType> getActivityTypes() {
        return (List<ActivityType>) activityTypeRepository.findAll();
    }
}
