package com.cloud.reservationservices;

public interface ReservationService {
    Iterable<Reservation> getAllReservation();

    Reservation findReservationById(Long id);
}
