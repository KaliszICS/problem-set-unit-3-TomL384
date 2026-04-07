/**
 * File Name: Problem Set Unit 3
 * Author: Tom Leung
 * Date Created: April 6, 2026
 * Date Last Edited: April 7, 2026
 */

import java.util.Scanner;

public class ProblemSet {

	public static void main(String args[]) {
		Scanner ip = new Scanner(System.in);
		System.out.println("Input two email: ");
		String email = ip.nextLine();
		String email1= email.substring(0,email.indexOf(","));
		String email2= email.substring(emial.indexOf(" ")+1);


        // Rule 1: Must contain exactly one '@'
		if (!email1.contains("@")){
			System.out.println("Invalid: Missing @");
			return ;
		}

		if (email1.indexOf("@")!=email1.lastIndexOf("@")){
			System.out.println("Invalid: Multiple @");
			return ;
		}

		// Rule 2: Must not start or end with '.'
		if (email1.startsWith(".") || email1.endsWith(".")){
			System.out.println("Invalid: Starts or ends with dot");
			return ;
		}

		// Rule 3: Must not contain spaces
		if(!email1.contains(" ")){
			System.out.println("Invalid: Contains spaces");
			return ;
		}

		// Rule 4: Local part must be 1-64 characters
		if (email1.indexOf("@")<1 ){
			System.out.println("Invalid: Local part too short");
			return ;
		}

		if (email1.indexOf("@")>63){
			System.out.println("Invalid: Local part too long");
			return ;
		}

		String domain = email1.substring(email1.indexOf("@")+1) ;

		// Rule 5: Domain must contain at least one dot
		if (!domain.contains(".")){
			System.out.println("Invalid: No dot in domain");
			return ;
		}

		String aftfinaldot = domain.substring(domain.lastIndexOf(".")+1);

		// Rule 6: Domain extension must be 2-6 characters
		if (aftfinaldot.length()>6 || aftfinaldot.length()<2){
			System.out.println("Invalid: Invalid domain extension length");
			return ;
		}
        
		// Exception B
		if (domain.contains("+") || domain.contains("_")){
			System.out.println("Invalid: Invalid characters in domain part");
			return ;
		}

		// Exception C
		String localpart = email1.substring(0, email1.indexOf("@")) ;

		if (localpart.contains(".") && domain.equals("gmail.com")){
			System.out.println("Valid (Gmail normalized)");
            return ;
		}
			
		System.out.println("Valid");
		}
	

	}





}
