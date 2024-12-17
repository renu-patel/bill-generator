
//projects//
import java.util.*;

public class bill {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bill Generator");
        System.out.println("======================");

        System.out.println("Enter costumer name:");
        String c = sc.next();
        System.out.println("Enter item name:");
        String itemname = sc.nextLine();
        System.out.println("Enter quantity");
        int quantity = sc.nextInt();
        System.out.println("Enter price");
        double price = sc.nextDouble();
        System.out.println("Discount");
        int Discount = sc.nextInt();
        System.out.println("*****************************************");
                    

            System.out.println("costumer name:  " + c);

            System.out.println(" item name:     " + itemname);

            System.out.println(" quantity : " + quantity);

            System.out.println(" price:  " + price);
            System.out.println("Discount:  " + Discount);
            System.out.println("    THANK YOU    ");
        }

    }
}
    

/* 
 * import java.util.*;
 * 
 * public class bill {
 * public static void main(String[] args) {
 * 
 * System.out.println("=========calculater====");
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.println("Enter first number");
 * double A = sc.nextDouble();
 * System.out.println("Enter secend number");
 * double b = sc.nextDouble();
 * 
 * System.out.println("Enter operation" + "+,-,*,/,%");
 * char O = sc.next().charAt(0);
 * switch (O) {
 * case '+':
 * System.out.println(A + b);
 * break;
 * case '*':
 * System.out.println(A * b);
 * break;
 * case '-':
 * System.out.println(A - b);
 * break;
 * case '/':
 * System.out.println(A / b);
 * break;
 * case '%':
 * System.out.println(A % b);
 * break;
 * 
 * }
 * 
 * }
 * }
 
 */