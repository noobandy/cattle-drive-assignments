package assignments;
import java.util.*;
import java.io.*;
public class SortNames {

	private static class Name implements Comparable<Name> {
		String firstName;
		String lastName;

		public Name(String firstName, String lastName) {
			this.firstName = firstName;
			this.lastName = lastName;
		}

		public String toString() {
			return firstName + " " + lastName;
		}

		public int compareTo(Name other) {
			int firstNameCompareResult = firstName.compareTo(other.firstName);
			if(firstNameCompareResult == 0) {
				return lastName.compareTo(other.lastName);
			} else {
				return firstNameCompareResult;
			}
		}
	}

	private static List<Name> readNames(String filePath) throws IOException {
		BufferedReader reader = null;
		List<Name> names = new ArrayList<Name>();

		try {
			reader = new BufferedReader(new FileReader(new File(filePath)));	
			String line = null;
			while((line = reader.readLine()) != null) {
				String[] tokens = line.split("\\s");
				names.add(new Name(tokens[0], tokens[1]));
			}
		} finally {
			if(reader != null) {
				reader.close();
			}
		}
		return names;
	}

	private static void displayNames(List<Name> names) {
		for(Name name : names) {
			System.out.println(name);
		}
	}
	public static void main(String[] args) {
		
		if(args.length == 0) {
			System.out.println("argument missing");
			System.exit(1);
		}

		try {
			List<Name> names = readNames(args[0]);
			Collections.sort(names);
			displayNames(names);

			System.exit(0);
		} catch(Exception e) {
			System.out.println(e);
			System.exit(1);
		}
	}
}