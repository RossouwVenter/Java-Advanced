/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

/**
 *
 * @author rosso
 */
public class ManagerTest {

    public static void main(String args[]) {
        Employee e = new Employee(121, "Rom", "111-11-111", 5000);
        Manager m = new Manager(151, "Tom", "444-44-4444", 8000, "admin");

        System.out.println("Manager: " + m.getDetails());
        System.out.println("Employee: " + e.getDetails());
    }
}
