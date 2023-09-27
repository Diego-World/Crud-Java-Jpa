package com.gouveia.crud.crudjpa.service;

import com.gouveia.crud.crudjpa.repository.WatchRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class WatchService {
    @Autowired
    WatchRepository watchRepository;



}
