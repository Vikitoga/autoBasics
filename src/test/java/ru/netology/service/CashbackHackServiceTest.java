package ru.netology.service;

import junit.framework.TestCase;
import org.junit.Test;

public class CashbackHackServiceTest extends TestCase {

    private CashbackHackService cashback = new CashbackHackService();

    @Test
    public void testRemain() {
        int actual = cashback.remain(900);
        int expected = 100;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainLimit() {
        int actual = cashback.remain(1000);
        int expected = 0;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainOverLimit() {
        int actual = cashback.remain(1001);
        int expected = 999;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainUnderLimit() {
        int actual = cashback.remain(999);
        int expected = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void testRemainZero() {
        int actual = cashback.remain(0);
        int expected = 1000;
        assertEquals(expected, actual);
    }
}