package com.twettero.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twettero.api.dto.TweetDTO;
import com.twettero.api.model.Tweet;
import com.twettero.api.service.TweetService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tweets")
public class TweetController {
  
  @Autowired
  private TweetService service;

  @GetMapping
  public List<Tweet> list(Pageable page) {
    PageRequest pr = PageRequest.of(0, 5);
    Page<Tweet> data = service.findAll(pr);
    return data.getContent();
  }

  @GetMapping("/{username}") 
  public List<Tweet> listByName(@PathVariable String username) {
    return service.findByName(username);
  }

  @PostMapping
  public void create(@RequestBody @Valid TweetDTO req) {
    service.save(req);
  }

}
