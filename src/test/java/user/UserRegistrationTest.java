package user;

import static org.junit.Assert.*;

import org.junit.Test;

public class UserRegistrationTest {
	
	UserRegistration c = new UserRegistration();
		
	@Test
	public void firstNameShoulBeMoreThen3LetterAndCaptial() {
		assertEquals( "Mano" , c.checkFirstName("Mano"));
	}
	
	@Test
	public void firstNameShoulBeLessThen3LetterAndCaptial() {
		assertEquals( null , c.checkFirstName("Ma"));
	}
	@Test
	public void firstNameShoulBeLessThen3LetterAndSmallLetter() {
		assertEquals( null , c.checkFirstName("mano"));
	}
	@Test
	public void lastNameShoulBeMoreThen3LetterAndCaptial() {
		assertEquals( "Mano" , c.checkLastName("Mano"));
	}
	
	@Test
	public void lastNameShoulBeLessThen3LetterAndCaptial() {
		assertEquals( null , c.checkLastName("Ma"));
	}
	@Test
	public void lastNameShoulBeLessThen3LetterAndSmallLetter() {
		assertEquals( null , c.checkLastName("mano"));
	}
	@Test
	public void emailIsValid() {
		assertEquals("abc.asd@yo.co.in",c.checkEmail("abc.asd@yo.co.in"));
	}
	@Test
	public void emailIsInvalidWithNoAtTheRate() {
		assertEquals(null ,c.checkEmail("abc.asdyo.co.in"));
	}
	@Test
	public void emailHavingNoNamefirst() {
		assertEquals(null ,c.checkEmail(".asd@yo.co.in"));
	}
	@Test
	public void emailHavingNoCompany() {
		assertEquals(null ,c.checkEmail("abc.asd@.co.in"));
	}
	@Test
	public void emailHavingNoCo() {
		assertEquals(null ,c.checkEmail("abc.asd@yo.in"));
	}
	@Test
	public void emailHavingNoName() {
		assertEquals(null ,c.checkEmail("@yo.in"));
	}
	@Test
	public void phoneNumberIsRight() {
		assertEquals("91 9561092096" ,c.checkPhoneNumber("91 9561092096"));
	}
	@Test
	public void phoneNumberIsInvalidWithoutSpace() {
		assertEquals(null ,c.checkPhoneNumber("919561092096"));
	}
	@Test
	public void phoneNumberIsInvalidWithLessNumber() {
		assertEquals(null ,c.checkPhoneNumber("91 95610926"));
	}
	@Test
	public void phoneNumberIsInvalidWithWrongCode() {
		assertEquals(null ,c.checkPhoneNumber("912 95610926"));
	}
	
	@Test
	public void passwordIsRight() {
		assertEquals("Upa@123India",c.checkPassword("Upa@123India"));
	}
	@Test
	public void passwordIsWrongWithLessLetters() {
		assertEquals(null,c.checkPassword("Upa@12"));
	}
	@Test
	public void passwordIsWrongWithNoUpperCase() {
		assertEquals(null,c.checkPassword("upa@123india"));
	}
	@Test
	public void passwordIsWrongWithNoNumber() {
		assertEquals(null,c.checkPassword("Upa@india"));
	}
	@Test
	public void passwordIsWrongWithNoSpecialCharacter() {
		assertEquals(null,c.checkPassword("Upa123india"));
	}

}
