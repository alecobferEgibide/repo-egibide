import java.util.Scanner;
public class Main {
    public static void main() {

        System.out.println("Hello World");

        Scanner sc = new Scanner(System.in);
        System.out.println("Introuce el primer numero: ");
        int num1 = sc.nextInt();
        System.out.println("Introuce el segundo numero: ");
        int num2 = sc.nextInt();
        int resultado = num1 - num2;
        System.out.println("El resultado de la resta es " + resultado);
        sc.close();
    }
}
