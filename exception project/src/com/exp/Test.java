package com.exp;

public class Test  {
 public void  m1(int age) throws AgeException  {
	 System.out.println("m1 Starts");
	 if(age<0) {
		 throw new AgeException("Age Exception");
		 
	 }
	 System.out.println("M1-End");
	 
}
 public static void main(String[] args) {
	Test t = new Test();
try {
	t.m1(-5);
} catch (Exception e) {
	System.out.println("catch block"+e.getMessage());
}
}
 
}
