package com.ai.mind.ops;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class AlertController {
    private static final Logger log = LoggerFactory.getLogger(AlertController.class);


    @PostMapping("/alerts")
    public ResponseEntity<Void> receiveAlert(@RequestBody String payload) {
        log.info("Received alert webhook: {}", "payload");
        String payload1=payload;
        return ResponseEntity.ok().build();
    }
}