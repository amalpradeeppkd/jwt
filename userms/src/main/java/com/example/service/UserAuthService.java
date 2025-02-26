package com.example.service;

import com.example.dto.UserAuthDTO;
import org.springframework.http.ResponseEntity;

public interface UserAuthService {
    public ResponseEntity<?> getAllUserAuth();
    public ResponseEntity<?> getUserAuthById(int id);
    public ResponseEntity<?> createUserAuth(UserAuthDTO userAuthDTO);
    public ResponseEntity<?> updateUserAuth(int id,UserAuthDTO userAuthDTO);
    public ResponseEntity<?> deleteUserAuth(int id);

}