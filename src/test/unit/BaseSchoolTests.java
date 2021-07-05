package unit;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import school.BaseSchool;
import school.BaseStandard;
import school.Grades;
import school.StandardInterface;

class BaseSchoolTests {

    private BaseSchool base;

    @BeforeEach
    public void setUp() {

        StandardInterface[] standards = {

                new BaseStandard(
                        true,
                        0, 1,
                        Grades.STD1),

                new BaseStandard(
                        true,
                        0, 0,
                        Grades.STD2),

                new BaseStandard(
                        true,
                        0, 0,
                        Grades.STD3),

        };

        base = new BaseSchool(
                "Don Bosco",
                "Vaduthala",
                "DB",
                standards

        );

    }


    @Test
    void testForSchoolName() {
        //to check if the app.school name is correct
        base.getSchoolName();

        assertTrue(
                base.getSchoolName().equals("Don Bosco")
        );
    }


    @Test
    void testForSchoolAddress() {
        //to check if the app.school address is correct
        base.getSchoolAddress();

        assertTrue(
                base.getSchoolAddress().equals("Vaduthala")
        );
    }


    @Test
    void testForSchoolID() {
        //to check if the ID name is correct
        base.getSchoolId();

        assertTrue(
                base.getSchoolId().equals("DB")
        );


    }

    @Test
    void testForGrades() {
        //to check if the app.school name is correct
        assertTrue(
                base.getGrades()[0].getFirstTermMarks() == 0
        );

        assertTrue(
                base.getGrades()[0].getSecondTermMarks() == 1
        );

        assertTrue(

                base.getGrades()[0].getGrade().equals(Grades.STD1)

        );

        assertTrue(
                base.getGrades()[1].getFirstTermMarks() == 0
        );

        assertTrue(
                base.getGrades()[1].getSecondTermMarks() == 0
        );

        assertTrue(

                base.getGrades()[1].getGrade().equals(Grades.STD2)


        );
        assertTrue(
                base.getGrades()[2].getFirstTermMarks() == 0
        );

        assertTrue(
                base.getGrades()[2].getSecondTermMarks() == 0
        );

        assertTrue(

                base.getGrades()[2].getGrade().equals(Grades.STD3)

        );

    }


}
