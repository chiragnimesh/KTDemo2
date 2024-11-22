package com.example.demo.classes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.jupiter.api.Test;

class ATest {

    @Test
    void testAdd() {
        A a = new A();
        assertEquals(5, a.add(2, 3), "Addition of 2 and 3 should be 5");
        assertEquals(0, a.add(2, -2), "Addition of 2 and -2 should be 0");
        assertEquals(-5, a.add(-3, -2), "Addition of -3 and -2 should be -5");
    }

    @Test
    void testSubstract() {
        A a = new A();
        assertEquals(1, a.substract(3, 2), "Subtraction of 3 and 2 should be 1");
        assertEquals(4, a.substract(2, -2), "Subtraction of 2 and -2 should be 4");
        assertEquals(-1, a.substract(-3, -2), "Subtraction of -3 and -2 should be -1");
    }

    @Test
    void testMultiply() {
        A a = new A();
        assertEquals(6, a.multiply(2, 3), "Multiplication of 2 and 3 should be 6");
        assertEquals(-4, a.multiply(2, -2), "Multiplication of 2 and -2 should be -4");
        assertEquals(6, a.multiply(-3, -2), "Multiplication of -3 and -2 should be 6");
    }
    
    @Test
    void testFilterEvenNumber() {
        A a = new A();

        // Test case 1: Mixed numbers
        List<Integer> input1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> expected1 = Arrays.asList(2, 4, 6);
        assertEquals(expected1, a.filterEvenNumber(input1), "Should return only even numbers");

        // Test case 2: All odd numbers
        List<Integer> input2 = Arrays.asList(1, 3, 5, 7);
        List<Integer> expected2 = Collections.emptyList();
        assertEquals(expected2, a.filterEvenNumber(input2), "Should return an empty list for all odd numbers");

        // Test case 3: All even numbers
        List<Integer> input3 = Arrays.asList(2, 4, 6, 8);
        List<Integer> expected3 = input3;
        assertEquals(expected3, a.filterEvenNumber(input3), "Should return the same list for all even numbers");

        // Test case 4: Empty list
        List<Integer> input4 = Collections.emptyList();
        List<Integer> expected4 = Collections.emptyList();
        assertEquals(expected4, a.filterEvenNumber(input4), "Should return an empty list for an empty input");

        // Test case 5: List with zero
        List<Integer> input5 = Arrays.asList(0, 1, 2, 3);
        List<Integer> expected5 = Arrays.asList(0, 2);
        assertEquals(expected5, a.filterEvenNumber(input5), "Should include zero as an even number");
    }
    
    @Test
    void stringLength() {
    	A a=new A();
    	List<String> s=List.of("Chirag","Nimesh","Abhinav","Tarun","Satyam");
    	List<Integer> l=List.of(6,6,7,5,6);
    	assertEquals(l, a.stringToLength(s));
    }
    
    
    @Test
    void filterString() {
    	A a=new A();
    	List<String> s=List.of("Chirag","Nimesh","Abhinav","Tarun","Satyam");
    	List<String> l=List.of("Tarun");
    	assertEquals(l, a.filterString(s));
    	
    }
    
    @Test
    void doubleValue() {
    	A a=new A();
    	List<Integer> l=List.of(2,3,4,5,6);
    	List<Integer> expected=List.of(4,6,8,10,12);
    	assertEquals(expected, a.doubleValue(l));
    }
    
    @Test
    void stringSort() {
    	A a=new A();
    	List<String> s=Arrays.asList("Chirag","Nimesh","Abhinav","Tarun","Satyam");
    	List<String> expected=Arrays.asList("Abhinav","Chirag","Nimesh","Satyam","Tarun");
    	assertEquals(expected, a.sortedString(s));
    }
    
    @Test
    void testFilterEvenNumber2() {
        A a = new A();

        // Test case 1: Mixed numbers
        List<Integer> input1 = Arrays.asList(1, 2, 3, 4, 5, 6);
        List<Integer> expected1 = Arrays.asList(2, 4, 6);
        assertEquals(expected1, a.filterEvenNumber2(input1), "Should return only even numbers");

        // Test case 2: All odd numbers
        List<Integer> input2 = Arrays.asList(1, 3, 5, 7);
        List<Integer> expected2 = Collections.emptyList();
        assertEquals(expected2, a.filterEvenNumber2(input2), "Should return an empty list for all odd numbers");

        // Test case 3: All even numbers
        List<Integer> input3 = Arrays.asList(2, 4, 6, 8);
        List<Integer> expected3 = input3;
        assertEquals(expected3, a.filterEvenNumber2(input3), "Should return the same list for all even numbers");

        // Test case 4: Empty list
        List<Integer> input4 = Collections.emptyList();
        List<Integer> expected4 = Collections.emptyList();
        assertEquals(expected4, a.filterEvenNumber2(input4), "Should return an empty list for an empty input");

        // Test case 5: List with zero
        List<Integer> input5 = Arrays.asList(0, 1, 2, 3);
        List<Integer> expected5 = Arrays.asList(0, 2);
        assertEquals(expected5, a.filterEvenNumber2(input5), "Should include zero as an even number");
    }
    
    @Test
    void sumOfSquare()
    {
    	A a=new A();
    	List<Integer> l=List.of(1,2,3,4);
    	int result=30;
    	assertEquals(result, a.sumOfSquare(l));
    }
    
    @Test
    void findMaxMin()
    {
    	A a=new A();
    	List<Integer> l=List.of(1,2,34,56);
    	List<Integer> result=List.of(1,56);
    	assertEquals(result, a.findMaxMin(l));
    }
    
    @Test
    void product() {
    	A a=new A();
    	List<Integer> l=List.of(1,2,3,4);
    	int result=24;
    	assertEquals(result, a.product(l));
    }
    
    @Test
    void flatList() {
    	A a=new A();
    	List<List<Integer>> l=List.of(List.of(1,2,3),List.of(4,5,6),List.of(7,8,9));
    	
    	List<Integer> result=List.of(1,2,3,4,5,6,7,8,9);
    	assertEquals(result, a.flatMap(l));
    }
}