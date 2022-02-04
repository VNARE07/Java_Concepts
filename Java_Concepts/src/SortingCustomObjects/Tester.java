package SortingCustomObjects;

import java.util.ArrayList;
import java.util.Collections;

public class Tester {
    public static void main(String[] args) {
        ArrayList<EmployeeWithComparble> l1 = new ArrayList<EmployeeWithComparble>();
        l1.add(new EmployeeWithComparble(3,"varun",10,1000));
        l1.add(new EmployeeWithComparble(2,"tony",10,1000));
        l1.add(new EmployeeWithComparble(4,"stark",10,1000));
        l1.add(new EmployeeWithComparble(1,"Random",10,1000));
        Collections.sort(l1);
        for (EmployeeWithComparble employeeWithComparble : l1) {
            System.out.println(employeeWithComparble);
        }
    }
}
