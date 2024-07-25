
/*public class Main {
   public static void main(String[] args) {
         
      int x=123; 
      double y=3.14;
      boolean z = true;
      char sumba='$';
      String name = "Elvina";
      
      System.out.println("My name:" + name +x+y+sumba+z );
   

   }

}
*/

/*public class Main {
   public static void main(String[]args) {
      
      String x = "water";
      String y = "kool-Aid";
      String temp;
      
      temp=x;
      x=y;
      y=temp;
         
      System.out.println("x: "+x);
      System.out.println("y: "+y);

   }
}
*/

/*import java.util.Scanner;

public class Main {
   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Hello, my friend. What is your name?");
      String name =  scanner.nextLine();
      
      System.out.println("How old are you ?");
      int age = scanner.nextInt();
      scanner.nextLine();
      
      System.out.println("Какая твоя любимая еда ?");
      String food = scanner.nextLine();
      
      System.out.println("Hello "+name);
      System.out.println("You are "+age+" years old");
      System.out.println("Моя любимая еда "+food);
      

   }
}
*/

/*public class Main {
   public static void main(String[] args) {
      double friends = 4;
            friends= friends + 12.99;
            System.out.println(friends);
   }
}
*/

/*public class Main {
   public static void main (String[] args) {
      double gallons = 10;
      double litres = gallons * 3.7854;
      System.out.println(litres);
            
   }
}*/

/*import javax.swing.JOptionPane;

public class Main {
   
   public static void main(String[] args) {
      
      String name = JOptionPane.showInputDialog("Enter your name");
      JOptionPane.showMessageDialog(null, "Hello "+name);
      
      int age = Integer.parseInt(JOptionPane.showInputDialog("Ener your age"));
      JOptionPane.showMessageDialog(null, "You are "+age+" years old");
      
      double height = Double.parseDouble(JOptionPane.showInputDialog("Ener your height"));
      JOptionPane.showMessageDialog(null, "You are "+height+" cm tall");
      
      
   }
}
Создание графического интерфейса пользователя
*/


/*import java.util.Scanner;
public class Main {
   
   public static void main(String[] args) {
      
      double x ;
      double y ;
      double z ;
      
      Scanner scanner =  new Scanner(System.in);      
      
      System.out.println("Ener side x: ");
      x = scanner.nextDouble();     
      
      System.out.println("Ener side y: ");
      y = scanner.nextDouble();
      
      z = Math.sqrt((x*x)+(y*y));
      
      System.out.println("The hypotenuse is : "+z);
      
      scanner.close();
   }
   
} 
Находили гипотенезу
*/

/*import java.util.Random;

public class Main {
   
   public static void main (String[] args) {
      
      Random random = new Random();
      
      int x = random.nextInt(10);
      double y = random.nextDouble(10.88);
      boolean z = random.nextBoolean();
      
      System.out.println(x);
      System.out.println(y);
      System.out.println(z);
      
   }
}
Генерация случайных чисел
*/


/*public class Main {
   
   public static void main (String [] args) {
      
      for (int i=1; i<=10; i++) {
            
            System.out.println(i + " ");
   }
}
}
Выводим число от 1 до 10
*/

/*public class Main {
   
   public static void main (String [] args) {
      double t = 7.2;
      int s = 335;
      
      int z = (int) (s*t);
      
      System.out.println("Расстояние до места вспышки составляет: " +z);
   
   }
         
   }
   Высчитывали расстояние, зная время и метры
*/

/*import java.util.Scanner;
public class Main {
   
   public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      
      System.out.println("Сколько вам лет?");
      
      int age = scanner.nextInt(); 
         
      if (age>=18) {
         System.out.println("You are an abult!");
      }
   
      else { 
         System.out.println("Извините, вам меньше 18 лет. Пока");
         }
   }
}
*/

/*public class Main {
   public static void main (String[] args) {
      
      String day = "Вторник";
      
      switch(day) {
      case "Понедельник": System.out.println("Сегодня, понедельник!");
      break;
      case "Вторник": System.out.println("Сегодня, вторник!");
      break;
      case "Среда": System.out.println("Сегодня, среда!");
      break;
      case "Четверг": System.out.println("Сегодня, четверг!");
      break;
      case "Пятница": System.out.println("Сегодня, пятница!");
      break;
      case "Суббота": System.out.println("Сегодня, суббота!");
      break;
      case "Воскресенье": System.out.println("Сегодня, воскресенье!");
      break;
      default: System.out.println("Вы не указали день недели, попробуйте еще раз!");

      
      }
      
   }
}
*/

/*import java.util.Scanner;

public class Main {
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   String name ="";
   
   while (name.isBlank()) {
      System.out.println("Введите свое имя ");
      name = scanner.nextLine();
      
      
   }
   System.out.println("Привет "+name);
   
   
}
}
*/

import java.util.Scanner;

public class Main {
   public static void main (String[] args) {
      Scanner in = new Scanner (System.in);
      int x = 0, y = 0;
      System.out.println("x = ");
      x = in.nextInt();
      System.out.println("y = ");
      y = in.nextInt();
      System.out.println("Сумма = " + (x+y));
   }
}



