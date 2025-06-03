package com.cursoinglesback.cursoinglesbackend.dtos;

public class SolarDataDto {

    private double uvIndex;
    private double temperature;
    private String location;
    private String formattedTimestamp; // ← aquí lo formateado
    
    public SolarDataDto() {
    }

    public SolarDataDto(double uvIndex, double temperature, String location, String formattedTimestamp) {
        this.uvIndex = uvIndex;
        this.temperature = temperature;
        this.location = location;
        this.formattedTimestamp = formattedTimestamp;
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

    public String getFormattedTimestamp() {
        return formattedTimestamp;
    }

    public void setFormattedTimestamp(String formattedTimestamp) {
        this.formattedTimestamp = formattedTimestamp;
    }

}
