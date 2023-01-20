package com.twettero.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twettero.api.model.Tweet;

public interface TweetRepository extends JpaRepository<Tweet, Long> {

}
