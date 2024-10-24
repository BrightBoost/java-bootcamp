package com.pluralsight.week5;

import org.junit.jupiter.api.Test;

import java.security.InvalidParameterException;

import static org.junit.jupiter.api.Assertions.*;

class NameFormatterTest {

    @Test
    void format_firstNameLastName() {
        // arrange
        String firstName = "John";
        String lastName = "Doe";

        // act
        String fullName = NameFormatter.format(firstName, lastName);

        // assert
        assertEquals("Doe, John", fullName);
    }

    //LastName, Prefix FirstName MiddleName, Suffix
    //Johnson, Dr. Mel B, PhD
    @Test
    void format_firstNameLastNameMiddleNamePrefixSuffix() {
        // arrange
        String firstName = "John";
        String lastName = "Doe";
        String middleName = "J";
        String prefix = "Mr.";
        String suffix = "PhD";

        // act
        String fullName = NameFormatter.format(prefix, firstName, middleName, lastName, suffix);

        // assert
        assertEquals("Doe, Mr. John J, PhD", fullName);
    }

    @Test
    void format_fullname_null() {
        // arrange
        String fullName = null;

        // act
        String processedName = NameFormatter.format(fullName);

        // assert
        assertNull(processedName);
    }

    @Test
    void format_fullname_5parts() {
        // arrange
        String fullName = "Dr. Mel B Johnson, PhD";

        // act
        String processedName = NameFormatter.format(fullName);

        // assert
        assertEquals("Johnson, Dr. Mel B, PhD", processedName);
    }

    @Test
    void format_fullname_3parts() {
        // arrange
        String fullName = "Mel B Johnson";

        // act
        String processedName = NameFormatter.format(fullName);

        // assert
        assertEquals("Johnson, Mel B", processedName);
    }

    @Test
    void format_fullname_4parts() {
        // arrange
        String fullName = "Mel B Johnson, PhD";

        // act
        String processedName = NameFormatter.format(fullName);

        // assert
        assertEquals("Johnson, Mel B, PhD", processedName);
    }

    @Test
    void format_fullname_invalidLength() {
        // arrange
        String fullName = "Mel";

        // act & assert
        assertThrows(InvalidParameterException.class, () -> NameFormatter.format(fullName));
    }



}