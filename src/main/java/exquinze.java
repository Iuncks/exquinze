import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void main(String[] args) throws IOException {

    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(ir);

        int Idade;

        Idade = Integer.parseInt(in.readLine());
        
       
        if ((Idade>=15)&&(Idade<=35)){
            System.out.printf("Aceito");
        
        } else {
            System.out.printf("Nao aceito"); 
        }
    
    }
}
    

