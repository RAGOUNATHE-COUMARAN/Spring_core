package com.tnsif.springboot;

import org.springframework.stereotype.Component;

@Component
public class College {
// private Stduent Student;
// public college(Student student) {
//	 this.Student=student;
	
// }
	private Student student;

	public void setStudent(Student student) {
		this.student = student;
	}
	public void display() {
		System.out.println("smvec");
		student.display();
		
	}
	
	public College() {
		System.out.println("College object is created.");
	}

	
	
}
