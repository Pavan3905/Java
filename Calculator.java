/*Java Program to Demonstrate Arithmatic Operators */
import java.util.*;

public class Calculator{
    public static void main(String[] args){
        int choose, a, b;

        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("(1) Addition\n(2) Substraction\n(3) Multiplication\n(4) Division\n(5) Modulo\n(6) Exit\n");
            System.out.print("Enter your Choice: ");
            choose = sc.nextInt();

            if(choose > 0 && choose <6){
                System.out.print("\nEnter first number: ");
                a = sc.nextInt();

                System.out.print("Enter second number: ");
                b = sc.nextInt();

                switch(choose) {
                    case 1:
                        System.out.println("Sum is    : " + (a+b) + "\n");
                        break;
                
                    case 2:
                        System.out.println("Difference is    : " + (a-b) + "\n");
                        break;

                    case 3:
                        System.out.println("Product is   : " + (a*b) + "\n");
                        break;

                    case 4:
                        System.out.println("Div is    : " + (a/b) + "\n");
                        break;

                    case 5:
                        System.out.println("Remainder is : " + (a%b) + "\n");
                        break;
                        
                    default:
                        break;
                }
            }else if(choose == 6){
                System.out.println("See You Soon (*_*)\n");
            }else{
                System.out.println("Enter Proper Choice\n");
            }
        }while(choose != 6);
        
        sc.close();
    }
}