package assignments.solidshape;

public class Calculate {

	private Scanner scanner;

	public Calculate() {
		scanner = new Scanner(System.in);
	}

	public int getIntValue() {
		return scanner.nextInt();
	}

	public double getDoubleValue() {
		return scanner.nextDouble();
	}
}