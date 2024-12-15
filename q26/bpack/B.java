package bpack;

import apack.A;

public class B extends A{
	public void display(){
		System.out.println("Proctected Variable: " + b);
		System.out.println("Public Variable: " + a);
		System.out.println("Private Variable not accessible");
	}
}
