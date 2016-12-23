import java.util.Scanner;

public class Lab6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int length = 0, width = 0;

		System.out.println("Enter the length: ");
		length = sc.nextInt();

		if (length > 20 || length < 0) {
			System.out.println("Invalid – enter length between 1 and 20:");
			length = sc.nextInt();
		}
		System.out.println("Enter the width: ");
		width = sc.nextInt();

		if (width > 20 || width < 0) {
			System.out.println("Invalid – enter width between 1 and 20:");
			width = sc.nextInt();
		}

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}

			System.out.println();
		}

	}

}
