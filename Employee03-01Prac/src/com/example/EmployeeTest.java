package com.example;

import com.example.domain.Admin;
import com.example.domain.Director;
import com.example.domain.Engineer;
import com.example.domain.Manager;

public class EmployeeTest {

    public static void main(String[] args) {

        Engineer eng = new Engineer(101, "Jane Smith","012345678", 120_345.27);
        Manager mgr = new Manager(207, "Barbara Johnson", "054122367", 109_501.36, "Us Marketing");
        Admin adm = new Admin(304,"Bill Munroe","108236509",75_002.34);
        Director dir = new Director(12, "Susan Wheeler","099452340", 120_567.36, "Global Marketing", 1_000_000.00);

//        emp.setEmpId(101);
//        emp.setName("Jane Smith");
//        emp.setSsn ("012-34-5678");
//        emp.setSalary(120_345.27);
        eng.printEmployee();
        adm.printEmployee();
        mgr.printEmployee();
        dir.printEmployee();
    }
}
