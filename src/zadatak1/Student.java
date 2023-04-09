package zadatak1;

public class Student {
    private String firstName;
    private String lastName;
    private int age;

    public Student(final String firstName, final String lastName) {
        this(firstName, lastName, age: 0);
    }

    public Student(final String fn, final String lastName, final int age) {
        this.firstName = fn;
        this.lastName = lastName;
        this.age = age;
    }
    public String getFirstName () { return firstName; }

    public void setFirstName(final String firstName) { this.firstName = firstName; }

    public String getLastName() { return lastName; }

    public void setLastName(final String lastName) { this.lastName = lastName; }

    public int getAge() { return age; }

    public void setAge(final int age) { this.age = age; }

    public void printPerson () {
        System.out.println("Hi, my name is " + firstName + " " + lastName + " and I'm " + age + "years old");
    }
    public void age() { age++; }

}


