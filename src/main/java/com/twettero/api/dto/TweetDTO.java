package com.twettero.api.dto;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public record TweetDTO(
  
  @NotNull String username,

  @NotNull @Pattern(regexp = "\\b(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]") String avatar,

  @NotNull String tweet

  ) { 
}
