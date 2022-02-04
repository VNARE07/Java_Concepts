package Pets;

public class Tester {
    public static void main(String[] args) {
        User cust = new Customer();
        User admin = new Admin();
        PetManagementSystem p = new PetManagementSystem();
        cust.addPet(p);
        admin.addPet(p);
    }
}
