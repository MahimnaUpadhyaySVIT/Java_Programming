package bpack;

import apack.A;

class B extends A{
	void display(){
		System.out.println("Proctected Variable: " + b);
		System.out.println("Public Variable: " + a);
		System.out.println("Private Variable not accessible: " + c);
	}
}
