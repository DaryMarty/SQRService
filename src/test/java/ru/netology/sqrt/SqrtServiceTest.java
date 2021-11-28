package ru.netology.sqrt;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class SqrtServiceTest {

    @ParameterizedTest
    @CsvSource (
            value = {"counter within range, 200, 300, 3",
                    "counter out of range min border, 1, 99, 0",
                    "counter out of range max border, 9802, 10000, 0",
                    "counter of range min border, 100, 150, 3",
                    "counter of range max border, 9500, 9801, 2",
                    "counter within range without border, 101, 9800, 88"

    })
    void shouldCount (String test, int minBorder, int maxBorder, int expected) {
        SqrtService service = new SqrtService();

        int actual = service.numberOfSqr (minBorder, maxBorder);

        assertEquals(expected, actual);
    }
}