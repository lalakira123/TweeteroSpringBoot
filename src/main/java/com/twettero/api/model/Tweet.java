package com.twettero.api.model;

import com.twettero.api.dto.TweetDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Tweet {
  
  public Tweet(TweetDTO data, String avatar) {
    this.username = data.username();
    this.avatar = avatar;
    this.tweet = data.tweet();
  }

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private Long id;

  @Column(length = 50, nullable = false)
  private String username;

  @Column(length = 150, nullable = false)
  private String avatar;

  @Column(length = 150, nullable = false)
  private String tweet;

}
