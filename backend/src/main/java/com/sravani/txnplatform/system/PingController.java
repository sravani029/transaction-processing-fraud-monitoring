package com.sravani.txnplatform.system;

import java.time.Clock;
import java.time.Instant;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PingController {

    private final String serviceName;

    public PingController(@Value("${spring.application.name}") String serviceName) {
        this.serviceName = serviceName;
    }

    @GetMapping("/ping")
    public PingResponse ping() {
        return new PingResponse("UP", serviceName, Instant.now(Clock.systemUTC()));
    }
}