import java.util.Scanner;

public class Lab7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String array;
		int upper = 0;
		int lower = 0;
		int others = 0;

		System.out.println("Enter the phrase: ");
		array = sc.nextLine();
		System.out.println("The total number of letters is " + array.length());

		for (int i = 0; i < array.length(); i++) {
			if (Character.isUpperCase(array.charAt(i))) {
				upper++;
			} else if (Character.isLowerCase(array.charAt(i))) {
				lower++;
			} else {
                others++;
			}

		}
		System.out.println("The number of upper case letters is " + upper);
		System.out.println("The number of lower case letters is " + lower);
		System.out.println("The number of other letters is " + others);
	}

}
