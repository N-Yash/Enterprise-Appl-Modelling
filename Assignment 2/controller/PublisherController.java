package com.assignment2.library.controller;

import com.assignment2.library.model.Publisher;
import com.assignment2.library.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/publishers")
public class PublisherController {
    @Autowired private PublisherRepository publisherRepository;

    @PostMapping
    public Publisher create(@RequestBody Publisher publisher) {
        return publisherRepository.save(publisher);
    }

    @GetMapping
    public List<Publisher> getAll() {
        return publisherRepository.findAll();
    }

    @GetMapping("/{id}")
    public Publisher getById(@PathVariable Long id) {
        return publisherRepository.findById(id).orElse(null);
    }
}
