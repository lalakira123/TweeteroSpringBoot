package com.twettero.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.twettero.api.dto.SignInDTO;
import com.twettero.api.service.SignInService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/auth/sign-up")
public class SignInController {
  
  @Autowired
  private SignInService service; 

  @PostMapping
  public ResponseEntity<String> create(@RequestBody @Valid SignInDTO req) {
    service.save(req);
    return ResponseEntity.status(HttpStatus.OK).body("Ok!");
  }

}
