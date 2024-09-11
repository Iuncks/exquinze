import java.util.Scanner;
// 1001 resolvido
public class mileum {

public static void main(String[] args) {
    
    Scanner leitor = new Scanner(System.in);
    double A,P,R;
    P = 3.14159;
    R = leitor.nextDouble();
    A =(R * R * P);
    System.out.printf("A=%.4f\n", A);
    
}

}