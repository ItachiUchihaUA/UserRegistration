package user;

import java.util.Scanner;

public class UserRegistration {
	public static void main(String[] args) {
		
	}
	
	public String enterFirstName(String s) {
		String name = s;
		if(name.toUpperCase().charAt(0) == name.charAt(0)) {
			if(name.length()>2) {
				return name;
			}
			else {
				System.out.println("Not more the 2 letter!");
				return null;
			}
		}
		else {
			System.out.println("Not First letter Capital: ");
			
			return null;
		}
	}
	public String enterLastName(String s) {
		String name = s;
		if(name.toUpperCase().charAt(0) == name.charAt(0)) {
			if(name.length()>2) {
				return name;
			}
			else {
				System.out.println("Not more the 2 letter!");
				return null;
			}
		}
		else {
			System.out.println("Not First letter Capital: ");
			
			return null;
		}
	}
}
