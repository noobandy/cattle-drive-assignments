package assignments;
import java.util.*;

abstract class Thing {
	protected String serialNumber;
	
	public Thing(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public abstract String getDescription();  
}

class BookOnTape extends Thing {

	public BookOnTape(String serialNumber) {
		super(serialNumber);
	}

	public String getDescription() {
		return "BookOnTape "+ serialNumber;
	}
}

class Video extends Thing {

	public Video(String serialNumber) {
		super(serialNumber);
	}

	public String getDescription() {
		return "Video "+ serialNumber;
	}
}

class Furniture extends Thing {

	public Furniture(String serialNumber) {
		super(serialNumber);
	}

	public String getDescription() {
		return "Furniture "+ serialNumber;
	}
}

public class Lookup {
	
	private static Map<String, Thing> things = new HashMap<String, Thing>();
	static {
		things.put("one", new BookOnTape("one"));
		things.put("two", new Video("two"));
		things.put("three", new Furniture("three"));
	}
	public static void main(String[] args) {

		if(args.length == 0) {
			System.out.println("argument missing");
			System.exit(1);
		}

		Thing foundThing = things.get(args[0]);
		if(foundThing != null) {
			System.out.format("found %s%n", foundThing.getDescription());
		} else {
			System.out.println("no match found");
		}

		System.exit(0);
	}
}