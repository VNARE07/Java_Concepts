package Pets;

import java.util.Scanner;

public class Admin implements User{

    @Override
    public void addPet(PetManagementSystem p) {
        // TODO Auto-generated method stub
        System.out.println("enter name of  which pet to remove");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter Quantoity of pets to remove");
        int stock = sc.nextInt();
        sc.nextLine();
        p.addPet(name, stock);
    }

    @Override
    public void updatePetName(PetManagementSystem p) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id of pets to remove");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("enter name of  which pet to remove");
        String name = sc.nextLine();
        p.updatePet(id, name);
    }

    @Override
    public void removePet(PetManagementSystem p) {
        // TODO Auto-generated method stub
        System.out.println("enter name of  which pet to remove");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Enter Quantoity of pets to remove");
        int q = sc.nextInt();
        sc.nextLine();
        p.removePet(name, q);
    }

    @Override
    public void Order(PetManagementSystem p) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void getStatus(PetManagementSystem p) {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void updatePetStock(PetManagementSystem p) {
        // TODO Auto-generated method stub
        
    }
    
}
