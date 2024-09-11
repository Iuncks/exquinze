import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class extreze {

    public static void main(String[] args) throws IOException {

    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(ir);

    int salario,parcela, x;

    salario = Integer.parseInt(in.readLine());
    parcela = Integer.parseInt(in.readLine());
    
    x = salario * 3/10;
    
    if (parcela<=x){ 
    System.out.printf("Pode receber o imprestimo");
    
    } else {
        System.out.printf("nao pode receber"); 
    }
    
}
}

