import java.util.Scanner;

public class Lab5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double hourWork, rate, basePay, overPay = 0.0, tax, totalPay, netPay;

		System.out.println("Enter the number of hours worked: ");
		hourWork = sc.nextDouble();
		System.out.println("Enter the rate of pay: ");
		rate = sc.nextDouble();
		System.out.println();

		if (hourWork > 37.5) {
			basePay = 37.5 * rate;
			overPay = (hourWork - 37.5) * rate * 1.5;
		} else {
			basePay = hourWork * rate;
			overPay = 0.0;
		}
		System.out.println("Base pay is $" + basePay);
		System.out.println("Overtime pay is $" + overPay);

		totalPay = basePay + overPay;
		System.out.println("Total pay is $" + totalPay);

		if (totalPay < 1000) {
			tax = 0.0;
		} else if (totalPay >= 1000 && totalPay <= 2000) {
			tax = 0.2 * totalPay;
		} else {
			tax = 0.3 * totalPay;
		}
		System.out.println("Tax deducted is $" + tax);

		netPay = totalPay - tax;
		System.out.println("Net pay is $" + netPay);

	}

}
