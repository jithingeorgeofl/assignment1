package test.junit;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import student.Student;
import student.person.Gender;
import student.school.BaseSchool;
import student.school.BaseStandard;
import student.school.Grades;
import student.school.StandardInterface;

class StudentTest {
	
	private Student student;
	

	@BeforeEach
	public void setUp() {
		
		// Standard declaration
		StandardInterface[]  standards = {
				
				new BaseStandard(
					true,
					5,10,
					Grades.STD1),
				
				new BaseStandard(
						true,
						0,0,
						Grades.STD2),
				
				new BaseStandard(
						true,
						0,0,
						Grades.STD3),
				
		};
		
		// Creating student instance via a static function.
		student = Student.instance(new BaseSchool(
				
				"DonBosco",
				"vaduthala",
				"T123",
				standards
			
				));
		student.setDayScholar(true);
		
		// adding person features in-to student class (as it extends the Person.java)
		student.setAge(10);
		student.setGender(Gender.MALE);
		student.setName("Jithin");
	}
	
	@Test
	public void studentTests() {
		/**
		 * This is a test to assert if the student details are stored correctly
		 */
		assert(student.isDayScholar());
	}
	
	
	@Test
	public void personTests() {
		/**
		 * This is a test to assert if the person details are stored correctly
		 */
		assert(student.getAge() == 10);
		assert(student.getGender() == Gender.MALE);
		assert(student.getName().equals("Jithin"));
	}
	
	@Test
	public void schoolDetailsTest() {
		/**
		 * This is a test to assert if the school details are stored correctly
		 */
		assert(student.school.getSchoolName().equals("DonBosco"));
		assert(student.school.getSchoolAddress().equals("vaduthala"));
		assert(student.school.getSchoolId().equals("T123"));
	}

	@Test
	public void schoolStandardInterface() {
		/**
		 * This is a test to assert if the school - standard Interface details 
		 * are stored correctly
		 */
		assert(student.school.getGrades()[0].isCourseOnGoing() == true);
		assert(student.school.getGrades()[0].getFirstTermMarks() == 5);
		assert(student.school.getGrades()[0].getSecondTermMarks() == 10);

	}

	
	
	
	
	
}
