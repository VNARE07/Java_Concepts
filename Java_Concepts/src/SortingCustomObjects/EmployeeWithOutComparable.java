package SortingCustomObjects;

public class EmployeeWithOutComparable {
    int id,dept;
    String name;
    double sal;
    public EmployeeWithOutComparable(int id, String name,int dept,double sal){
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.dept = dept;
    }
    public String toString(){
        return "" + this.id + " " + this.name + " " + this.sal + " " + this.dept;
    } 
}
