package comparable;

public class Employee{
    String name;
    String lastName;
    int age ;


    public Employee(String name, String lastName, int age){
        this.age=age;
        this.lastName=lastName;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", age=" + age +
                '}';
    }


//    @Override
//    public int compareTo(Employee o) {
//        return this.age-o.age;
//    }
}
