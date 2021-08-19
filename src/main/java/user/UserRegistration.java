package user;

import java.util.Scanner;

public class UserRegistration {
	public static void main(String[] args) {

	}

	public String checkFirstName(String s) {
		String name = s;
		if (name.toUpperCase().charAt(0) == name.charAt(0)) {
			if (name.length() > 2) {
				return name;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	public String checkLastName(String s) {
		String name = s;
		if (name.toUpperCase().charAt(0) == name.charAt(0)) {
			if (name.length() > 2) {
				return name;
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	public String checkEmail(String s) {
		if (s.indexOf('.') > 0) {
			if (s.indexOf('@') > 0) {
				if (s.indexOf('.', s.indexOf('@')) > s.indexOf('@') + 1) {
					int coPosi= s.indexOf(".", s.indexOf("@"));
					if(s.indexOf("co", coPosi)>0) {
						return s;
					}
					return null;
				} else
					return null;
			} else
				return null;
		} else
			return null;

	}

	public String checkPhoneNumber(String s) {
		if (s.indexOf(' ') == 2) {
			if (s.length() - s.indexOf(' ') - 1 == 10) {
				return s;
			} else
				return null;
		} else
			return null;
	}

	public String checkPassword(String s) {
		if (s.length() > 7) {
			int flag3 = 0;
			char[] sp = { '@', '#', '$', '!', '&', '*' };
			for (int i = 0; i < s.length(); i++) {
				for (int j = 0; j < sp.length; j++) {
					if (s.charAt(i) == sp[j]) {
						flag3 = 1;
						break;
					}
				}
			}
			if (flag3 == 1) {
				int flag2 = 0;
				char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
				for (int i = 0; i < s.length(); i++) {
					for (int j = 0; j < num.length; j++) {
						if (s.charAt(i) == num[j]) {
							flag2 = 1;
							break;
						}
					}
				}
				if (flag2 == 1) {
					int flag = 0, pass = 0;
					for (int i = 0; i < s.length(); i++) {
						pass = 0;
						for (int j = 0; j < num.length; j++) {
							if (s.charAt(i) == num[j]) {
								pass = 1;
							}
						}
						for (int k = 0; k < sp.length; k++) {
							if (s.charAt(i) == sp[k]) {
								pass = 1;
							}
						}
						if (pass == 0) {
							String u = s.toUpperCase();
							if (s.charAt(i) == u.charAt(i)) {
								flag = 1;
								break;
							}
						}
					}
					if (flag == 1) {
						return s;
					}

					return null;
				}

				return null;
			}

			return null;
		} else
			return null;
	}

}
