package com.flightreservation.controller;


import com.flightreservation.dao.PlaneRepository;
import com.flightreservation.dto.request.PlaneRequestDto;
import com.flightreservation.entity.THY;
import com.flightreservation.entity.abstracts.Plane;
import com.flightreservation.service.PlaneService;
import com.flightreservation.service.TicketService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flight")
public class PlaneController {

    @Autowired
    TicketService ticketService;
    @Autowired
    PlaneService planeService;

    @GetMapping("/")
    public List<Plane> getAll(){
        return planeService.getAll();
    }

    @PostMapping("/add/thy")
    public Plane addNewThyPlane(@RequestBody PlaneRequestDto planeRequestDto){
        return planeService.addNewTHYPlane(planeRequestDto);
    }
    @PostMapping("/add/pegasus")
    public Plane addNewPegasusPlane(@RequestBody PlaneRequestDto planeRequestDto){
        return planeService.addNewPegasusPlane(planeRequestDto);
    }
    @PostMapping("/add/anadoluJet")
    public Plane addNewAnadoluJetPlane(@RequestBody PlaneRequestDto planeRequestDto){
        return planeService.addNewAnadoluJetPlane(planeRequestDto);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletePlaneById(@PathVariable Long id){
        planeService.deletePlaneById(id);
        return new ResponseEntity<>("deleted", HttpStatus.OK);
    }

}
