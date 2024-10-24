package com.pluralsight.week5.hotelapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class EmployeeTest {
    @Test
    void punchIn() {
        // arrange
        Employee employee = new Employee(1, "Cesar", "IT", 20, 20);

        // act
        employee.punchIn(17);

        // assert
        assertEquals(17, employee.getLatestPunchIn());
        assertTrue(employee.isCurrentlyWorking());
    }

    @Test
    void punchOut_notCurrentlyWorking_return0() {
        // arrange
        Employee employee = new Employee(1, "Cesar", "IT", 20, 20);

        // act
        double hoursLatestShift = employee.punchOut(17);

        // assert
        assertEquals(0, hoursLatestShift);
    }

    @Test
    void punchOut_currentlyWorking() {
        // arrange
        Employee employee = new Employee(1, "Cesar", "IT", 20, 20);
        employee.punchIn(17);

        // act
        double hoursLatestShift = employee.punchOut(22);

        // assert
        assertEquals(5, hoursLatestShift);
        assertEquals(25, employee.getHoursWorked());
        assertFalse(employee.isCurrentlyWorking());
    }
}
