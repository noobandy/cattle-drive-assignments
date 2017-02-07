package assignments;
/**
* Program to check if a given year is leap or not 
**/

public class Leap {

	public static void main(String[] args) {
		if(args.length > 0) {
			try {
				int year = Integer.parseInt(args[0]);
				/*
					An year is a leap year 
					when it's divided by 4 but not by 100
					or it's divided by 4 , 100 and 400 
				*/
				if((year % 4 == 0 && year % 100 != 0) || (year % 4 == 0 && (year % 100 == 0 && year % 400 == 0))) {
					System.out.println("leap year!");
				} else{
					System.out.println("not a leap year!");
				}
			} catch (NumberFormatException e) {
				System.out.println("Argument must be a valid year");
			}
		} else {
			System.out.println("Argument missing");
		}
	}
}