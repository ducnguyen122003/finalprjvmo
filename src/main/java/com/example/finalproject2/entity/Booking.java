package com.example.finalproject2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private Date checkInDate;
    private Date checkOutDate;
    private Long roomId;
    private Long userId;
    private boolean confirmed;


    public Booking() {
    }

    public Booking(Date checkInDate, Date checkOutDate, Long roomId, Long userId, boolean confirmed) {
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
        this.roomId = roomId;
        this.userId = userId;
        this.confirmed = confirmed;
    }


}
