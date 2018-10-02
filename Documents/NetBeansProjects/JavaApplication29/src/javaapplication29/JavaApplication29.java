
package javaapplication29;

import java.util.Scanner;


public class JavaApplication29 {

   
    public static void main(String[] args) {
      int id, cont;
      String nome;    
      Scanner sc =new Scanner(System.in);
      cont = 0;
       System.out.println("Informe o nome ou digite fim para sair:");
       nome=sc.next();
       do{
           if(!nome.equals("fim")){
               do{
                   System.out.println("Digite a idade:");
                   id = sc.nextInt();
                    if(id>=18){
                        cont = cont + 1;
                    }
               }while(id>0 && id<=130);
                   
                      System.out.println("Informe o nome ou digite fim para sair:");
                      nome = sc.next();
           }
        }while(nome.equals("fim"));
       
         System.out.println(cont);
    } 
}
        

  

