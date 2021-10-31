package com.cloud.guestservices;

import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class GuestServiceImpl implements GuestService {
    private final GuestRepository repository;

    public GuestServiceImpl(GuestRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Guest> getAllGuests() {
        return repository.findAll();
    }

    @Override
    public Guest findGuestById(Long id) {
        return repository.findById(id).get();
    }
}
