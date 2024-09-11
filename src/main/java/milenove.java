import java.util.Scanner;
// 1009 resolvido
public class milenove {

public static void main(String[] args) {
    
    Scanner leitor = new Scanner(System.in);
    double A,P,R;
    P = 3.14159;
    R = leitor.nextDouble();
    A = 1.3333333333333333333333333333333 * P * R * R * R;
    System.out.printf("VOLUME = %.3f\n", A);
    
}

}