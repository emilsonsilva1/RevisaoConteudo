
package vetor4valores;

import java.util.Scanner;

public class Vetor4Valores {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero[] = new int[4];
        int indice;
        for(indice=0; indice<4;indice ++ ){
            System.out.println("Para a posiçã-" +indice+ "-Digite o numero:");
            numero[indice]=sc.nextInt();
        }
        
    }
    
}
