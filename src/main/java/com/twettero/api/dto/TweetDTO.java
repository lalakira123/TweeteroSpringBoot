package com.twettero.api.dto;

import jakarta.validation.constraints.NotNull;

public record TweetDTO(
  
  @NotNull String username,

  @NotNull String tweet

  ) { 
}
