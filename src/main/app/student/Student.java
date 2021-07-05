package student;

import student.person.Person;
import student.school.BaseSchool;
import student.school.SchoolInterface;

public class Student extends Person{
	
	public SchoolInterface school;	
	
	private boolean isDayScholar = false;

	
	public boolean isDayScholar() {
		return isDayScholar;
	}



	public void setDayScholar(boolean isDayScholar) {
		this.isDayScholar = isDayScholar;
	}


	
	private Student(SchoolInterface school) {
		this.school=school;
	}
		
	
			
	public static Student instance(BaseSchool school) {
		
		return new Student(school);
		
	}
	
	
	
	
}	


