import java.util.Scanner;

public class Assign1 {

	public static void main(String[] args) {

		double hybrid, lab, assign, quiz, test, finalExam;

		Scanner sc = new Scanner(System.in);

		System.out.println("Welcome to the CST8110 Final Mark Calculation");
		System.out.println("Enter your hybrid activity mark out of 5:");
		hybrid = sc.nextDouble();

		System.out.println("Enter your lab mark out of 10:");
		lab = sc.nextDouble();

		System.out.println("Enter your assignments mark out of 100:");
		assign = sc.nextDouble();

		System.out.println("Enter your quiz mark out of 25:");
		quiz = sc.nextDouble();

		System.out.println("Enter your lab test mark out of 5:");
		test = sc.nextDouble();

		System.out.println("Enter your final exam mark out of 30:");
		finalExam = sc.nextDouble();

		double calculate = hybrid + lab + assign * 0.2 + quiz + test * 2 + finalExam;
		System.out.println("Calculated final mark: " + calculate);
	}

}
