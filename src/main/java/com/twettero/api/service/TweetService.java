package com.twettero.api.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
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

  public Tweet save(TweetDTO dto) {
    return repository.save(new Tweet(dto));
  }

}
