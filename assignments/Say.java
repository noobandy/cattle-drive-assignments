package assignments;
public class Say {
	String[] words = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine","ten", "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen", "ninteen","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty","hundred","thousand","million","billion"};
	public static void main(String[] args) {
		//check argument is not missing
		if(args.length == 0) {
			System.out.println("Argument is missing");
			System.exit(1);
		}
		//validate argument
		int num = -1;
		try {
			num = Integer.parseInt(args[0]);
		} catch(NumberFormatException e) {
			System.out.println("Argument must be a number");
			System.exit(1);
		}
	}
}
