package student.school;

public class BaseStandard implements StandardInterface{
	
	protected boolean isCourseOnGoing = true;
	
	protected int firstTermMarks = 0;

	protected int secondTermMarks = 0;
	
	protected Grades grade;
	
	public BaseStandard(
			boolean isCourseOnGoing,
			int firstTermMarks,
			int secondTermMarks,
			Grades grade
			) {
		

		this.isCourseOnGoing =isCourseOnGoing;
		
		this.firstTermMarks = firstTermMarks;
		
		this.secondTermMarks =secondTermMarks;
		
		this.grade = grade;
		
	}
	

	@Override
	public Integer getFirstTermMarks() {
		// TODO Auto-generated method stub
		return firstTermMarks;
	}

	@Override
	public Integer getSecondTermMarks() {
		return secondTermMarks;
	}

	@Override
	public Boolean isCourseOnGoing() {
		return isCourseOnGoing;
	}

	@Override
	public Grades getGrade() {
		return grade;
	}
	

}
