package assignments;
/**
* Program to check if a number is even or odd
**/

class EvenOrOdd {

	public static void main(String[] args) {
		if(args.length > 0) {
			try {
				int num = Integer.parseInt(args[0]);
				if(num % 2 == 0) {
					System.out.println("even");
				} else {
					System.out.println("odd");
				}
			} catch (NumberFormatException e) {
				System.out.println("Argument must be a valid number");
			}
		} else {
			System.out.println("Argument missing");
		}
		
	}
}