package test.junit;
import static org.junit.Assert.assertTrue;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import person.Gender;
import person.Person;

class PersonTest {
	
	
	private Person person;
	
	
	@BeforeEach
	public void setUp() {
		person = new Person();
	}
	

	@Test
	void testForName() {
		// check if the name setting is working as expected.
		person.setName("jithin");
		
		assertTrue(
				person.getName().equals("jithin")
				);
		
	}

	@Test
	void testForAge() {
		// check if the age setting is working as expected.
		person.setAge(27);
		
		assertTrue(
				person.getAge() == 27
				);
		
	}

	@Test
	void testForGender() {
		// check if the gender setting is working as expected.
		person.setGender(Gender.MALE);
		
		assertTrue(
				person.getGender().equals(Gender.MALE)
				);
		
	}

	
}
