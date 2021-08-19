package com.toast1ng.simplelogging.controller;

import com.toast1ng.simplelogging.service.LoggingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoggingController {
    @Resource
    private LoggingService loggingService;

    @PostMapping("/default")
    public ResponseEntity defaultLogging(){
        loggingService.defaultLogging();
        return new ResponseEntity("success\n", HttpStatus.OK);
    }
}
