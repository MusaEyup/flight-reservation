package com.flightreservation.service;

import com.flightreservation.dto.request.PlaneRequestDto;
import com.flightreservation.entity.abstracts.Plane;

import java.util.List;

public interface PlaneService {

    Plane addNewTHYPlane(PlaneRequestDto planeRequestDto);
    Plane addNewPegasusPlane(PlaneRequestDto planeRequestDto);
    Plane addNewAnadoluJetPlane(PlaneRequestDto planeRequestDto);

    void deletePlaneById(Long id);

    List<Plane> getAll();
}
