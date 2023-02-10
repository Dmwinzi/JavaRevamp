public class People {

    String firstname;

    String lastname;
    int salary;

    int age;
    String gender;

    public People(String firstname, String lastname, int salary, int age, String gender) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.salary = salary;
        this.age = age;
        this.gender = gender;
    }


    @Override
    public String toString() {
        return this.firstname + " " + this.lastname + " " + this.salary + " " +
                this.gender + " " + this.age + " " + this.salary;
    }
}
