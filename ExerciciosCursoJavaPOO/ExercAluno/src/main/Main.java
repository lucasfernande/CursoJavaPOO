package main;

import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class Main {

	public static void main(String[] args) {
		
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Student student = new Student();
		
		System.out.println("Enter the name: ");
		student.name = sc.nextLine();
		System.out.println("Enter the grade one: ");
		student.grade1 = sc.nextDouble();
		System.out.println("Enter the grade two: ");
		student.grade2 = sc.nextDouble();
		System.out.println("Enter the grade three: ");
		student.grade3 = sc.nextDouble();
        
		System.out.printf("\nFinal grade: %.2f%n%n", student.finalGrade());
		
		if(student.finalGrade() < 60.0) {
			System.out.println("Failed");
			System.out.printf("Missing points: %.2f", student.missingPoints());
		}
		else {
			System.out.println("Pass");
		}
		sc.close();
	}

}
