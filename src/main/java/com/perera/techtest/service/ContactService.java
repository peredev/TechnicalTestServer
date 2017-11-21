package com.perera.techtest.service;

import com.perera.techtest.model.Contact;

import java.util.List;

public interface ContactService {

    List<Contact> getAll();

    Contact save(Contact contact);

    void delete(Contact contact);
}
