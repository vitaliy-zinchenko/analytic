package com.epam.controller;

import java.time.LocalDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.epam.dto.TrackDto;
import com.epam.service.KafkaService;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class TrackController {

    @Autowired
    private ObjectMapper objectMapper;

    @Autowired
    private KafkaService kafkaService;

    @RequestMapping(value="/track", method = RequestMethod.GET)
    public ResponseEntity<Void> track(TrackDto trackDto) throws JsonProcessingException { //TODO handle exception

        trackDto.setDate(LocalDateTime.now());

        kafkaService.send(objectMapper.writeValueAsString(trackDto));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

}
