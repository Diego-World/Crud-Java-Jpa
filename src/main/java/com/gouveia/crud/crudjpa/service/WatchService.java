package com.gouveia.crud.crudjpa.service;

import com.gouveia.crud.crudjpa.model.Watch;
import com.gouveia.crud.crudjpa.repository.WatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
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

    public List<Watch> findAll(){
        return watchRepository.findAll();
    }

    // UPDATE
    public String updateWatch(Long id, Watch updatedWatch) {
        Optional<Watch> existingWatch = watchRepository.findById(id);
        if (existingWatch.isPresent()) {
            Watch w = existingWatch.get();
            w.setBrand(updatedWatch.getBrand());
            w.setPrice(updatedWatch.getPrice());
            w.setProductName(updatedWatch.getProductName());
            watchRepository.save(w);
            return "Product updated successfully";
        } else {
            return "Product not found";
        }
    }

    // DELETE
    public String deleteWatch(Long id) {
        Optional<Watch> existingWatch = watchRepository.findById(id);
        if (existingWatch.isPresent()) {
            watchRepository.deleteById(id);
            return "Product deleted successfully";
        } else {
            return "Product not found";
        }
    }
}
