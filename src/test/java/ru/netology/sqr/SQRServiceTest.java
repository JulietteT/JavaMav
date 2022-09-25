package ru.netology.sqr;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void test() {
        SQRService Service = new SQRService();

        int actual = Service.calculate(200, 300);
        int expected = 3;

        assertEquals(expected, actual);
    }
}








