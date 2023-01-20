package com.twettero.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.twettero.api.model.SignIn;

public interface SignInRepository extends JpaRepository<SignIn, Long> {
}
