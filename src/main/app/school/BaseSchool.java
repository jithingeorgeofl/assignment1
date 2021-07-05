package school;

public class BaseSchool implements SchoolInterface {

    String schoolName;
    String schoolID;
    String schoolAddress;
    StandardInterface[] grades;


    public BaseSchool(
            String schoolName,
            String schoolAddress,
            String schoolID,
            StandardInterface[] grades
    ) {

        this.schoolName = schoolName;
        this.schoolID = schoolID;
        this.schoolAddress = schoolAddress;
        this.grades = grades;

    }

    @Override
    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String getSchoolAddress() {
        return schoolAddress;
    }

    @Override
    public String getSchoolId() {
        return schoolID;
    }

    @Override
    public StandardInterface[] getGrades() {
        return grades;
    }


}
