package com.perera.techtest.service;

import com.perera.techtest.model.Activity;

import java.util.List;

public interface ActivityService {

    List<Activity> getAll();

    List<Activity> getByContactId(Long contactId);

    Activity save(Activity activity);

    void delete(Activity activity);
}
