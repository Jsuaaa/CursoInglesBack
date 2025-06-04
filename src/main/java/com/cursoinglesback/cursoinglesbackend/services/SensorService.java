package com.cursoinglesback.cursoinglesbackend.services;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cursoinglesback.cursoinglesbackend.entities.SolarData;
import com.cursoinglesback.cursoinglesbackend.repositories.SolarDataRepository;

@Service
public class SensorService {

    @Autowired
    private SolarDataRepository repository;

    public SolarData getLatestData() {
        return repository.findFirstByOrderByTimestampDesc();
    }

    public SolarData saveData(SolarData data) {
        data.setTimestamp(LocalDateTime.now());
        return repository.save(data);
    }
}
