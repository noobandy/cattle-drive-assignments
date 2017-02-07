package assignments;
/**
* Program to print command line argument 100 times
* Words are never split up. Assuming that the console is 80 characters wide.
*
**/
class Hundred {
	private static final int LINE_WIDTH = 80;
	private static final int HUNDRED = 100;

	public static void main(String[] args) {
		//check argument is not missing
		if(args.length == 0) {
			System.out.println("Argument missing");
			System.exit(1);
		}
		String word = args[0];
		//check argument is valid
		if(word.length() > LINE_WIDTH) {
			System.out.println("word is longer than line width");
			System.exit(1);
		}

		int availableSpace = LINE_WIDTH;

		for(int i = 0; i < HUNDRED; i++) {
			System.out.print(word);
			availableSpace = availableSpace - word.length();

			if(availableSpace > word.length()) {
				System.out.print(" ");
				availableSpace = availableSpace - 1;
			} else {
				System.out.println();
				availableSpace = LINE_WIDTH;
			}
		}
		System.out.println();
		System.exit(0);
	}
}