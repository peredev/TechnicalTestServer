package com.perera.techtest.repo;

import com.perera.techtest.model.Activity;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface ActivityRepository extends CrudRepository<Activity, Long> {

    List<Activity> getActivityByContactId(Long contactId);

}
