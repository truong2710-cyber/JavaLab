package hust.soict.talentedprogram.lab02;
import java.util.Scanner;
class Time{
	private String month;
	private String year;
	public void setMonth(String month) {
		this.month=month;
	}
	public void setYear(String year) {
		this.year=year;
	}
	public boolean checkValidMonth() {
		if (month.equals("January")  || month.equals("Jan") || month.equals("Jan.") || month.equals("1")||
		month.equals("March")    || month.equals("Mar") || month.equals("Mar.") || month.equals("3")||
		month.equals("May")      || month.equals("May") || month.equals("May.") || month.equals("5")||
		month.equals("July")     || month.equals("Jul") || month.equals("Jul.") || month.equals("7")||
		month.equals("August")   || month.equals("Aug") || month.equals("Aug.") || month.equals("8")||
		month.equals("October")  || month.equals("Oct") || month.equals("Oct.") || month.equals("10")||
		month.equals("December") || month.equals("Dec") || month.equals("Dec.") || month.equals("12")||
		month.equals("April")    || month.equals("Apr") || month.equals("Apr.") || month.equals("4")||
		month.equals("June")     || month.equals("Jun") || month.equals("Jun.") || month.equals("6")||
		month.equals("September")|| month.equals("Sep") || month.equals("Sep.") || month.equals("9")||
		month.equals("November") || month.equals("Nov") || month.equals("Nov.") || month.equals("11")||
		month.equals("February") || month.equals("Feb") || month.equals("Feb.")|| month.equals("2"))
		return true;
		return false;
	}
	public boolean checkValidYear() {
		try {
		    @SuppressWarnings("unused")
			int intValue = Integer.parseInt(year);
		    return true;
		} catch (NumberFormatException e) {
		    return false;
		}
	}
	public boolean checkValidTime() {
		if (!checkValidMonth()||!checkValidYear()) {
			return false;
		}
		return true;
		
	}
	public boolean checkLeapYear() {
		int iYear = Integer.parseInt(year);
		return (iYear%4==0 && iYear%100!=0)||(iYear%400==0);
	}
	
	public int findDate() {
		if (month.equals("January")  || month.equals("Jan") || month.equals("Jan.") || month.equals("1")||
			month.equals("March")    || month.equals("Mar") || month.equals("Mar.") || month.equals("3")||
			month.equals("May")      || month.equals("May") || month.equals("May.") || month.equals("5")||
			month.equals("July")     || month.equals("Jul") || month.equals("Jul.") || month.equals("7")||
			month.equals("August")   || month.equals("Aug") || month.equals("Aug.") || month.equals("8")||
			month.equals("October")  || month.equals("Oct") || month.equals("Oct.") || month.equals("10")||
			month.equals("December") || month.equals("Dec") || month.equals("Dec.") || month.equals("12"))
		return 31;
		if (month.equals("April")    || month.equals("Apr") || month.equals("Apr.") || month.equals("4")||
			month.equals("June")     || month.equals("Jun") || month.equals("Jun.") || month.equals("6")||
			month.equals("September")|| month.equals("Sep") || month.equals("Sep.") || month.equals("9")||
			month.equals("November") || month.equals("Nov") || month.equals("Nov.") || month.equals("11"))
		return 30;
		if (month.equals("February") || month.equals("Feb") || month.equals("Feb.")|| month.equals("2")) {
			if (checkLeapYear()) return 29;
		}
		return 28;
	}
	
}
public class DateCal {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		Time t=new Time();
		do {
			System.out.println("Input month: ");
			String month=sc.nextLine();
			System.out.println("Input year: ");
			String year=sc.nextLine();
			t.setMonth(month);
			t.setYear(year);
			if (!t.checkValidTime()) {
				System.out.println("Invalid time! Please input time again!");
			}
		}
		while(!t.checkValidTime());
		System.out.println("Number of day in that month of that year: "+t.findDate());
	}
}
