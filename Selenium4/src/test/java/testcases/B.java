package testcases;

public class B extends A{

	
	public void m1() {
		System.out.println("m1 from B class");
		//super.m1();
		
	}
	

	
	public static void main(String args[]) {
		
		A obj = new B();
		obj.m1();
		
	}
}
