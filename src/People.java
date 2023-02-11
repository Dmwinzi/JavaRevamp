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

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return this.firstname + " " + this.lastname + " " + this.salary + " " +
                this.gender + " " + this.age + " " + this.salary;
    }
}
