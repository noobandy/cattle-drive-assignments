package assignments;
/**
* Program to count no grains at an square of chess board (total 64 squares)
* 1st square 2^(1 - 1) = 1
* 2nd square 2^(2 - 1) = 2
* ....................
* nth square 2^(n - 1) 
**/

public class Grains {

	public static void main(String[] args) {
		for(int i = 0; i < 64; i++) {
			System.out.format("square %d:  %d grains.%n", i + 1, (long)Math.pow(2, i));
		}
		System.exit(0);
	}
}