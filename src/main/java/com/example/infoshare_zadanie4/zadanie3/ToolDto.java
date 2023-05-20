package com.example.infoshare_zadanie4.zadanie3;

import java.util.List;

public class ToolDto {
    private String name;
    private float size;
    private String unit;
    private List<String> activities;


    public ToolDto(String name, float size, String unit, List<String> activities) {
        this.name = name;
        this.size = size;
        this.unit = unit;
        this.activities = activities;
    }

    public ToolDto() {
    }

    public String getName() {
        return name;
    }

    public List<String> getActivities() {

        return activities;
    }


    public void setActivities(List<String> activities) {
        this.activities = activities;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
}
