/*
Name: Harrison Tinley
Date: 4/17/2026

Class Name: TestJUnit
Description: this is where all the methods from the TestingRecursion class are tested using JUnit

*/

import org.junit.Test;
import static org.junit.Assert.*;

public class TestJUnit {
    
    // count8 tests
    @Test
    public void testCount8_1() {
        assertEquals(4, TestingRecursion.count8(8188));
    }

    @Test
    public void testCount8_2() {
        assertEquals(6, TestingRecursion.count8(88188));
    }

    @Test
    public void testCount8_3() {
        assertEquals(0, TestingRecursion.count8(0));
    }

    @Test
    public void testCount8_4() {
        assertEquals(5, TestingRecursion.count8(888));
    }

    @Test
    public void testCount8_5() {
        assertEquals(0, TestingRecursion.count8(1645));
    }

    // countHi tests

    @Test
    public void test_countHi_1() {
        assertEquals(0, TestingRecursion.countHi(""));
    }

    @Test
    public void test_countHi_2() {
        assertEquals(2, TestingRecursion.countHi("xhixhi"));
    }

    @Test
    public void test_countHi_3() {
        assertEquals(3, TestingRecursion.countHi("hihihi"));
    }

    @Test
    public void test_countHi_4() {
        assertEquals(2, TestingRecursion.countHi("ahibhi"));
    }

    @Test
    public void test_countHi_5() {
        assertEquals(1, TestingRecursion.countHi("hainhbihi"));
    }

    // countHi2 tests
    @Test
    public void test_countHi2_1() {
        assertEquals(0, TestingRecursion.countHi2(""));
    }

    @Test
    public void test_countHi2_2() {
        assertEquals(0, TestingRecursion.countHi2("xhixhi"));
    }

    @Test
    public void test_countHi2_3() {
        assertEquals(3, TestingRecursion.countHi2("hihihi"));
    }

    @Test
    public void test_countHi2_4() {
        assertEquals(2, TestingRecursion.countHi2("ahibhi"));
    }

    @Test
    public void test_countHi2_5() {
        assertEquals(1, TestingRecursion.countHi2("hainhbihi"));
    }


    // strCount tests
    @Test
    public void testStrCount_1() {
        assertEquals(2, TestingRecursion.strCount("catcowcat", "cat"));
    }

    @Test
    public void testStrCount_2() {
        assertEquals(0, TestingRecursion.strCount("catcowcat", "dog"));
    }

    @Test
    public void testStrCount_3() {
        assertEquals(3, TestingRecursion.strCount("cowcowcow", "cow"));
    }

    @Test
    public void testStrCount_4() {
        assertEquals(1, TestingRecursion.strCount("abcdefghijklmnopqrstuvwxyz", "abcdefghijklmnopqrstuvwxyz"));
    }

    @Test
    public void testStrCount_5() {
        assertEquals(6, TestingRecursion.strCount("hahahahahaha", "ha"));
    }

    // stringClean tests

    @Test
    public void test_stringClean_1() {
        assertEquals("james_T", TestingRecursion.stringClean("jjaammeess__TT"));
    }

    @Test
    public void test_stringClean_2() {
        assertEquals("a", TestingRecursion.stringClean("aaaa"));
    }

    @Test
    public void test_stringClean_3() {
        assertEquals("", TestingRecursion.stringClean(""));
    }

    @Test
    public void test_stringClean_4() {
        assertEquals("helo", TestingRecursion.stringClean("hello"));
    }

    @Test
    public void test_stringClean_5() {
        assertEquals("abaxzxz", TestingRecursion.stringClean("aaaaaaaaaaaaaaaaaaaaaabbaaaaxzxz"));
    }
}
