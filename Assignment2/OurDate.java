import java.util.Scanner;

public class OurDate {

	private int year, month, day;
	private Scanner sc = new Scanner(System.in);

	public OurDate() {
		year = 1900;
		month = 1;
		day = 1;
	}

	public OurDate(int y, int m, int d) {
		year = y;
		month = m;
		day = d;
	}

	public int getYear() {
		return year;
	}

	public void setYear() {
		do {
			System.out.println("Enter a valid year: ");
			year = sc.nextInt();
		} while (year < 1900);

	}

	public int getMonth() {
		return month;
	}

	public void setMonth() {
		do {
			System.out.println("Enter a month: ");
			month = sc.nextInt();
		} while (month <= 0 || month > 12);

	}

	public int getDay() {
		return day;
	}

	public void setDay() {
		do {
			System.out.println("Enter a day: ");
			day = sc.nextInt();
		} while (day < 0 || day > 30);

	}

	public void displayDate() {
		System.out.print(year + "/" + month + "/" + day);
	}

	public int calcDays() {
		return ((year - 1900) * 360 + (month - 1) * 30 + day - 1);
	}

}
