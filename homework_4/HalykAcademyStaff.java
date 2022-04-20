public class HalykAcademyStaff {
    // data fields
    private String name;
    private int age;
    private String role;

    // empty constructor
    public HalykAcademyStaff() {}

    // constructor with specific parameters
    public HalykAcademyStaff(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getters and setters
    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // methods
    public String toString() {
        return "Employee name: " + this.name + "\nAge: " + this.age;
    }
}