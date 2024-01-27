package com.example.multimodule.controller;


import com.claim.ClaimController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.SecureRandom;

@RestController
@RequestMapping("test")
public class TestController {
    @GetMapping
    public synchronized ResponseEntity<ClaimController> get(){
        SecureRandom random= new SecureRandom();
        ClaimController controller = new ClaimController("dinhnguyendev");
        return ResponseEntity.ok().body(controller);
    }

}
