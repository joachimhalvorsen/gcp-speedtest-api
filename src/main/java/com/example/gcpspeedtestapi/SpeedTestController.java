package com.example.gcpspeedtestapi;

import com.google.gson.Gson;
import org.springframework.cloud.gcp.pubsub.core.PubSubTemplate;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/speedtest")
public class SpeedTestController {
    private final PubSubTemplate pubSub;

    public SpeedTestController(PubSubTemplate pubSub) {
        this.pubSub = pubSub;
    }

    @PostMapping()
    public void PostTestResult(@RequestBody TestResult speedTest) {
          Gson gson = new Gson();
          String json = gson.toJson(speedTest);
          this.pubSub.publish("speedtest", json);
    }
}