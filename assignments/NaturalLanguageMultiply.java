package assignments;
import java.util.*;
public class NaturalLanguageMultiply {
	private static final Map<String, Integer> numericValues = new HashMap<String, Integer>();
	private static final String WORD_SEPARATOR = "-";
	static {
		numericValues.put("zero", 0);
		numericValues.put("one", 1);
		numericValues.put("two", 2);
		numericValues.put("three", 3);
		numericValues.put("four", 4);
		numericValues.put("five", 5);
		numericValues.put("six", 6);
		numericValues.put("seven", 7);
		numericValues.put("eight", 8);
		numericValues.put("nine", 9);
		numericValues.put("ten", 10);
		numericValues.put("eleven", 11);
		numericValues.put("tweleve", 12);
		numericValues.put("thirteen", 13);
		numericValues.put("fourteen", 14);
		numericValues.put("fifteen", 15);
		numericValues.put("sixteen", 16);
		numericValues.put("seventeen", 17);
		numericValues.put("eighteen", 18);
		numericValues.put("nineteen", 19);
		numericValues.put("twenty", 20);
		numericValues.put("thirty", 30);
		numericValues.put("foutry", 40);
		numericValues.put("fifty", 50);
		numericValues.put("sixty", 60);
		numericValues.put("seventy", 70);
		numericValues.put("eighty", 80);
		numericValues.put("ninety", 90);
	}

	private static int wordToNumber(String word) {
		String[] tokens = word.split(WORD_SEPARATOR);
		int number = 0;
		for(String token : tokens) {
			Integer numericValue = numericValues.get(token);
			if(numericValue == null) {
				throw new IllegalArgumentException("unknown token " + token + " in word " + word);
			}

			number += numericValue;
		}
		return number;
	}


	public static void main(String[] args) {
		
		if(args.length < 2) {
			System.out.println("argument missing");
			System.exit(1);
		}

		try {
			int firstNumber = wordToNumber(args[0]);
			int secondNumber = wordToNumber(args[1]);
			System.out.format("%d%n", firstNumber * secondNumber);
			System.exit(0); 
		} catch(Exception e) {
			System.out.println(e.getMessage());
			System.exit(1);
		}
	}
}
