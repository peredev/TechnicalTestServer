package com.perera.techtest.controller;

import com.perera.techtest.model.Contact;
import com.perera.techtest.repo.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/contacts")
@CrossOrigin
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @GetMapping("/all")
    public List<Contact> getAll() {
        return (List<Contact>) contactRepository.findAll();
    }

    @PostMapping("/save")
    public @ResponseBody List<Contact> saveOrUpdate(@RequestBody Contact contact) {
        contactRepository.save(contact);
        return getAll();
    }

    @PostMapping("/delete")
    public @ResponseBody List<Contact> delete(@RequestBody Contact contact) {
        contactRepository.delete(contact);
        return getAll();
    }


}
