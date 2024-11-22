package com.example.demo.classes;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

class BTest {

    @Test
    void testPrime() {
        B b = new B();

        // Test prime numbers
        assertTrue(b.prime(2), "2 is a prime number");
        assertTrue(b.prime(3), "3 is a prime number");
        assertTrue(b.prime(7), "7 is a prime number");

        // Test non-prime numbers
        assertFalse(b.prime(4), "4 is not a prime number");
        assertFalse(b.prime(9), "9 is not a prime number");
        assertFalse(b.prime(1), "1 is not a prime number (by definition)");
    }

    @Test
    void testPalindrome() {
        B b = new B();

        // Test palindromes
        assertTrue(b.palindrome(121), "121 is a palindrome");
        assertTrue(b.palindrome(12321), "12321 is a palindrome");
        assertTrue(b.palindrome(1), "1 is a palindrome");

        // Test non-palindromes
        assertFalse(b.palindrome(123), "123 is not a palindrome");
        assertFalse(b.palindrome(100), "100 is not a palindrome");
        assertFalse(b.palindrome(10), "10 is not a palindrome");
    }
}
