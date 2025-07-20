import java.util.Scanner;
// Exercise 2.14
/* 
 Write an application that displays the numbers 1 to 4 on the same line, 
 with each pair of adjacent numbers separated by one space. 
 Use the following techniques:
*/

// a 
public class ExercisesChapII {
   public ExercisesChapII() {
   }

   public static void main(String[] var0) {
      System.out.printf("=================%n");
      System.out.printf("Exercise 2.14 %n");
      System.out.printf("-----------------%n");
      // a- Use one System.out.println statement.
      System.out.println(" 1 2 3 4");
      // b- Use four System.out.print statements.
      System.out.print(" 1 ");
      System.out.print("2 ");
      System.out.print("3 ");
      System.out.print("4 ");
      // c- Use one System.out.printf statement.
      System.out.printf("%n 1 2 3 4 %n");
      System.out.printf("=================%n");

// Exercise 2.15
/* 
 (Arithmetic) Write an application that asks the user to enter two integers, 
 obtains them from the user and prints their sum, product, difference and quotient (division). 
*/    System.out.printf("================= %n");
      System.out.printf("Exercise 2.15 %n");
      System.out.printf("-----------------%n");
      Scanner input = new Scanner(System.in);

         System.out.printf(" Hi i will need you to enter 2 number so i could do some Arithmetic %n");
         System.out.printf("------------%n");

         System.out.print("Please, enter  the first number : ");
         int number1 = input.nextInt();

         System.out.print("Now the Second one : ");
         int number2 = input.nextInt();

         int sum = number1+number2;
         int diff = number1-number2;
         double quot = number1/number2;
         int prod = number1*number2;

         System.out.printf(" the Sum of these numbers is : %d%n", sum);
         System.out.printf(" the difference is : %d%n", diff);
         System.out.printf(" the product is : %d%n", prod);
         System.out.printf(" and finally the quotient is : %f%n", quot);
         System.out.printf("================= %n");
// Exercise 2.16
/* 
 Write an application that displays the numbers 1 to 4 on the same line, 
 with each pair of adjacent numbers separated by one space. 
 Use the following techniques:
*/  
         
         System.out.printf("================= %n");
         System.out.printf("Exercise 2.16 %n");
         System.out.printf("-----------------%n");
         System.out.printf(" Hey, welcome to your intergers comparator %n");
         System.out.printf("-----------------%n");
         
         System.out.print("Please, enter  the first Integer : ");
         int integer1 = input.nextInt();

         System.out.print("Enter another one : ");
         int integer2 = input.nextInt();
            if (integer1>integer2) {
               System.out.printf("the %d is larger than %d%n", integer1, integer2);}
            else if(integer2>integer1) {
               System.out.printf("the %d is larger than %d%n", integer2, integer1);
          }
          else
          {
            System.out.printf("These integers are equals %n");
          }

         System.out.printf("================= %n");

// Exercise 2.24
/* 
 Displaying Shapes with Asterisks) Write an application that displays a box, an oval, an arrow and a diamond using asterisks (*)
*/ 

         System.out.printf("================= %n");
         System.out.printf("Exercise 2.17 %n");
         System.out.printf("-----------------%n");
         System.out.printf("Who's the lasgest and who's the samllest?  to find out, give me 3 integers %n");
         System.out.printf("-----------------%n");

         System.out.printf(" What is the first integer? ");
         int integera = input.nextInt();
         System.out.printf(" Give me the second :  ");
         int integerb = input.nextInt();
          System.out.printf(" And finally a third one :  ");
         int integerc = input.nextInt();

         int largest = 0;
         if(integera>=integerb){
            largest = integera;
         }
         else if (integera<=integerb){
            largest = integerb;
         }
         if (largest>=integerc) {
            System.out.printf("%d is the largest integer %n",largest); 
         }
         else{
            System.out.printf("%d is the largest integer %n",integerc);
         }

       System.out.printf("================= %n");

// Exercise 2.24
/* 
 Displaying Shapes with Asterisks) Write an application that displays a box, an oval, an arrow and a diamond using asterisks (*)
*/ 
      System.out.printf("================= %n");
         System.out.printf("Exercise 2.24 %n");
         System.out.printf("-----------------%n");
         System.out.printf("My drawing program %n");
         System.out.printf("---------------------------------------------------------------%n");

         System.out.println(" **********        ***            *            *          ");
         System.out.println(" *        *     *       *        ***         *   *        ");
         System.out.println(" *        *   *           *     *****      *      *       ");
         System.out.println(" *        *   *           *       *      *          *     ");
         System.out.println(" *        *   *           *       *    *              *   ");
         System.out.println(" *        *   *           *       *      *           *    ");
         System.out.println(" *        *   *           *       *        *        *     ");
         System.out.println(" *        *     *       *         *          *    *       ");
         System.out.println(" **********       *****           *            *          ");

         System.out.printf("---------------------------------------------------------------%n");
         input.close();
   }


}