package programs;

import java.util.Scanner;

public class Input {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the mark- ");
		int a= sc.nextInt();
		int marks=a;

		if(marks>90) {
			System.out.println("Print Excellent");
		}
		else if(marks>80 && marks<=90) {

			System.out.println("good");
		}
		else if(marks>70 && marks<=80) {

			System.out.println("Fair");
		}
		else if(marks>60 && marks<=70) {

			System.out.println("Meets Expectation");
		}
		else if(marks>=60) {

			System.out.println("par");
		}
	}

}
