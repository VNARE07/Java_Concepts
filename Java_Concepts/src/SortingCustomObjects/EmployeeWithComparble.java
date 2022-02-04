package SortingCustomObjects;

public class EmployeeWithComparble implements Comparable<EmployeeWithComparble> {

    int id,dept;
    String name;
    double sal;
    public EmployeeWithComparble(int id, String name,int dept,double sal){
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.dept = dept;
    }
    @Override
    public int compareTo(EmployeeWithComparble o) {
        // TODO Auto-generated method stub
        if (this.id < o.id){
            return -1;
        }
        else if (this.id > o.id){
            return 1;
        }
        return 0;
    }
    public String toString(){
        return "" + this.id + " " + this.name + " " + this.sal + " " + this.dept;
    }
    
}
