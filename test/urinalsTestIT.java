package test;

import Urinals.urinals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class urinalsTestIT {
    @Test
    void test() {
        System.out.println("======= Rahul Ghanghas ==== TEST ONE EXECUTED =======");
        assertTrue(urinals.goodString("100001"));
        System.out.println("======= Rahul Ghanghas ==== TEST TWO EXECUTED =======");
        assertTrue(urinals.goodString("100011"));
        System.out.println("======= Rahul Ghanghas ==== TEST THREE EXECUTED =======");
        assertEquals(1, urinals.countUrinals("10001"));
        System.out.println("======= Rahul Ghanghas ==== TEST FOUR EXECUTED =======");
        assertEquals(0, urinals.countUrinals("1001"));
        System.out.println("======= Rahul Ghanghas ==== TEST FIVE EXECUTED =======");
        assertEquals(3, urinals.countUrinals("00000"));
        System.out.println("======= Rahul Ghanghas ==== TEST SIX EXECUTED =======");
        assertEquals(1, urinals.countUrinals("01000"));
        System.out.println("======= Rahul Ghanghas ==== TEST SEVEN EXECUTED =======");
        assertEquals(0, urinals.countUrinals("1"));
        System.out.println("======= Rahul Ghanghas ==== TEST EIGHT EXECUTED =======");
        assertEquals(0, urinals.countUrinals("10"));
        System.out.println("======= Rahul Ghanghas ==== TEST NINE EXECUTED =======");
        assertEquals(-1, urinals.countUrinals("110"));
        System.out.println("======= Rahul Ghanghas ==== TEST TEN EXECUTED =======");
        assertEquals(-1, urinals.countUrinals("101100001"));
    }
}
