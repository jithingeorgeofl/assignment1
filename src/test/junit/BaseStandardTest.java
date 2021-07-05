package test.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import student.school.BaseStandard;
import student.school.Grades;

class BaseStandardTest {
	
	private BaseStandard standard;
	
	@BeforeEach
	public void setUp() {
		
		 standard = new BaseStandard(
				 
				 true,
				 20,
				 30,
				 Grades.STD1);
		 
	}
	
	@Test
	void testForIsCourseOngoing() {
		
		standard.isCourseOnGoing();
		
		assertTrue(
				standard.isCourseOnGoing() == true);
	}
	
	@Test
	void testForFirstTermMarks() {
		
		standard.getFirstTermMarks();
		
		assertTrue(
				standard.getFirstTermMarks().equals(20));
	}
	
	@Test
	void testForSecondTermMarks() {
		
		standard.getSecondTermMarks();
		
		assertTrue(
				standard.getSecondTermMarks().equals(30));
		
	}
	@Test
	void testForGrades() {
		
		standard.getGrade();
		
		assertTrue(
				standard.getGrade().equals(Grades.STD1));
	}
				
}
