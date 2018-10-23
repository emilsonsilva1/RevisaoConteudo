
package testematriz;

import java.util.Scanner;

public class TesteMatriz {


    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
      float preco[][]=new float[3][3];
      int l, c;
      for(l=0;l<3;l++){
          for(c=0;c<3;c++){
              System.out.print("Digite o preço para ["+l+","+c+"]: ");
            preco [l][c]=sc.nextFloat();
             
      }
    }
    for(l=0;l<3;l++){
        for(c=0;c<3;c++){
            System.out.print(preco[l][c]+"    ");
            
        }
        System.out.println();
    } 
       
    }
    
}
