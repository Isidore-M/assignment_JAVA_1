public class Employee {
     private String firstName; 
     private String lastName;
     private double yearlySalary;
    

     public void setfirstName (String firstName) {
        this.firstName = firstName;
    }

     public void setlastName(String lastName) {
        this.lastName = lastName;
    }

     public void setyearlySalary(double monthSalary) {
        this.yearlySalary= monthSalary;
    }

  
     
     public String getfirstName() {
         return firstName; 
     }

     public String getlastName() {
         return lastName; }

     public double getyearlySalary() {
         return yearlySalary; 
        }
        
    }
