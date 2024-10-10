package com.jwt.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController {
    @GetMapping("/demo")
    public ResponseEntity<String> demo(){
        return ResponseEntity.ok("Hello from secured rest end  point");
    }

    @GetMapping("/admin_only")
    public ResponseEntity<String> adminONly(){
        return ResponseEntity.ok("Hello from admin panel");
    }
}
