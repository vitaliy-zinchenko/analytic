package com.epam.dto;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

public class TrackDto {

    private String url;

    @JsonFormat(pattern="yyyy-MM-dd")
    @DateTimeFormat(iso = DateTimeFormat.ISO.TIME)
    private LocalDateTime date;

    public String getUrl() {
        return url;
    }

    public TrackDto setUrl(String url) {
        this.url = url;
        return this;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public TrackDto setDate(LocalDateTime date) {
        this.date = date;
        return this;
    }
}
