package org.example;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;

public class EmployeeImplementation implements Choise{
    Scanner scan = new Scanner(System.in);
 HashSet<Employee> emp = new HashSet<Employee>();


 String name;
 int id;
 String department;
 double salary;
 public EmployeeImplementation(){
    emp = new HashSet<Employee>();

 }
 //  Employee employee = new Employee(name,id,salary,department);
   @Override
    public void addEmp() {
 name = scan.next();
       System.out.println("Enter Employee Name:" + name);
       id = scan.nextInt();
       System.out.println("Enter Employee ID: "+ id);
       salary = Double.parseDouble(scan.next());
       System.out.println("Enter Employee salary:"+ salary);
       department = scan.next();
       System.out.println("Enter Employee department:"+ department);

       Employee emp1 = new Employee(name,id,salary,department);
       if(emp.add(emp1)){
           System.out.println("Employee added successfully!");
       }else {
           System.out.println("Employee with this ID already exists.");
       }
  }

    @Override
    public void showAllEmp() {

     for(Employee checkEm: emp)
     if (!emp.isEmpty()){
         System.out.println(checkEm);
     }
    }

    @Override
    public void showEmp() {
//MATCH THE names and salary, if so then print
       id = scan.nextInt();
        System.out.println("Enter id of employee"+ id);

     for(Employee checkEmp: emp){
      //   if(name1.matches(name)){// getId is more efficient way than using match but match is also good approach
         if(checkEmp.getId() == id){
             System.out.println("Employee found:" + checkEmp);
         }else {
             System.out.println("name did not match, please enter valid name!");
         }
     }
    }

    @Override
    public void removeEmp() {
  id = scan.nextInt();
  System.out.println("Enter employee id to remove:");
   Employee empToRemove = null;
   boolean found=false;
   for(Employee checkEmp: emp) {
       if (checkEmp.getId() == id) {
           checkEmp = empToRemove;
           found = true;
       }
   }
        if(!found) {
            System.out.println("Employee is not present");
        }else {
            emp.remove(empToRemove);
            System.out.println("Employee deleted successfully!!");
      }
 }

    @Override
    public void updateEmp() {

        id = scan.nextInt();
        System.out.println("Enter Employee ID: "+ id);

        department = scan.next();
        System.out.println("Enter Employee department:"+ department);

     for(Employee checkEmp: emp){
      if(checkEmp.getId() == id){

          System.out.println("Enter  Name:" + name);
          name = scan.next();
          System.out.println("Enter new salary:"+ salary);
          salary = Double.parseDouble(scan.next());
          checkEmp.setName(name);
          checkEmp.setSalary(salary);
          System.out.println("Updated Details of employee are: ");
          System.out.println(checkEmp);
          System.out.println("Employee details updated successfully !!");
         // Employee emp1 = new Employee(name,id,salary,department);
          //emp.add(emp1);
      }else {
          System.out.println("Employee is not present");
      }
     }
    }
}
