package assignments;
import java.util.*;
public class GeekWatch {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("argument missing");
			System.exit(1);
		}

		try {
			int code = Integer.parseInt(args[0]);
			switch(code) {
				case 0:
					System.out.format("milliseconds since January 1, 1970: %d%n", System.currentTimeMillis());
					break;
				case 1:
					System.out.format("seconds since January 1, 1970: %d%n", System.currentTimeMillis()/1000);
					break;
				case 2:
					System.out.format("days since January 1, 1970: %d%n", System.currentTimeMillis()/(1000 * 60 * 60 * 24));
					break;
				case 3: 
					System.out.format("Current time and date %s%n", new Date().toString());
					break;
				default:
					System.out.println("unknown code");
					System.exit(1);
			}
		} catch(NumberFormatException e) {
			System.out.println("code must be a numeric value");
			System.exit(1);
		}
		
		System.exit(0);
	}
}
