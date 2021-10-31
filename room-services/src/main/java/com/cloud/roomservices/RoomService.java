package com.cloud.roomservices;

public interface RoomService {
    Iterable<Room> getAllRooms();

    Room findRoomById(Long id);
}
