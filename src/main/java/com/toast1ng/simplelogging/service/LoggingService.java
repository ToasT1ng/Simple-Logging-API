package com.toast1ng.simplelogging.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoggingService {
    public void defaultLogging(){
        log.info("default logging");
    }
}
