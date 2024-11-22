package com.example.demo.classes;

@FunctionalInterface
public interface C {

	public int calculate(int a,int b);
}


class D 
{
	C add=(a,b)->a+b;
	C mul=(a,b)->a*b;
	C div=(a,b)->a/b;
	C sub=(a,b)->a-b;
	
	
}
