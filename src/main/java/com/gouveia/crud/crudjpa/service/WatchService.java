package com.gouveia.crud.crudjpa.service;

import com.gouveia.crud.crudjpa.model.Watch;
import com.gouveia.crud.crudjpa.repository.WatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WatchService {
    @Autowired
    WatchRepository watchRepository;

    //CREATE, READ, UPDATE AND DELETE
    String postWatch(Watch watch){
        Watch w = new Watch();
        w.setBrand(watch.getBrand());
        w.setPrice(watch.getPrice());
        w.setProductName(watch.getProductName());
        watchRepository.save(w.getId());
        return "Product save sucessfuly";
    }

}
