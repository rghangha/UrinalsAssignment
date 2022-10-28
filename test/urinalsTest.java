package test;

import Urinals.urinals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class urinalsTest {
    @Test
    void test() {
        System.out.print("======= Rahul Ghanghas ==== TEST ONE EXECUTED =======");
        assertTrue(urinals.goodString("100001"));
        System.out.print("======= Rahul Ghanghas ==== TEST TWO EXECUTED =======");
        assertTrue(urinals.goodString("100_11"));
    }
}
