package com.toast1ng.simplelogging.controller;

import com.toast1ng.simplelogging.service.LoggingService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class LoggingController {
    @Resource
    private LoggingService loggingService;

    @PostMapping("/test")
    public ResponseEntity loggingTest(){
        loggingService.loggingTest();
        return new ResponseEntity("success\n", HttpStatus.OK);
    }

    @PostMapping("/loop")
    public ResponseEntity loggingLoop(@RequestParam String msg, @RequestParam int loopTimes, @RequestParam int term) throws InterruptedException {
        loggingService.loggingLoop(msg, loopTimes, term);
        return new ResponseEntity("success\n", HttpStatus.OK);
    }
}