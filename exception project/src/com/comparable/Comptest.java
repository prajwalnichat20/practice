package com.comparable;

import java.util.Set;
import java.util.TreeSet;

public class Comptest  {
	public static void main(String[] args) {
		 Student s= new Student();
		 s.setRollno(14);
		 s.setName("Prajhwal");
		 
		 Student s1= new Student();
		 s1.setRollno(13);
		 s1.setName("AaaaaJHD");
		 
		 Set<Student> stu= new  TreeSet<Student>();
		 
		 stu.add(s);
		 stu.add(s1);
		 
		 stu.forEach(a->{
			 System.out.println(a.getRollno());
			 System.out.println(a.getName());
		 });
		 
	}

}
