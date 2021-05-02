package org.college;

public class Calculator {
	
	
	public void add(int a,int b)
	{
		
		int c =a+b;
		System.out.println(c);
	}
	
	public void add(int a,int b, int c)
	{
		int d =a+b+c;
		System.out.println(d);
		System.out.println("----------------------------------");
	}
	
	public void multiply(int a,int b)
	{
		int d =a*b;
		System.out.println(d);
	}
	
	public void multiply(int a,double b )
	{
		double d =a*b;
		System.out.println(d);
		System.out.println("----------------------------------");
	}
	
	public void subtract(int a,int b)
	{
		int d =a-b;
		System.out.println(d);
	}
	
	public void subtract(double b,double c )
	{
		double d =b-c;
		System.out.println(d);
		System.out.println("----------------------------------");
	}
	
	public void divide (int a,int b)
	{

		int d =a/b;
		System.out.println(d);
		
	}
	
	public void divide (int c,double d )
	{

		double e =c/d;
		System.out.println(e);
		System.out.println("----------------------------------");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Calculator cals=new Calculator();
		
		cals.add(6, 7);
		cals.add(6, 7, 8);
		
		cals.multiply(6, 7);
		cals.multiply(6, 7.4);
		
		cals.subtract(9, 7);
		cals.subtract(9, 7.4);
		
		cals.divide(14, 7);
		cals.divide(14, 7.456);
	
	}

}
