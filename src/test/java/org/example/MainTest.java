package org.example;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class MainTest {
    @Test
    public void test_Positive() {
        int arr[] = {10, 20, 30, 40, 50};
        assertEquals(50, Main.largest_element(arr));
        assertEquals(10, Main.smallest_element(arr));
    }
    @Test
    public void test_Negative() {
        int arr[] = {-10, -20, -30, -40};
        assertEquals(-10, Main.largest_element(arr));
        assertEquals(-40, Main.smallest_element(arr));
    }
    @Test
    public void test_Zero() {
        int arr[] = {0, 0, 0, 0};
        assertEquals(0, Main.largest_element(arr));
        assertEquals(0, Main.smallest_element(arr));
    }
}