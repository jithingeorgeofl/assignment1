package person;

/**
 * This is to store the details of the app.person
 *
 * @author JITHIN GEORGE
 */
public class Person {
    //to store the students age
    int age;
    //to store the  students gender
    Gender gender;
    //to store the students name
    String name;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
