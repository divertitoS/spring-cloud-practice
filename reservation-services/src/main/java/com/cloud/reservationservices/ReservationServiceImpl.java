package com.cloud.reservationservices;

import org.springframework.stereotype.Service;

@Service
public class ReservationServiceImpl implements ReservationService {
    private final ReservationRepository repository;

    public ReservationServiceImpl(ReservationRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Reservation> getAllReservation() {
        return repository.findAll();
    }

    @Override
    public Reservation findReservationById(Long id) {
        return repository.findById(id).get();
    }
}
