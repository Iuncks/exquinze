import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class exdose {

    public static void main(String[] args) throws IOException {

    InputStreamReader ir = new InputStreamReader(System.in);
    BufferedReader in = new BufferedReader(ir);

        int A, B;

        A = Integer.parseInt(in.readLine());
        B = Integer.parseInt(in.readLine());

        if (B > A){ 
        System.out.printf("Esse é o maior numero %d", B);
        } else { 
            if(B < A){
            System.out.printf("Esse é o maior numero %d", A);
        } else {
            System.out.printf("os mumeros sao iguais"); 
        }
    
    }
}
    
}
    
 
    

