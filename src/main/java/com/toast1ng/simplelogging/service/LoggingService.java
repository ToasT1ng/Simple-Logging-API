package com.toast1ng.simplelogging.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class LoggingService {
    public void loggingTest(){
        log.info("test logging");
    }

    public void loggingLoop(String msg, int loopTimes, int term) throws InterruptedException {
        for (int i=0 ; i<loopTimes; i++) {
            log.info(msg);
            Thread.sleep((long) term * 1000);
        }
    }
}
