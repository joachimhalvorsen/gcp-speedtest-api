package com.example.gcpspeedtestapi;

        import org.springframework.web.bind.annotation.GetMapping;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class SpeedtestResource {

    public SpeedtestResource() {
    }

    @GetMapping("{name}")
    public String GetHello(@PathVariable("name") String name) {
        return String.format("Hello %s", name);
    }
}