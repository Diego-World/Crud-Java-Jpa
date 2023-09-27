package com.gouveia.crud.crudjpa.controller;

import com.gouveia.crud.crudjpa.model.Watch;
import com.gouveia.crud.crudjpa.service.WatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@CrossOrigin("*")
@RequestMapping(value = "/watch")
public class WatchController {
    @Autowired
    WatchService watchService;

    // CREATE
    @PostMapping(value = "",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String createWatch(@RequestBody Watch watch){
        String create = watchService.postWatch(watch);
        return create;
    }
    // READ BY ID

    @GetMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<Watch> getWatchById(@PathVariable Long id) {
        Optional<Watch> watch = watchService.findWatchById(id);
        return new ResponseEntity<>(watch.get(), HttpStatus.OK);
    }
    // READ ALL

    @GetMapping(value = "",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public ResponseEntity<List<Watch>> getAll(){
        List<Watch> watche = watchService.findAll();
        return new ResponseEntity<>(watche,HttpStatus.OK);
    }
    // UPDATE

    @PutMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String putWatch(@PathVariable Long id, Watch watch){
        String putWatch = watchService.updateWatch(id, watch);
        return putWatch;
    }

    @DeleteMapping(value = "/{id}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String deleteWatch(@PathVariable Long id){
        String putWatch = watchService.deleteWatch(id);
        return putWatch;
    }
}
