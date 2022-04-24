package com.flightreservation.service.impl;

import com.flightreservation.dao.PlaneRepository;
import com.flightreservation.dto.request.PlaneRequestDto;
import com.flightreservation.entity.AnadoluJet;
import com.flightreservation.entity.Pegasus;
import com.flightreservation.entity.THY;
import com.flightreservation.entity.abstracts.Plane;
import com.flightreservation.service.PlaneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaneServiceImpl implements PlaneService {

    @Autowired
    PlaneRepository planeRepository;

    @Override
    public Plane addNewTHYPlane(PlaneRequestDto planeRequestDto) {
        THY thy = new THY(planeRequestDto.getCapacity(), planeRequestDto.getFare());
        return planeRepository.save(thy);
    }

    @Override
    public Plane addNewPegasusPlane(PlaneRequestDto planeRequestDto) {
        Pegasus pegasus = new Pegasus(
                planeRequestDto.getCapacity(),
                planeRequestDto.getFare(),
                planeRequestDto.getBusinessCount()
        );
        return planeRepository.save(pegasus);
    }

    @Override
    public Plane addNewAnadoluJetPlane(PlaneRequestDto planeRequestDto) {
        AnadoluJet anadoluJet = new AnadoluJet(planeRequestDto.getCapacity(), planeRequestDto.getFare());
        return planeRepository.save(anadoluJet);
    }

    @Override
    public void deletePlaneById(Long id) {
        planeRepository.deleteById(id);
    }

    @Override
    public List<Plane> getAll() {
        return (List<Plane>) planeRepository.findAll();
    }


}
