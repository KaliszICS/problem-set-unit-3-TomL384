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
		if (!email.contains("@") || email.indexOf("@")!=email.lastIndexOf("@")){
			System.out.println("0Invalid");
			return ;
		}

		// Rule 2: Must not start or end with '.'
		if (email.startsWith(".") || email.endsWith(".")){
			System.out.println("1Invalid");
			return ;
		}

		// Rule 3: Must not contain spaces
		if(!email.trim().equals(email)){
			System.out.println("2Invalid");
			return ;
		}

		// Rule 4: Local part must be 1-64 characters
		if (email.indexOf("@")>63 || email.indexOf("@")<1 ){
			System.out.println("3Invalid");
			return ;
		}

		String domain = email.substring(email.indexOf("@")+1) ;

		// Rule 5: Domain must contain at least one dot
		if (!domain.contains(".")){
			System.out.println("4Invalid");
			return ;
		}

		String aftfinaldot = domain.substring(domain.lastIndexOf(".")+1);

		// Rule 6: Domain extension must be 2-6 characters
		if (aftfinaldot.length()>6 || aftfinaldot.length()<2){
			System.out.println("5Invalid");
			return ;
		}

		else{
			System.out.println("Valid");
		}
	

	}





}
