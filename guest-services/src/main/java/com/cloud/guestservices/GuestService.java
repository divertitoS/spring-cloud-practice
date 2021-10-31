package com.cloud.guestservices;

import org.springframework.stereotype.Service;

import java.util.*;

public interface GuestService {
    Iterable<Guest> getAllGuests();

    Guest findGuestById(Long id);
}
