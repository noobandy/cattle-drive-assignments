package assignments;

public class Sum {
	public static void main(String[] args) {
		double sum = 0;
		for(int i = 0; i < 1000; i++) {
			sum += 0.1;
		}

		System.out.println(sum == 100);
		System.out.println(sum);
		System.exit(0);
	}
}