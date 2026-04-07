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
		System.out.println("Input an email: ");
		String email = ip.nextLine();


        // Rule 1: Must contain exactly one '@'
		if (!email.contains("@")){
			System.out.println("0Invalid: Missing @");
			return ;
		}

		if (email.indexOf("@")!=email.lastIndexOf("@")){
			System.out.println("0Invalid: Multiple @");
			return ;
		}

		// Rule 2: Must not start or end with '.'
		if (email.startsWith(".") || email.endsWith(".")){
			System.out.println("1Invalid: Starts or ends with dot");
			return ;
		}

		// Rule 3: Must not contain spaces
		if(!email.contains(" ")){
			System.out.println("2Invalid: Contains spaces");
			return ;
		}

		// Rule 4: Local part must be 1-64 characters
		if (email.indexOf("@")<1 ){
			System.out.println("3Invalid: Local part too short");
			return ;
		}

		if (email.indexOf("@")>63){
			System.out.println("3Invalid: Local part too long");
			return ;
		}

		String domain = email.substring(email.indexOf("@")+1) ;

		// Rule 5: Domain must contain at least one dot
		if (!domain.contains(".")){
			System.out.println("4Invalid: No dot in domain");
			return ;
		}

		String aftfinaldot = domain.substring(domain.lastIndexOf(".")+1);

		// Rule 6: Domain extension must be 2-6 characters
		if (aftfinaldot.length()>6 || aftfinaldot.length()<2){
			System.out.println("5Invalid: Invalid domain extension length");
			return ;
		}
        
		// Exception B
		if (domain.contains("+") || domain.contains("_")){
			System.out.println("7Invalid: Invalid characters in domain part");
			return ;
		}

		// Exception C
		String localpart = email.substring(0, email.indexOf("@")) ;

		if (localpart.contains(".") && domain.equals("gmail.com")){
			System.out.println("Valid (Gmail normalized)");
            return ;
		}
			
		System.out.println("Valid");
		}
	

	}





}
