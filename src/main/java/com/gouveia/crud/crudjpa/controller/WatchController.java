package com.gouveia.crud.crudjpa.controller;

import com.gouveia.crud.crudjpa.model.Watch;
import com.gouveia.crud.crudjpa.service.WatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/watch")
public class WatchController {
    @Autowired
    WatchService watchService;

    @GetMapping
    String ping(){
        return "pong";
    }

    @PostMapping("")
    public String createWatch(@RequestBody Watch watch){
        String create = watchService.postWatch(watch);
        return create;
    }

}
