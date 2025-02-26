package com.example.service;

import com.example.dto.ApiResponse;
import com.example.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service

public class UserDetailsServiceImpl implements UserDetailsService{
    @Autowired
    private UserDetailsRepository userDetailsRepository;


    @Override
    public ResponseEntity<?> getAllUserDetails() {
        return ResponseEntity.ok().body(new ApiResponse(true, HttpStatus.OK.value(),userDetailsRepository.findAll()));
    }

    @Override
    public ResponseEntity<?> getUserDetailsById(int id) {
        return ResponseEntity.ok().body(new ApiResponse(true, HttpStatus.OK.value(),userDetailsRepository.findById(id)));
    }
}
