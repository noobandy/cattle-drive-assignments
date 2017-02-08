package assignments;
/**
* Program to print times table
**/

public class Times {
	public static void main(String[] args) {
		System.out.print(" ");

		for(int i = 0; i < 10; i++) {
			System.out.print(" ");
			System.out.format("%2d", i);
		}

		System.out.println();

		for(int i = 0; i < 10; i++) {
			System.out.print(i);
			for(int j = 0; j < 10; j++) {
				System.out.print(" ");
				System.out.format("%2d", i * j);
			}
			System.out.println();
		}
	}
}