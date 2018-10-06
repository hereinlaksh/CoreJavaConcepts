package com;

import java.util.Scanner;

class InvalidAgeException extends java.lang.RuntimeException
{
	
}


class Exception
{

static void status(int age) throws InvalidAgeException
{
	if(age>20)
	{
		System.out.println("eligible for marriage");
	}
	else
	{
		throw new InvalidAgeException();
	}
}
	public static void main(String[] args) throws InvalidAgeException
	{
		Scanner s= new Scanner(System.in);
		System.out.println("enter ur age");
		int age=s.nextInt();
		Exception.status(age);
		
	}
	
	}





