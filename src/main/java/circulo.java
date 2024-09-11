
import java.util.Scanner;

public class circulo {

    public static void main(String[] args){

        Scanner leitor = new Scanner(System.in);
        double A,P,R;
        System.out.println();
        P = 3.14159; // Pi (π) as a constant
        R = (float) leitor.nextDouble(); // Reads a floating-point number (double)
        A =(R * R * P); // Calculate the area using the formula A = π * R^2
        System.out.printf("A=%.4f\n", A); // Print the result with four decimal places

    }
}