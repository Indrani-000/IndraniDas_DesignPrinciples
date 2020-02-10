import java.util.Scanner;
 public class Calculator{
  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    int a;
    int b;

    System.out.println("Write a number");
    a = Integer.parseInt(input.nextLine());

    System.out.println("Write another number");
    b = Integer.parseInt(input.nextLine());

    Addition(a,b);
    Substratcion(a,b);
    Multiplication(a,b);
    Division(a,b);
  }

 
	static void Addition( int a, int b ) {
        System.out.println("Addition = " + (a + b));
    }


    static void Substratcion( int a, int b ) {
        System.out.println("Substratcion = " + (a - b));
    }


    static void Multiplication( int a, int b ) {
        System.out.println("Multiplication = " + (a * b));
    }
    static void Division( int a, int b ) {
        System.out.println("Division = " + (a / b));
    }
    
    

}
