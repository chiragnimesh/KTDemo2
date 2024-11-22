package com.example.demo.classes;

public class B {

	public boolean prime(int a)
	{
		int c=0;
		for(int i=2;i<a;i++)
		{
			if(a%i==0)
			{
				c++;
				break;
			}
		}
		if(c==0 && a!=1)
			return true;
		else
			return false;
	}
	
	public boolean palindrome(int a) {
		int n=a;
		int sum=0;
		while(a!=0) {
			int r=a%10;
			a=a/10;
			sum=sum*10+r;
		}
		if(sum==n)
		return true;
		else
			return false;
	}
}
