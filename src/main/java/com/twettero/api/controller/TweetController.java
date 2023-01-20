package com.twettero.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twettero.api.dto.TweetDTO;
import com.twettero.api.service.TweetService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/tweets")
public class TweetController {
  
  @Autowired
  private TweetService service;

  @PostMapping
  public void create(@RequestBody @Valid TweetDTO req) {
    service.save(req);
  }

}
