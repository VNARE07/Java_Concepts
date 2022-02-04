package Pets;

import java.util.HashMap;

public class PetManagementSystem {
    int id;
    HashMap<Integer, Pet> pets = new HashMap<Integer, Pet>();
    public PetManagementSystem(){
        this.id = 1;
    }
    public void addPet(String name,int stock){
        if (this.pets.containsKey(id)){
            this.updatePet(id,name,stock);
        }
        else{
            Pet pet = new Pet(id,name,stock);
            this.pets.put(id,pet);
        }
        this.id = this.id + 1;
    }
    private void updatePet(int id,String name,int stock) {
        if (this.pets.containsKey(id)){
            Pet pet = this.pets.get(id);
            pet.setStock(pet.getStock() + stock);
            pet.setName(name);
        }
        else{
            System.out.println("no pet found");
        }
    }
    public void updatePet(int id, int stock) {
        if (this.pets.containsKey(id)){
            Pet pet = this.pets.get(id);
            int s = pet.getStock() + stock;
            if (s >= 0){
                pet.setStock(s);
            }
            else{
                this.pets.remove(id);
            }
        }
        else{
            System.out.println("no pet found");
        }
    }
    public void updatePet(int id, String name) {
        if (this.pets.containsKey(id)){
            Pet pet = this.pets.get(id);
            pet.setName(name);
        }
        else{
            System.out.println("no pet found");
        }
    }
    public void removePet(int id,int stock){
        stock = stock * -1;
        this.updatePet(id, stock);
    }
    public void removePet(String name,int stock){
        stock = stock * -1;
        int id = -1;
        Pet pet;
        for (int i : this.pets.keySet()) {
            if (name.equals(this.pets.get(i))){
                id = i;
                break;
            }
        }
        if (id == -1){
            System.out.println("pet not found");
        }
        else{
            this.updatePet(id, stock);
        }
    }
}
