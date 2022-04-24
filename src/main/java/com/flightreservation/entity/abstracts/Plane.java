package com.flightreservation.entity.abstracts;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table
@Data

public abstract class Plane {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private int capacity;

    @Column
    protected int fare;

    @Column
    protected int passengerCount = 0;

    @Column
    protected int businessCapacity;

    public Plane(int capacity, int fare) {
        this.capacity = capacity;
        this.fare = fare;
    }

    public Plane() {

    }

    public int takeTicket(int countPerson){
        if (!this.isCapacity(countPerson)){
            return -1;
        }

        int ticketFare = countPerson * fare;
        increasePassengerCount(countPerson);

        return ticketFare;
    }
    public boolean isCapacity(int passengerCount){

        return capacity >= this.passengerCount + passengerCount;
    }

    public void increasePassengerCount(int countPerson){
        this.passengerCount += countPerson;
    }
}
