package com.gouveia.crud.crudjpa.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/watch")
public class WatchController {
    @GetMapping
    String ping(){
        return "pong";
    }
}
