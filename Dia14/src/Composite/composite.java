
package Composite;

// composite

import java.util.ArrayList;
import java.util.List;


//permite tratar objetos individuales y composicion de objetos de manera uniforme

public class composite {
    
    static abstract class Employee{
        protected String name;
        protected String Position;

        public Employee(String name, String Position) {
            this.name = name;
            this.Position = Position;
        }
        abstract void ShowDetails();
    
    
    }
    static class Developer extends Employee{

        public Developer(String name) {
            super(name , "desarrollador");
        }
    
       @Override 
        void ShowDetails(){
            System.out.println(Position +":"+ name);
           
        
        }
    }
    static class Manager extends Employee{
        private List<Employee> subordinados = new ArrayList<>();
        

        public Manager(String name) {
            super(name, "gerente");
        }
        public void addEmployed(Employee emp){
        
            subordinados.add(emp);
        }
    
        @Override 
        void ShowDetails(){
            System.out.println(Position +":"+ name);
            for(Employee e : subordinados){
            
                e.ShowDetails();
            }
        
        }
        
    }
    public static void main(String[] args) {
        Manager manager = new Manager("Carlos");
        manager.addEmployed(new Developer("Ana")); 
        manager.addEmployed(new Developer("Juan")); 
        manager.ShowDetails();
    }
    
}
