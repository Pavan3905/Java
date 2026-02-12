/*Java Program to Demonstrate Arithmatic Operators, class, objects, loops*/
import java.util.*;

class Addition{
    static void sum(Scanner sc){
        double sum = 0;
        System.out.print("Enter how many numbers need to Add : ");
        int n = sc.nextInt();
        double[] a = new double[n];
        System.out.println("Enter Numbers One By One");
        for(int i = 0;i < n; i++){
            System.out.print((i + 1)+ " -> ");
            a[i]= sc.nextDouble();
            sum = sum + a[i];
        }
        System.out.println("Sum is --> " + sum);
    }
}

class Substraction{
    static void difference(Scanner sc){
        System.out.print("Enter how many numbers need to Substract : ");
        int n = sc.nextInt();
        double[] a = new double[n];
        System.out.println("Enter Numbers One By One");
        for(int i = 0;i < n; i++){
            System.out.print((i + 1)+ " -> ");
            a[i]= sc.nextDouble();
        }
        double diff = a[0];
        for (int i=1; i < n; i++){
            diff -= a[i]; 
        }
        System.out.println("Difference is --> " + diff);
    }
}

class Multiplication{
    static void product(Scanner sc){
        double prod = 1;
        System.out.print("Enter how many numbers need to Multiply : ");
        int n = sc.nextInt();
        double[] a = new double[n];
        System.out.println("Enter Numbers One By One");
        for(int i = 0;i < n; i++){
            System.out.print((i + 1)+ " -> ");
            a[i]= sc.nextDouble();
            if(a[i] == 0){
                prod = 0; 
                break;
            }else{
                prod = prod * a[i];
            }
        }
        System.out.println("Product is --> " + prod);
    }
}

class Division{
    static void quotient(Scanner sc){
        System.out.print("Enter Dividend/ Numerator    : ");
        double a = sc.nextDouble();                       
        System.out.println("Enter Divisor/ Denominator : ");
        double b = sc.nextDouble();
        if(b == 0){
            System.out.println("Dividing By 0 is Undefined");
        }else{
            System.out.println("Quotient is --> " + (a / b));
        }
    }
}

class Modulo{
    static void remainder(Scanner sc){
        System.out.println("Enter Dividend/ Numerator  : ");
        int a = sc.nextInt();
        System.out.println("Enter Divisor/ Denominator : ");
        int b = sc.nextInt();
        if(b == 0){
            System.out.println("Dividing By 0 is Undefined");
        }else{
            System.out.println("Quotient is --> " + (a % b));
        }
    }
}

public class Calculator_02{
    public static void main(String[] args){
        int choose;
        Scanner sc = new Scanner(System.in);

        do{
            System.out.println("\nCALCULATOR\n(1) Addition\n(2) Substraction\n(3) Multiplication\n(4) Division\n(5) Modulo\n(6) Exit\n");
            System.out.print("Enter your Choice: ");
            choose = sc.nextInt();

            if(choose > 0 && choose <6){

                switch(choose) {
                    case 1:
                        Addition.sum(sc);
                        break;
                    case 2:
                        Substraction.difference(sc);
                        break;
                    case 3:
                        Multiplication.product(sc);
                        break;
                    case 4:
                        Division.quotient(sc);
                        break;
                    case 5:
                        Modulo.remainder(sc);
                        break;
                    default:
                        break;
                }
            }else if(choose == 6){
                System.out.println("See You Soon (*_*)\n");
            }else{
                System.out.println("Enter Proper Choice(*|*)\n");
            }
        }while(choose != 6);
        sc.close();
    }
}