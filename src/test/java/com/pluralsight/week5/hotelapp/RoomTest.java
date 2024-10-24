package com.pluralsight.week5.hotelapp;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RoomTest {

    @Test
    void checkIn_successful() {
        //arrange
        Room room = new Room(2, 100, false, false);
        // act
        room.checkIn();
        //assert
        assertTrue(room.isOccupied());
        assertTrue(room.isDirty());
    }

    @Test
    void checkIn_dirtyRoom_failure() {
        //arrange
        Room room = new Room(2, 100, false, true);
        // act (should fail)
        room.checkIn();
        //assert
        assertFalse(room.isOccupied());
    }

    @Test
    void checkIn_occupiedRoom_failure() {
        //arrange
        Room room = new Room(2, 100, true, false);
        // act (should fail)
        boolean success = room.checkIn();
        //assert
        assertFalse(success);
    }

    @Test
    void checkout_occupiedRoom_successful() {
        //arrange
        Room room = new Room(2, 100, true, true);
        // act
        room.checkout();
        //assert
        assertFalse(room.isOccupied());
    }

    @Test
    void checkout_availableRoom_failure() {
        //arrange
        Room room = new Room(2, 100, false, false);
        // act and assert
        assertThrows(IllegalStateException.class, () -> room.checkout());
    }

    @Test
    void cleanRoom_dirtyRoom_successful() {
        //arrange
        Room room = new Room(2, 100, false, true);
        // act
        room.cleanRoom();
        //assert
        assertFalse(room.isDirty());
    }


}