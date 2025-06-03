package com.cursoinglesback.cursoinglesbackend.dtos;

public class SolarDataDto {

    private double uvIndex;
    private double temperature;
    private String location;
    private String timestamp; // ← aquí lo formateado
    
    public SolarDataDto() {
    }

    public SolarDataDto(double uvIndex, double temperature, String location, String timestamp) {
        this.uvIndex = uvIndex;
        this.temperature = temperature;
        this.location = location;
        this.timestamp = timestamp;
    }

    public double getUvIndex() {
        return uvIndex;
    }

    public void setUvIndex(double uvIndex) {
        this.uvIndex = uvIndex;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

}
