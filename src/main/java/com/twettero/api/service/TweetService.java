package com.twettero.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import com.twettero.api.dto.TweetDTO;
import com.twettero.api.model.Tweet;
import com.twettero.api.repository.TweetRepository;

@Service
public class TweetService {
  
  @Autowired
  private TweetRepository repository;

  public Page<Tweet> findAll(PageRequest page) {
    return repository.findAll(page);
  }

  public List<Tweet> findByName(String username) {
    return repository.findByUsername(username);
  }

  public Tweet save(TweetDTO dto, String avatar) {
    return repository.save(new Tweet(dto, avatar));
  }

}
