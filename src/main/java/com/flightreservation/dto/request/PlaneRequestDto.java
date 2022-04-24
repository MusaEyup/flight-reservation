package com.flightreservation.dto.request;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PlaneRequestDto {
    int capacity;
    int fare;
    int businessCount;



}
