package cpack;

import apack.A;

class C{
	void display(){
		A obj = new A();
		System.out.println("Only Public variable is accessible: " + obj.a);
	}
}
