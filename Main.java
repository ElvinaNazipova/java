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

/*import java.util.Scanner;

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
}*/

//Чтение символа с клавиатуры
/*public class Main {
   public static void main (String[] args) 
      throws java.io.IOException { //констр.должна быть указана, потому что примен. system read а поэтому треб.обработка ошибок ввода
         char ch;
         System.out.println("Нажмите клавишу и затем ENTER: ");
         ch = (char) System.in.read();
         System.out.println("Была нажата клавиша: " + ch);
      }
   
}
*/

/*public class Main {
   public static void main (String[] args)
   throws java.io.IOException {
      char ch, answer = 'K'; //тип данных для хранения одного символа
      
      System.out.println("Задумана буква между A и Z. ");
      System.out.println("Попробуй ее угадать");
      ch = (char) System.in.read ();
      if (ch == answer) System.out.println("**Правильно**");
      else {
         System.out.println("...Увы, не угадали. Задуманная буква находится ");
      
      //вложенный оператор if
      
      if (ch < answer) System.out.println("Дальше по алфавиту.");
      else System.out.println("Ближе к алфавиту");
   }
   }
   }
*/

/*public class Main {
   public static void main (String[] args) {
      int x;
      for (x=0; x<6; x++) {
         if (x==1)
            System.out.println("Значение x равно 1");
         else if(x==2)
            System.out.println("Значение x равно 2");
         else if(x==3)
            System.out.println("Значение x равно 3");
         else if(x==4)
            System.out.println("Значение x равно 4");
         else 
            System.out.println("Значение x не находится между 1 и 4");
         
      }
      }
   }
*/

/*public class Main {
   public static void main (String []args) 
         throws java.io.IOException {
      char choice;
      System.out.println("Справка по:");
      System.out.println("  1. if");
      System.out.println("  2. switch");
      System.out.println("Выберите вариант: ");
      choice = (char) System.in.read ();
      
      System.out.println("\n");
      switch (choice) {
      case '1':
         System.out.println("Оператор if:\n");
         System.out.println("if (условие) оператор;");
         System.out.println("else оператор");
         break;
      case '2':
         System.out.println("Традиционный оператор switch:\n");
         System.out.println("switch(выражение) {");
         System.out.println(" case константа:");
         System.out.println("последовательность операторов");
         System.out.println("break;");
         System.out.println(" // ...");
         System.out.println("}");
         break;
         default:
         System.out.print("Выбранный вариант не найден.");
      }
            
      
   }
}*/

/*public class Main {
   public static void main (String[] args) {
       for (int i = 1; i<6; i++) {
         System.out.print(i + " ");
      }
      
   }
}
*/

/*public class Main {
   public static void main (String[] args) {
       for (int i = 1; i<=10; i++) {
         System.out.println("3*" +i + "=" + 3*i);
       }
   }
}
*/

/*import java.util.Scanner;
public class Main {
   public static void main (String[] args) {
      System.out.println("Введите любое целое число");
      Scanner in = new Scanner (System.in);
      int n = in.nextInt();
      int sum=0;
      for (int i=1; i<=n; i++) {
         sum = sum + i;
      }
      System.out.println(sum);
      
   }
      
   }
   
      */

/*public class Main {
   public static void main (String []args) {
      int i = 1;
      while (i <=100) {
         System.out.println(i);
         i++;
      }
   }
}*/

/*public class Main {
   public static void main (String[] args) {
      int i = 7; //последоват чисел начинается с 7
      while (i <=98) {
         System.out.println (i+"");
         i+=7; //увеличиваем переменную на 7
      }
   }
}
*/
/*public class Main {
   public static void main (String[] args) {
      int i = 1; //последоват чисел начинается с 1
      while (i <=512) {   // чтобы цикл выполнялся до тех пор пока будет мненьше или равно 512
         System.out.println (i+"");
         i*=2; //каждый раз значение умножалось на 2
      }
   }
}
*/

/*public class Main {
   public static void main (String[] args) {
      int t = 5;
      do {
         System.out.println(t);
         t+=3;
      } while  (t<=100);
      }
   }
*/

/*public class Main {
   public static void main (String[] args) {
      for (int i= 1; i <=100; i++) {
         if (i > 4 && i < 11) continue;
         System.out.println(i);
      }
   }
   }
*/

/*public class Main {
   public static void main (String[] args) {
      int i = 1;
      while (true) {
         if (i > 100) break;
         System.out.println(i);
         i++;
      }
      }
   }
*/

/*import java.util.Scanner;
public class Main {
   public static void main (String[] args) {
      int x = 0, result = 0; //result - хранит значение результата
      Scanner in = new Scanner (System.in);
      System.out.println("Введите число 0 для получения результата\n");
      for ( ; ; ) {
         System.out.println("Введите число: ");
         x = in.nextInt();
         if (x == 0) break;
         result += x;
      }
      System.out.println("Сумма чисел равна: "+result);
    }
         
   }
*/

/*public class Main {
   public static void main (String[] args) {
      int population = 10000000;
      int birth = 14;
      int death = 8;
      int dif = birth - death;
      for (int i = 1; i<=10; i++) {
         population +=population * dif / 1000;
      }
      System.out.println(population);
   }
}
*/
/*import java.util.Scanner;
public class Main {
   public static void main (String[] args) {
      Scanner in = new Scanner(System.in);
      System.out.println("Введите сумму вклада: ");
      float sum = in.nextInt();
      System.out.println("Введите срок вклада в месяцах: ");
      int period = in.nextInt();
      
      for (int i =1; i <= period; i++) {
         sum += sum * 0.007;
      }
      System.out.printf("После %d месяцев сумма вклада составит %f", period, sum);
      in.close();
      }
      
      
      
   }
*/



public class Main {
   public static void main (String []args) 
      throws java.io.IOException {
          char ch;
          System.out.println("Нажмите клавишу");
          ch = (char) System.in.read() ;
          int i = '.';
          while (ch == '.');
          }
       
                
      }
      
      
   
}