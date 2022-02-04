package SortingCustomObjects;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TesterEWC {
    public static void main(String[] args) {
        ArrayList<EmployeeWithOutComparable> l1 = new ArrayList<EmployeeWithOutComparable>();
        l1.add(new EmployeeWithOutComparable(3,"varun",10,1000));
        l1.add(new EmployeeWithOutComparable(2,"tony",10,1000));
        l1.add(new EmployeeWithOutComparable(4,"stark",10,1000));
        l1.add(new EmployeeWithOutComparable(1,"Random",10,1000));
        Comparator<EmployeeWithOutComparable> compareid = new Comparator<EmployeeWithOutComparable>(){
            @Override
            public int compare(EmployeeWithOutComparable o1, EmployeeWithOutComparable o2) {
                // TODO Auto-generated method stub
                if (o1.id < o2.id){
                    return -1;
                }
                else if (o1.id > o2.id){
                    return 1;
                }
                return 0;
            }
        };
        Comparator<EmployeeWithOutComparable> comparename = new Comparator<EmployeeWithOutComparable>(){
            @Override
            public int compare(EmployeeWithOutComparable o1, EmployeeWithOutComparable o2) {
                // TODO Auto-generated method stub
                return o1.name.compareTo(o2.name);
            }
        };
        Collections.sort(l1,comparename);
        for (EmployeeWithOutComparable employeeWithComparble : l1) {
            System.out.println(employeeWithComparble);
        }
        Collections.sort(l1,compareid);
        for (EmployeeWithOutComparable employeeWithComparble : l1) {
            System.out.println(employeeWithComparble);
        }
    }
}
