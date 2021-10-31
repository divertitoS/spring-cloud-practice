package com.cloud.roomservices;

import org.springframework.stereotype.Service;

@Service
public class RoomServiceImpl implements RoomService {
    private final RoomRepository repository;

    public RoomServiceImpl(RoomRepository repository) {
        this.repository = repository;
    }

    @Override
    public Iterable<Room> getAllRooms() {
        return repository.findAll();
    }

    @Override
    public Room findRoomById(Long id) {
        return repository.findById(id).get();
    }
}
