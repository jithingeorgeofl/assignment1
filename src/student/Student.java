package student;

import person.Person;
import school.BaseSchool;
import school.SchoolInterface;

public class Student extends Person{
	
	public SchoolInterface school;
		
	private Student(SchoolInterface school) {
		this.school=school;
	}
		
	
			
	public static Student instance(BaseSchool school) {
		
		return new Student(school);
		
	}
	
	
	
	
}	


