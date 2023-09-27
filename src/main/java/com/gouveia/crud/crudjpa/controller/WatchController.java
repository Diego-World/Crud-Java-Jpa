package com.gouveia.crud.crudjpa.controller;

import com.gouveia.crud.crudjpa.model.Watch;
import com.gouveia.crud.crudjpa.service.WatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

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

    @PostMapping(value = "",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String createWatch(@RequestBody Watch watch){
        String create = watchService.postWatch(watch);
        return create;
    }

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Watch> getWatchById(@PathVariable Long id) {
        Optional<Watch> watch = watchService.findWatchById(id);
        return new ResponseEntity<>(watch.get(), HttpStatus.OK);

    }

}
