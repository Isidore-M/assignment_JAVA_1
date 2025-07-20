
public class DateTest {

   public DateTest() {
   }

   public static void main(String[] var0) {
     Date date1 = new Date();
     System.out.printf("======== Welcome to Day-indicator =========%n");
     int Year1 = 2025;
     int Month1 = 07;
     int Day1 = 15;
       
      date1.setYear(Year1);
      date1.setMonth(Month1);
      date1.setDay(Day1);
      System.out.printf(" Today is %d / %d / %d %n", date1.getDay(), date1.getMonth(), date1.getYear() );

   }

}