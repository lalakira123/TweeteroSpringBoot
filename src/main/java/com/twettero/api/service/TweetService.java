package com.twettero.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twettero.api.dto.TweetDTO;
import com.twettero.api.model.Tweet;
import com.twettero.api.repository.TweetRepository;

@Service
public class TweetService {
  
  @Autowired
  private TweetRepository repository;

  public Tweet save(TweetDTO dto) {
    return repository.save(new Tweet(dto));
  }

}
