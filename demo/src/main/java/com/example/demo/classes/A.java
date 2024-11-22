package com.example.demo.classes;

import java.util.List;
import java.util.Optional;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class A {

	public int add(int a,int b)
	{
		return a+b;
	}
	public int substract(int a,int b)
	{
		return a-b;
	}
	public int multiply(int a,int b)
	{
		return a*b;
	}
	
	public List<Integer> filterEvenNumber(List<Integer> l)
	{
		return l.stream().filter(e->e%2==0).collect(Collectors.toList());
	}
	
	public List<Integer> stringToLength(List<String> s)
	{
		return s.stream().map(e->e.length()).collect(Collectors.toList());
	}
	
	public List<String> filterString(List<String> s)
	{
		return s.stream().filter(e->e.length()>0 && e.length()<6).collect(Collectors.toList());
	}
	
	public List<Integer> doubleValue(List<Integer> l)
	{
		return l.stream().map(e->e*2).collect(Collectors.toList());
	}
	
	public void randomValue() {
		Supplier<Integer> random=()->new Random().nextInt(100)+1; 
		for (int i = 0; i < 5; i++) {
            System.out.println("Random number " + (i + 1) + ": " + random.get());
        }
	}
	
	public List<String> sortedString(List<String> s)
	{
		 s.sort(String::compareTo);
		return s;
	}
	
	public List<Integer> filterEvenNumber2(List<Integer> l)
	{
		return l.stream().filter(e->e%2==0).collect(Collectors.toList());
	}
	public int sumOfSquare(List<Integer> l)
	{
		return l.stream().mapToInt(e->e*e).sum();
		}
	
	public List<Integer> findMaxMin(List<Integer> l)
	{
		int min = l.stream().min(Integer::compareTo).orElseThrow();
        int max = l.stream().max(Integer::compareTo).orElseThrow();

        List<Integer> result =List.of(min,max);
        return result;
	}
	
	public int product(List<Integer> l)
	{
		return l.stream().reduce((a,b)->a*b).get();
	}
	
	public List<Integer> flatMap(List<List<Integer>> l)
	{
		return l.stream().flatMap(List::stream).collect(Collectors.toList());
	}
	
}
