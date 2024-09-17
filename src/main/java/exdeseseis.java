import javax.swing.JOptionPane;
public class exdeseseis {
public static void main(String[] args) {

int A = Integer.parseInt(JOptionPane.showInputDialog("ESCOLHA UMA OPSAO\n 1=SOMA\n "
        + "2=SUBTRAÇÃO\n 3=MULTIPLICAÇÃO\n 4=DIVISÃO"));
int B = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
int C = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));

    switch (A) {

        case 1:
        System.out.printf("SOMA = %d\n", B + C);
        break;
        case 2:
        System.out.printf("SUBTRAÇAO = %d\n", B - C);
        break;
        case 3:
        System.out.printf("MULTIPLICAÇAO = %d\n", B * C);
        break;
        case 4:
        System.out.printf("DIVISAO = %d\n", B / C);
        break;
    }
    
}

}
