import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class testar {

    public static void main(String[] args) throws IOException {

    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(ir);

        int X;

        X = Integer.parseInt(in.readLine());
        
        if(X<0){
           System.out.printf("Número Invalido"); 
        } else {   
        if (X % 2 == 0){
            System.out.printf("%d\n%d\n%d\n%d\n%d\n%d", X+1,X+3,X+5,X+7,X+9,X+11,X+13);
        } else {
        if (X % 1 == 0){
            System.out.printf("%d\n%d\n%d\n%d\n%d\n%d", X,X+2,X+4,X+6,X+8,X+10,X+12); 
        } else {
            System.out.printf("Número Invalido"); 
        }
    
        }
        
        }
        
    }
    
}
