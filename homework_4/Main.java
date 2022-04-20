public class Main {
    public static void main(String[] args) {

        // Creating objects by calling constructors
        HalykAcademyStaff employee1 = new HalykAcademyStaff("Nurzhan", 20);
        Admin admin1 = new Admin("Admin", true, "Mike", 27);

        System.out.println(admin1.getName() + "'s role is: " + admin1.getRole());
        System.out.println("*********************");
        System.out.println(admin1.toString());
        System.out.println("*********************");
        System.out.println(employee1.toString());
    }
}