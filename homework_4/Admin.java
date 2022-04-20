public class Admin extends HalykAcademyStaff {
    private String role;
    private boolean homeworkChecked;

    // empty constructor
    public Admin() {}

    public Admin(String role, boolean homeworkChecked, String name, int age) {
        this.homeworkChecked = homeworkChecked;
        this.role = role;
        setName(name);
        setAge(age);
    }

    // getter & setters
    public String getRole() { return role; }

    public void setRole(String role) { this.role = role; }

    public boolean isHomeworkChecked() { return homeworkChecked; }

    public void setHomeworkChecked(boolean homeworkChecked) { this.homeworkChecked = homeworkChecked; }

    @Override
    public String toString() {
        return super.toString() + "\nRole: " + getRole() + "\nHomework Checked? " + isHomeworkChecked();
    }
}