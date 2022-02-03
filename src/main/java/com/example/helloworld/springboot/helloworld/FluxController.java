package com.example.helloworld.springboot.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class FluxController {

    @GetMapping("/flux")
    public Flux<String> getFluxData() {
        return Flux.just("Palani" , "Uma", "Laya" );
    }
}
