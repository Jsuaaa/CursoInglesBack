package com.cursoinglesback.cursoinglesbackend.controllers;

import java.time.format.DateTimeFormatter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cursoinglesback.cursoinglesbackend.dtos.SolarDataDto;
import com.cursoinglesback.cursoinglesbackend.entities.SolarData;
import com.cursoinglesback.cursoinglesbackend.services.SensorService;

@RestController
@RequestMapping("/api/sensor")
@CrossOrigin(origins = "*") // Para permitir acceso desde Angular
public class SolarInformationController {

    @Autowired
    private SensorService service;

    @GetMapping("/latest")
    public SolarDataDto getLatestData() {
    SolarData data = service.getLatestData();
    if (data == null) return null;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
    String timestamp = data.getTimestamp().format(formatter);

    return new SolarDataDto(
        data.getUvIndex(),
        data.getTemperature(),
        data.getLocation(),
        timestamp
    );
    }

    @PostMapping("/data")
    public SolarData receiveData(@RequestBody SolarData data) {
        return service.saveData(data);
    }

}

