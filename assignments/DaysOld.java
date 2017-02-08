package assignments;
import java.util.*;
import com.javaranch.common.*;

public class DaysOld {
	public static void main(String[] args){
		if(args.length == 0) {
			System.out.println("argument missing");
			System.exit(1);
		}
		
		GDate dob = new GDate(args[0]);
		GDate today = new GDate(new Date());
		System.out.format("You were born on %s%n", dob.getLongFormat());
		System.out.format("Today is %s%n", today.getLongFormat());
		System.out.format("You are now %d days old%n", new JDate(today).get() - new JDate(dob).get());
		System.exit(0);
	}
}
