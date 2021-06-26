package assignment1;

import school.BaseSchool;
import school.BaseStandard;
import school.Grades;
import school.StandardInterface;

public class EntryPoint {
	
	public static void main(String []args) {
		
		StandardInterface[]  standards = {
				
				new BaseStandard(
					true,
					0,0,
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
		
		BaseSchool donBosco = new BaseSchool(
				
				"Donboaco",
				"vaduthala",
				"T123",
				standards
			
				);
		
		
	}

}
