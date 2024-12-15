package dpack;

import bpack.B;
import cpack.C;

class ProtectedDemo{
	public static void main(String arg[]){
		B Bobj = new B();
		C Cobj = new C();

		System.out.println("Accessing from class B: ");
		Bobj.display();

		System.out.println("Accessing from class C: ");
		Cobj.display();
	}
}
