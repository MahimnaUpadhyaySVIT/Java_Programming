package cpack;

import apack.A;

public class C{
	public void display(){
		A obj = new A();
		System.out.println("Only Public variable is accessible: " + obj.a);
	}
}
