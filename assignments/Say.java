package assignments;
public class Say {
	private static String[] words = new String[]{"zero","one","two","three","four","five","six","seven","eight","nine","ten", "eleven","twelve","thirteen","fourteen","fifteen","sixteen","seventeen","eighteen", "ninteen","twenty","thirty","fourty","fifty","sixty","seventy","eighty","ninty","hundred","thousand","million","billion"};
	
	private static String numberInWords(int number) {
		String numberInWords = "";
		if(number < 0 || number > 99) {
			System.out.println("Given number is out of range 0 - 99");
			System.exit(1);
		}

		if(number <= 20) {
			numberInWords = words[number];
		} else {
			numberInWords = words[20 + ((number / 10) * 10 - 20) / 10];
			if(number % 10 != 0) {
				numberInWords = numberInWords + " " + words[number % 10];
			}
		}

		return numberInWords;
	}

	private static String hundredInWords(int number) {
		String numberInWords = numberInWords(number / 100) + " " + words[words.length - 4];
		number = number % 100;
		
		if(number > 0) {
			numberInWords = numberInWords + " " + numberInWords(number);
		}
		
		return numberInWords;
	}

	private static String thousandInWords(int number) {
		String numberInWords = numberInWords(number / 1000) + " " + words[words.length - 3];
		number = number % 1000;

		if(number != 0) {
			if(number >= 100) {
				numberInWords = numberInWords + " " + hundredInWords(number);
			} else {
				numberInWords = numberInWords + " " + numberInWords(number);
			}
		}
		
		return numberInWords;
	}

	private static String millionInWords(int number) {
		String numberInWords = numberInWords(number / 1000000) + " " + words[words.length - 2];
		number = number % 1000000;

		if(number >= 1000) {
			numberInWords = numberInWords + " " + thousandInWords(number);
		} else {
			numberInWords = numberInWords + " " + hundredInWords(number);
		}

		return numberInWords;
	}

	private static String billionInWords(int number) {
		String numberInWords = numberInWords(number / 1000000000) + " " + words[words.length - 1];
		number = number % 1000000000;
		
		if(number >= 1000000) {
			numberInWords = numberInWords + " " + millionInWords(number);
		} else {
			numberInWords = numberInWords + " " + thousandInWords(number);
		}

		return numberInWords;
	}

	public static void main(String[] args) {
		//check argument is not missing
		if(args.length == 0) {
			System.out.println("Argument is missing");
			System.exit(1);
		}
		//validate argument
		int number = -1;
		try {
			number = Integer.parseInt(args[0]);
		} catch(NumberFormatException e) {
			System.out.println("Argument must be a number");
			System.exit(1);
		}
		String numberInWords = "";
		
		if(number < 100) {
			numberInWords = numberInWords(number);
		} 

		if(number >= 100 && number < 1000) {
			numberInWords = hundredInWords(number);
		}

		if(number >= 1000 && number < 1000000) {
			numberInWords = thousandInWords(number);
		}

		if(number >= 1000000 && number < 1000000000) {
			numberInWords = millionInWords(number);
		}

		if(number >= 1000000000 && number < 1000000000000L) {
			numberInWords = billionInWords(number);
		}

		System.out.println(numberInWords);
		System.exit(0);
	}
}
