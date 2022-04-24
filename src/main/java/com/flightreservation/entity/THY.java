package com.flightreservation.entity;

import com.flightreservation.entity.abstracts.IPackage;
import com.flightreservation.entity.abstracts.Plane;
import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table
@Data
public class THY extends Plane  implements IPackage {

    public THY() {

    }

    public THY(int capacity, int fare) {
        super(capacity, fare);
    }




    @Override
    public String extraPackage() {
        return "THY yolculari extra Bagaj hakkına sahiptir";
    }

}
