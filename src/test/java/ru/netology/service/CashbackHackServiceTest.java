package ru.netology.service;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class CashbackHackServiceTest {
    private final CashbackHackService сashback = new CashbackHackService();

    @Test
    public void shouldTestRemain() {
        int actual = сashback.remain(900);
        int expected = 100;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestLimit() {
        int actual = сashback.remain(1000);
        int expected = 0;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestOverLimit() {
        int actual = сashback.remain(1001);
        int expected = 999;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestUnderLimit() {
        int actual = сashback.remain(999);
        int expected = 1;
        assertEquals(actual, expected);
    }

    @Test
    public void shouldTestZeroAmount() {
        int actual = сashback.remain(0);
        int expected = 1000;
        assertEquals(actual, expected);
    }

 }