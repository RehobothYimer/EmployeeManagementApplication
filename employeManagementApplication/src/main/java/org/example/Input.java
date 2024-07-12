package org.example;

import java.util.Scanner;

public class Input {

    Scanner scan = new Scanner(System.in);
    EmployeeImplementation employeeImplementation = new EmployeeImplementation();

    public void input() {
        while (true) {
            System.out.println("Welcome to Employee management Application:");
            System.out.println("1. Add Employee:");
            System.out.println("2. Show All Employees:");
            System.out.println("3. Show  Employee:");
            System.out.println("4. Remove Employee:");
            System.out.println("5. update Employee :");
            System.out.println("6. Exit :");
    int choice = scan.nextInt();
     switch (choice){
         case 1:
        employeeImplementation.addEmp();
        break;
         case 2:
             employeeImplementation.showAllEmp();
             break;
         case 3:
             employeeImplementation.showEmp();
             break;
         case 4:
             employeeImplementation.removeEmp();
             break;
         case 5:
             employeeImplementation.updateEmp();
             break;
         case 6:
             System.out.println("Thank you for Using Application !!");
             System.exit(0);
             break;
         default:
             System.out.println("Please Enter Valid Choice !");
     }

        }
    }
}
