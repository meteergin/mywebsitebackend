/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.meteergin.controller;

import com.meteergin.entity.Contact;
import com.meteergin.repository.ContactRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Mete Ergin <mete.ergin@outlook.com>
 */
@RestController
public class ContactController {

    private static final Logger LOGGER = LoggerFactory.getLogger(ContactController.class);

    @Autowired
    ContactRepository contactRepository;

    @PostMapping("/api/contact")
    ResponseEntity newContact(@RequestBody Contact contact) {
        contactRepository.save(contact);
        return new ResponseEntity<>("OK", HttpStatus.OK);
    }

    @GetMapping("/api/test")
    public String test() {
        return "Hello World!!!";
    }
}
