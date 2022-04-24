package com.flightreservation.entity;

import com.flightreservation.entity.abstracts.IBusiness;
import com.flightreservation.entity.abstracts.Plane;

import javax.persistence.Entity;

@Entity
public class Pegasus extends Plane implements IBusiness {



    private int businessPassengerCount = 0;

    public Pegasus(int capacity, int fare ,int businessCount) {
        super(capacity, fare);

        super.businessCapacity = businessCount;
    }

    public Pegasus() {

    }


    @Override
    public int takeBusinessTicket(int countPerson) {
        if(super.businessCapacity < countPerson || !super.isCapacity(countPerson)){
            return -1;
        }
        this.businessPassengerCount += countPerson;
        super.businessCapacity -= countPerson;
        super.passengerCount -= countPerson;

        int businessFare = 500;
        int ticketFare = businessFare * countPerson + super.fare * countPerson;
        return ticketFare;
    }

    public int getBusinessCapacity() {
        return businessCapacity;
    }

    public void setBusinessCapacity(int businessCapacity) {
        this.businessCapacity = businessCapacity;
    }

    public int getBusinessPassengerCount() {
        return businessPassengerCount;
    }

    public void setBusinessPassengerCount(int businessPassengerCount) {
        this.businessPassengerCount = businessPassengerCount;
    }
}
