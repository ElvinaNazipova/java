/*public class Main {
   
   public static void main(String[] args) {
      
      int age = 2;
      
      if (age>=75) {
         System.out.println("Хорошо, вы стары");
      }
      else if (age>=18) {
         System.out.println("Вы взрослый");
      }
      else {
         System.out.println("Вам нет 18. Пока");
      }
   }
}*/

/*public class Main {
   
   public static void main (String[] args) {
      
      String day = "Вторник";
      
      switch (day) {
         case "Понедельник": System.out.println("Сегодня понедельник");
         break;
         case "Вторник": System.out.println("Сегодня вторник");
         break;
         case "Среда": System.out.println("Сегодня среда");
         break;
         case "Четверг": System.out.println("Сегодня четверг");
         break;
         case "Пятница": System.out.println("Сегодня пятница");
         break;
         case "Суббота": System.out.println("Сегодня суббота");
         break;
         case "Воскресенье": System.out.println("Сегодня воскресенье");
         break;
         default: System.out.println("Нет совпадений");
      }
      
      
   }
}
*/

/*public class Main {
public static void main (String[] args) {
   int x=0, y=0;
   x=5;
   y=x++;
   System.out.println("Постфиксная форма (y=x++;):");
   System.out.println("y="+y);
   System.out.println("x="+x);
   x=5;
   y=++x;
   System.out.println("Пефиксная форма (y=++x;):");
   System.out.println("y="+y);
   System.out.println("x="+x);
   
   
}
}
*/ 

import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      Scanner in = new Scanner (System.in);
      int x = 0;
      System.out.println("Введите целое число: ");
      x = in.nextInt();
      if (x % 2 == 0)
         System.out.println(x + "- четное число");
      else
         System.out.println(x + "- нечетное число");
      System.out.println();
         
      
   }
}

