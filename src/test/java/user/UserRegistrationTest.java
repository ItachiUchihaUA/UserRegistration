package user;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserRegistrationTest {
	
	UserRegistration c = new UserRegistration();
		
	@Test
	public void shoulBeMoreThen3LetterAndCaptial() {
		assertEquals( "Mano" , c.enterFirstName("Mano"));
	}

}
