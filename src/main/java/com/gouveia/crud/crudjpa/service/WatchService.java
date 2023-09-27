package com.gouveia.crud.crudjpa.service;

import com.gouveia.crud.crudjpa.model.Watch;
import com.gouveia.crud.crudjpa.repository.WatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class WatchService {
    @Autowired
    WatchRepository watchRepository;

    //CREATE, READ, UPDATE AND DELETE
    public String postWatch(Watch watch){
        Watch w = new Watch();
        w.setBrand(watch.getBrand());
        w.setPrice(watch.getPrice());
        w.setProductName(watch.getProductName());
        watchRepository.save(w);
        return "Product save sucessfully";
    }

    public Optional<Watch> findWatchById(Long id) {
        return watchRepository.findById(id);
    }
}
