package com.example.gcpspeedtestapi;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/speedtest")
public class SpeedTestController {

    public SpeedTestController() {
    }

    @PostMapping()
    public String GetHello(@RequestBody TestResult speedTest) {
        return String.format("Hello %s", speedTest.getUser());
    }
}