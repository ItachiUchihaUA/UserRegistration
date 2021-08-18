package user;

import java.util.Scanner;

public class UserRegistration {
	public static void main(String[] args) {
		
	}
	
	public String checkFirstName(String s) {
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
	public String checkLastName(String s) {
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
	
	public String checkUserName(String s) {
		if(s.indexOf('.')>0 ) {
			if(s.indexOf('@')>0) {
				if(s.indexOf('.', s.indexOf('@'))>s.indexOf('@')+1) {
					return s;
				}
				else return null;
			}else
				return null;
		}else
			return null;
		
	}
	
	public String checkPhoneNumber(String s) {
		if(s.indexOf(' ')==2) {
			if(s.length()-s.indexOf(' ')-1==10) {
				return s;
			}else return null;
		}else return null;
	}
	
	public String checkPassword(String s) {
		if(s.length()>7) {
			int flag = 0;
			for(int i = 0 ; i<s.length(); i++) {
				String u = s.toUpperCase();
				if(s.charAt(i)==u.charAt(i)) {
					flag=1;
				}
			}
			if(flag==1) {
				return s;
			}
			
			return null;
		}else return null;
	}
	
}
