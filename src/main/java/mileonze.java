import java.util.Scanner;
import javax.swing.JOptionPane;
// 1009 resolvido
public class mileonze{

public static void main(String[] args) {
String nome = JOptionPane.showInputDialog("MOME");

    Scanner leitor = new Scanner(System.in);
    double A,B,TOTAL;
   
    A = leitor.nextDouble();
    B = leitor.nextDouble();
    TOTAL = 0.15 * B + A;
    System.out.printf("TOTAL = %.2f\n", TOTAL);
    
}

}
