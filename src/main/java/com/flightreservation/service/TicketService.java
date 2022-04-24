package com.flightreservation.service;

import com.flightreservation.entity.abstracts.IBusiness;
import com.flightreservation.entity.abstracts.Plane;
import com.flightreservation.exception.NoEmptySeatException;
import org.springframework.stereotype.Service;

@Service
public class TicketService {

    public void takeTicketForPassenger(Plane plane, int countPerson){

        int takeTicketFare = plane.takeTicket(countPerson);
        if(takeTicketFare == -1){
            throw new NoEmptySeatException("yeterli yer bulunmamaktadir");


        }
        System.out.println("Total fare: " + takeTicketFare);


    }

    public void takeBusinessTicketForPassenger(IBusiness plane  , int countPerson){
        int ticketFare = plane.takeBusinessTicket(countPerson);
        if(ticketFare == -1){
            System.out.println("Yeterli Yer Bulunmamaktadir");
            return;
        }
        System.out.println("Total fare: " + ticketFare);
    }
}
