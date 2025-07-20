import java.util.Scanner;
public class EmployeeTest {

   public EmployeeTest() {
   }

   public static void main(String[] var0) {
      Employee emp1 = new Employee();
      Employee emp2 = new Employee();

      Scanner var1 = new Scanner(System.in);
      System.out.printf("======== Welcome to Isidore & Co =========%n");

      System.out.print(" Hey dear employee what is your first name?  ");
      String firstName = var1.nextLine();

      System.out.print(" Please Enter your last name then :  ");
      String lastName = var1.nextLine();

      System.out.printf("---------------------------------------------%n");

      double Salary1 = 60000.00;
      double Salary2 = 90000;

      emp1.setfirstName(firstName);
      emp1.setlastName(lastName);
      emp1.setyearlySalary(Salary1);
      
      System.out.printf("---------------------------------------------%n");
      
      System.out.print(" Now enter the second employee's first name?  ");
      String firstName2 = var1.nextLine();

      System.out.print(" Then enter the last name then :  ");
      String lastName2 = var1.nextLine();

      emp2.setfirstName(firstName2);
      emp2.setlastName(lastName2);
      emp2.setyearlySalary(Salary2);

      System.out.printf(" dear Employee, :%s  %s   your yearly salary is %f %n", emp1.getfirstName(), emp1.getlastName(), emp1.getyearlySalary(),"%n" );

      System.out.printf("%s  %s   your yearly salary is %f %n", emp2.getfirstName(), emp2.getlastName(), emp2.getyearlySalary(),"%n" );
      System.out.printf("---------------------------------------------%n");
      System.out.printf("The board decided that you deserve a 105 raise %n");
      System.out.printf("---------------------------------------------%n");

      Salary1 = Salary1 +(10*Salary1)/100.0;
      Salary2 = Salary2 +(10*Salary2)/100.0;
      emp2.setyearlySalary(Salary2);
      emp1.setyearlySalary(Salary1);
      System.out.printf(" Your new salaries are %n %s  %s    %f%n", emp1.getfirstName(), emp1.getlastName(), emp1.getyearlySalary(),"%n" );
      System.out.printf(" %s  %s   your yearly salary is %f %n", emp2.getfirstName(), emp2.getlastName(), emp2.getyearlySalary(),"%n" );

      var1.close();
   }
}