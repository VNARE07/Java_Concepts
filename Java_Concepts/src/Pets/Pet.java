package Pets;

public class Pet {
    int id;
    String name;
    int stock;
    public Pet(int id, String name, int stock){
        this.id = id;
        this.name = name;
        this.stock = stock;
    }
    public int getId(){
        return this.id;
    }
    public String getName(){
        return this.name;
    }
    public int getStock(){
        return this.stock;
    }
    public void setId(int id){
        this.id = id;
    }
    public void setName(String name){
        this.name = name;
    }
    public void setStock(int stock){
        this.stock = stock;
    }
}
