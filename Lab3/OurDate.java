import java.util.Scanner;

public class OurDate {

	int month;
	int day;
	int year;
	
	public OurDate() {
		month = 1;
		day = 1;
		year = 1901;
	}
	
	public OurDate(int m, int d, int y) {
		month = m;
		day = d;
		year = y;
	}
	
	public void display() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a month: ");
		month = sc.nextInt();
		System.out.println("Enter a day: ");
		day = sc.nextInt();
		System.out.println("Enter a year: ");
		year = sc.nextInt();
	}

	public String toString() {
		return this.month + "/" + this.day + "/" + this.year; 
	}
}
