package test;

import Urinals.urinals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class urinalsTest {
    @Test
    void test() {
        System.out.println("======= Rahul Ghanghas ==== TEST ONE EXECUTED =======");
        assertTrue(urinals.goodString("100001"));
        System.out.println("======= Rahul Ghanghas ==== TEST TWO EXECUTED =======");
        assertTrue(urinals.goodString("100011"));
        System.out.println("======= Rahul Ghanghas ==== TEST THREE EXECUTED =======");
        assertEquals(1, urinals.countUrinals("10001"));
    }
}
