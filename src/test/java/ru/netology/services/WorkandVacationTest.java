package ru.netology.services;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.swing.*;

public class WorkandVacationTest {
    @Test
    public void testCase1() {
        WorkandVacationService service= new WorkandVacationService();

        int actual = service.calculate(10000, 3000, 20000 );
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCase2() {
        WorkandVacationService service= new WorkandVacationService();

        int actual = service.calculate(100000, 60000, 150000 );
        int expected = 2;

        Assertions.assertEquals(expected, actual);

    }
}
