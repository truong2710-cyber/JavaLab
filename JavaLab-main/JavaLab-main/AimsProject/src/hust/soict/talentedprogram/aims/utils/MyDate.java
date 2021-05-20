package hust.soict.talentedprogram.aims.utils;
import java.util.List;
import java.util.Arrays;
import java.util.Scanner;
public class MyDate{
	private int day;
	private int month;
	private int year;
	@SuppressWarnings("deprecation")
	public MyDate() {
		long millis=System.currentTimeMillis();   
		java.sql.Date date=new java.sql.Date(millis);  
		day=date.getDate();
		month=date.getMonth()+1;
		year=date.getYear()+1900;
	}
	public MyDate(int day, int month, int year) {
		this.day=day;
		this.month=month;
		this.year=year;
	}
	public MyDate(String d) {
		String s[]=d.split(" ");
		switch (s[0]) {
			case "January":
				month=1;
				break;
			case "February":
				month=2;
				break;
			case "March":
				month=3;
				break;
			case "April":
				month=4;
				break;
			case "May":
				month=5;
				break;
			case "June":
				month=6;
				break;
			case "July":
				month=7;
				break;
			case "August":
				month=8;
				break;
			case "September":
				month=9;
				break;
			case "October":
				month=10;
				break;
			case "November":
				month=11;
				break;
			case "December":
				month=12;
				break;
		}
		day=Integer.parseInt(s[1].substring(0,s[1].length()-2));
		year=Integer.parseInt(s[2]);
	}
	public MyDate(String day, String month, String year) {
		switch(day) {
			case "first":
				this.day=1;
				break;
			case "second":
				this.day=2;
				break;
			case "third":
				this.day=3;
				break;
			case "forth":
				this.day=4;
				break;
			case "fifth":
				this.day=5;
				break;
			case "sixth":
				this.day=6;
				break;
			case "seventh":
				this.day=7;
				break;
			case "eighth":
				this.day=8;
				break;
			case "ninth":
				this.day=9;
				break;
			case "tenth":
				this.day=10;
				break;
			case "eleventh":
				this.day=11;
				break;
			case "twelfth":
				this.day=12;
				break;
			case "thirteenth":
				this.day=13;
				break;
			case "fourteenth":
				this.day=14;
				break;
			case "fifteenthh":
				this.day=15;
				break;
			case "sixteenth":
				this.day=16;
				break;
			case "seventeenth":
				this.day=17;
				break;
			case "eighteenth":
				this.day=18;
				break;
			case "nineteenth":
				this.day=19;
				break;
			case "twentieth":
				this.day=20;
				break;
			case "twenty first":
				this.day=21;
				break;
			case "twenty second":
				this.day=22;
				break;
			case "twenty third":
				this.day=23;
				break;
			case "twenty forth":
				this.day=24;
				break;
			case "twenty fifth":
				this.day=25;
				break;
			case "twenty sixth":
				this.day=26;
				break;
			case "twenty seventh":
				this.day=27;
				break;
			case "twenty eighth":
				this.day=28;
				break;
			case "twenty ninth":
				this.day=29;
				break;
			case "thirtieth":
				this.day=30;
				break;
			case "thirty first":
				this.day=31;
				break;
		}
		switch (month) {
			case "January":
				this.month=1;
				break;
			case "February":
				this.month=2;
				break;
			case "March":
				this.month=3;
				break;
			case "April":
				this.month=4;
				break;
			case "May":
				this.month=5;
				break;
			case "June":
				this.month=6;
				break;
			case "July":
				this.month=7;
				break;
			case "August":
				this.month=8;
				break;
			case "September":
				this.month=9;
				break;
			case "October":
				this.month=10;
				break;
			case "November":
				this.month=11;
				break;
			case "December":
				this.month=12;
				break;
		}
		boolean isValidInput = true;
	    int result = 0;
	    int finalResult = 0;
	    List<String> allowedStrings = Arrays.asList
	    (
	    "zero","one","two","three","four","five","six","seven",
	    "eight","nine","ten","eleven","twelve","thirteen","fourteen",
	    "fifteen","sixteen","seventeen","eighteen","nineteen","twenty",
	    "thirty","forty","fifty","sixty","seventy","eighty","ninety",
	    "hundred","thousand","million","billion","trillion"
	    );

	    String input=year;

	    if(input != null && input.length()> 0)
	    {
	        input = input.replaceAll("-", " ");
	        input = input.toLowerCase().replaceAll(" and", " ");
	        String[] splittedParts = input.trim().split("\\s+");

	        for(String str : splittedParts)
	        {
	            if(!allowedStrings.contains(str))
	            {
	                isValidInput = false;
	                System.out.println("Invalid word found : "+str);
	                break;
	            }
	        }
	        if(isValidInput)
	        {
	            for(String str : splittedParts)
	            {
	                if(str.equalsIgnoreCase("zero")) {
	                    result += 0;
	                }
	                else if(str.equalsIgnoreCase("one")) {
	                    result += 1;
	                }
	                else if(str.equalsIgnoreCase("two")) {
	                    result += 2;
	                }
	                else if(str.equalsIgnoreCase("three")) {
	                    result += 3;
	                }
	                else if(str.equalsIgnoreCase("four")) {
	                    result += 4;
	                }
	                else if(str.equalsIgnoreCase("five")) {
	                    result += 5;
	                }
	                else if(str.equalsIgnoreCase("six")) {
	                    result += 6;
	                }
	                else if(str.equalsIgnoreCase("seven")) {
	                    result += 7;
	                }
	                else if(str.equalsIgnoreCase("eight")) {
	                    result += 8;
	                }
	                else if(str.equalsIgnoreCase("nine")) {
	                    result += 9;
	                }
	                else if(str.equalsIgnoreCase("ten")) {
	                    result += 10;
	                }
	                else if(str.equalsIgnoreCase("eleven")) {
	                    result += 11;
	                }
	                else if(str.equalsIgnoreCase("twelve")) {
	                    result += 12;
	                }
	                else if(str.equalsIgnoreCase("thirteen")) {
	                    result += 13;
	                }
	                else if(str.equalsIgnoreCase("fourteen")) {
	                    result += 14;
	                }
	                else if(str.equalsIgnoreCase("fifteen")) {
	                    result += 15;
	                }
	                else if(str.equalsIgnoreCase("sixteen")) {
	                    result += 16;
	                }
	                else if(str.equalsIgnoreCase("seventeen")) {
	                    result += 17;
	                }
	                else if(str.equalsIgnoreCase("eighteen")) {
	                    result += 18;
	                }
	                else if(str.equalsIgnoreCase("nineteen")) {
	                    result += 19;
	                }
	                else if(str.equalsIgnoreCase("twenty")) {
	                    result += 20;
	                }
	                else if(str.equalsIgnoreCase("thirty")) {
	                    result += 30;
	                }
	                else if(str.equalsIgnoreCase("forty")) {
	                    result += 40;
	                }
	                else if(str.equalsIgnoreCase("fifty")) {
	                    result += 50;
	                }
	                else if(str.equalsIgnoreCase("sixty")) {
	                    result += 60;
	                }
	                else if(str.equalsIgnoreCase("seventy")) {
	                    result += 70;
	                }
	                else if(str.equalsIgnoreCase("eighty")) {
	                    result += 80;
	                }
	                else if(str.equalsIgnoreCase("ninety")) {
	                    result += 90;
	                }
	                else if(str.equalsIgnoreCase("hundred")) {
	                    result *= 100;
	                }
	                else if(str.equalsIgnoreCase("thousand")) {
	                    result *= 1000;
	                    finalResult += result;
	                    result=0;
	                }
	                else if(str.equalsIgnoreCase("million")) {
	                    result *= 1000000;
	                    finalResult += result;
	                    result=0;
	                }
	                else if(str.equalsIgnoreCase("billion")) {
	                    result *= 1000000000;
	                    finalResult += result;
	                    result=0;
	                }
	                else if(str.equalsIgnoreCase("trillion")) {
	                    result *= 1000000000000L;
	                    finalResult += result;
	                    result=0;
	                }
	            }

	            finalResult += result;
	            result=0;
	            this.year=finalResult;
	        }
	    }
	
	}
	public int getDay() {
		return day;
	}
	public void setDay(int day) {
		if (1<=day && day<=31)
			this.day = day;
		else
			System.out.println("Invalid day");
	}
	public int getMonth() {
		return month;
	}
	public void setMonth(int month) {
		if (1<=month && month<=12)
			this.month = month;
		else
			System.out.println("Invalid month");
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		if (1<=year)
			this.year = year;
		else
			System.out.println("Invalid year");
	}
	public void accept(String d) {
		String s[]=d.split(" ");
		switch (s[0]) {
			case "January":
				month=1;
				break;
			case "February":
				month=2;
				break;
			case "March":
				month=3;
				break;
			case "April":
				month=4;
				break;
			case "May":
				month=5;
				break;
			case "June":
				month=6;
				break;
			case "July":
				month=7;
				break;
			case "August":
				month=8;
				break;
			case "September":
				month=9;
				break;
			case "October":
				month=10;
				break;
			case "November":
				month=11;
				break;
			case "December":
				month=12;
				break;
		}
		day=Integer.parseInt(s[1].substring(0,s[1].length()-2));
		year=Integer.parseInt(s[2]);
	}
	public String addHead(int n) {
		if (n<10)
			return "0"+Integer.toString(n);
		else
			return Integer.toString(n);
	}
	public String convert(int n) {
		switch (n) {
		case 1:
			return "Jan";
		case 2:
			return "Feb";
		case 3:
			return "Mar";
		case 4:
			return "Apr";
		case 5:
			return "May";
		case 6:
			return "Jun";
		case 7:
			return "Jul";
		case 8:
			return "Aug";
		case 9:
			return "Sep";
		case 10:
			return "Oct";
		case 11:
			return "Nov";
		case 12:
			return "Dec";
		}
		return "";
	}
	public void print() {
		System.out.println(day+"-"+month+"-"+year);
	}
	public String toString() {
		return (day+"-"+month+"-"+year);
	}
	public void printByFormat() {
		System.out.println("Choose format: ");
		System.out.println("1. yyyy-MM-dd");
		System.out.println("2. d/M/yyyy");
		System.out.println("3. dd-MMM-yyyy");
		System.out.println("4. MMM d yyyy");
		System.out.println("5. mm-dd-yyyy");
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		switch(i) {
		case 1:
			System.out.println(year+"-"+addHead(month)+"-"+addHead(day));
			break;
		case 2:
			System.out.println(day+"/"+month+"/"+year);
			break;
		case 3:
			System.out.println(addHead(day)+"-"+convert(month)+"-"+year);
			break;
		case 4:
			System.out.println(convert(month)+" "+day+" "+year);
			break;
		case 5:
			System.out.println(addHead(month)+"-"+addHead(day)+"-"+year);
			break;
		}
	}
}

