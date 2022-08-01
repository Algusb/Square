package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void testExample() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testEqualDigit() {
        SQRService service = new SQRService();

        int actual = service.calc(200, 200);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testZero() {
        SQRService service = new SQRService();

        int actual = service.calc(0, 0);
        int expected = 0;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testOne() {
        SQRService service = new SQRService();

        int actual = service.calc(400, 401);
        int expected = 1;

        Assertions.assertEquals(expected, actual);

    }

    @Test
    public void testMax() {
        SQRService service = new SQRService();

        int actual = service.calc(100, 9801);
        int expected = 90;

        Assertions.assertEquals(expected, actual);

    }

}
