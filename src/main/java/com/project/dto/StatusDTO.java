package com.project.dto;

import java.time.LocalDateTime;
import java.util.Date;

public class StatusDTO {

    Integer id;
    String name;
    LocalDateTime currentDate;

    public StatusDTO(String name) {
        this.name = name;
        this.currentDate = LocalDateTime.now();
    }

    public StatusDTO(Integer id, String name) {
        this.id = id;
        this.name = name;
        this.currentDate = LocalDateTime.now();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDateTime getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(LocalDateTime currentDate) {
        this.currentDate = currentDate;
    }

    @Override
    public String toString() {
        return "StatusDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", currentDate=" + currentDate +
                '}';
    }
}
