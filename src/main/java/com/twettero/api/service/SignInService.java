package com.twettero.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.twettero.api.dto.SignInDTO;
import com.twettero.api.model.SignIn;
import com.twettero.api.repository.SignInRepository;

@Service
public class SignInService {
  
  @Autowired
  private SignInRepository repository;

  public SignIn findAvatar(String username) {
    return repository.findByUsername(username).get(0);
  }

  public SignIn save(SignInDTO dto) {
    return repository.save(new SignIn(dto));
  }

}
