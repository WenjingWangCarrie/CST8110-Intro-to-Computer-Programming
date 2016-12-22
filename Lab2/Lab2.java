import java.util.Scanner;

public class Lab2 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int number = 0;
		
		System.out.println("Enter a number");
		number = sc.nextInt();
		
		System.out.println("The first three multiple of " + number + " are: " + number);
		System.out.println(number * 2);
		System.out.println(number * 3);
	}

}
