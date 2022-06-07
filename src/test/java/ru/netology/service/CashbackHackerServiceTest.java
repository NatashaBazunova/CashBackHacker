package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackerServiceTest {

    @Test
    public void shouldShowRemainFrom900() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 900;
        int expected = 100;
        int actual = service.remain(900);
        assertEquals(100, 100);
    }
    @Test
    public void shouldShowRemainFrom500() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 500;
        int expected = 500;
        int actual = service.remain(500);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowRemainFrom100() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 100;
        int expected = 900;
        int actual = service.remain(100);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowRemainFrom1100() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1100;
        int expected = 900;
        int actual = service.remain(1100);
        assertEquals(actual, expected);
    }
    @Test
    public void shouldShowRemainFrom1000() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1000;
        int expected = 0;
        int actual = service.remain(1000);
        assertEquals(actual, expected);
    }

    @Test
    public void shouldShowRemainFrom999() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 999;
        int expected = 1;
        int actual = service.remain(999);
        assertEquals(actual, expected);
    }
    @Test
    public void shouldShowRemainFrom3999() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 3999;
        int expected = 1;
        int actual = service.remain(3999);
        assertEquals(actual, expected);
    }
    @Test
    public void shouldShowRemainFrom1() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 1;
        int expected = 999;
        int actual = service.remain(1);
        assertEquals(actual, expected);
    }
    @Test
    public void shouldShowRemainFrom0() {
        CashbackHackerService service = new CashbackHackerService();
        int amount = 0;
        int expected = 1000;
        int actual = service.remain(0);
        assertEquals(actual, expected);
    }

}