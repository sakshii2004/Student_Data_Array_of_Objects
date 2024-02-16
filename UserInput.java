package assignment3;

import java.util.*;

class UserInput {
	Scanner scan = new Scanner(System.in);
	String name, dob;
	int prn;
	
	Object[] array = new Object[3];
	
	public Object[] inputStudent() {
		System.out.println("Enter the name: ");
		name = scan.next();
		
		System.out.println("Enter PRN: ");
		prn = scan.nextInt();
		
		System.out.println("Enter DOB: ");
		dob = scan.next();
		
		array[0] = name;
		array[1] = prn;
		array[2] = dob;
		
		return array;
	}
}
