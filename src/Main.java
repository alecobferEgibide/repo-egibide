import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Se crea la instancia real de Scanner para leer la consola
        Scanner scanner = new Scanner(System.in);

        double resultado = pedirYSumar(scanner);
        System.out.println("resultado: " + resultado);

        scanner.close(); // Buena práctica para liberar recursos
    }

    public static double pedirYSumar(Scanner scanner) {
        System.out.print("Introduce el primer número: ");
        double a = scanner.nextDouble();

        System.out.print("Introduce el segundo número: ");
        double b = scanner.nextDouble();

        return a + b;
    }
}
