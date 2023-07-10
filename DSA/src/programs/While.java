package programs;


import java.util.Scanner;

public class While {
	static int number;
	
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		number= sc.nextInt();

		int i=1;

		while(i<=number) {
			System.out.println(i);
			i++;
		}
		System.out.println("Done.");

		test();
	}

	public static void test() {

		for(int i=1;i<=number; i++) {
			System.out.println(i);
		}
	}
}
