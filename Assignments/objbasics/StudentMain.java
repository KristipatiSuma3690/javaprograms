package com.lumen.objbasics;

public class StudentMain {

	public static void main(String[] args) {
		Student student=new Student();
		student.name="Suma";
		student.department="CSE";
		student.printDetails();
		String score=student.getGrades(60,50,70);
		System.out.println(score);
	}

}