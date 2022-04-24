package com.flightreservation.entity;

import com.flightreservation.entity.abstracts.IAbroad;
import com.flightreservation.entity.abstracts.Plane;

import javax.persistence.Entity;

@Entity
public class AnadoluJet extends Plane implements IAbroad {

    public AnadoluJet() {

    }
    public AnadoluJet(int capacity, int fare) {
        super(capacity, fare);
    }


    @Override
    public String foodChoice() {
        return "Yurtdışı uçuşu olduğu için uçağımızda yemek seçme hakkına sahipsiniz";
    }

}
