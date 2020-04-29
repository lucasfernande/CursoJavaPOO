package application;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Set<Integer> a = new HashSet<>();
		Set<Integer> b = new HashSet<>();
		Set<Integer> c = new HashSet<>();
		
		System.out.print("How many students for course A?: ");
		int n = sc.nextInt();
		for (int i=1; i<=n; i++) {
			System.out.print("Enter the number of student #" + i + ": ");
			Integer number = sc.nextInt();
			a.add(number);
		}
		
		System.out.print("\nHow many students for course B?: ");
		int x = sc.nextInt();
		for (int i=1; i<=x; i++) {
			System.out.print("Enter the number of student #" + i + ": ");
			Integer number = sc.nextInt();
			b.add(number);
		}
		
		System.out.print("\nHow many students for course C?: ");
		int z = sc.nextInt();
		for (int i=1; i<=z; i++) {
			System.out.print("Enter the number of student #" + i + ": ");
			Integer number = sc.nextInt();
			c.add(number);
		}
		sc.close();
		
		Set<Integer> total = new HashSet<>(a);
		total.addAll(b);
		total.addAll(c);
		
		System.out.println("\nTotal students: " + total.size());

	}

}
