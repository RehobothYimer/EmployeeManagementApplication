package org.example;

public class Employee {

    private String name;
    private  double salary;
    private int id;
    private String department;

    public Employee(String name, int id, double salary, String department) {
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public  void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setSalary(double salary){
        this.salary=salary;
    }
    public double getSalary(){
        return salary;
    }
    public void setDepartment(String department){
        this.department=department;
    }
    public String getDepartment(){
        return department;
    }
     public Employee(){
        this.name=name;
        this.salary=salary;
        this.id=id;
        this.department=department;
     }

     // overide used to over write the logic of this class
        //super used to call parent class or method
        @Override
        public String toString() {
            return super.toString();
        }
    }
