/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package condicionais;

import java.util.Scanner;

/**
 *
 * @author leandro.osouza
 */
public class Condicionais {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner leitor = new Scanner(System.in);
        
        int n1, n2, n3;
        
        System.out.print("N1 ");
        n1 = leitor.nextInt();
        
         System.out.print("N2 ");
        n2 = leitor.nextInt();
        
        System.out.print("N3 ");
        n3 = leitor.nextInt();
                
        if (n1>n2 && n1>n3 ){
        System.out.printf("O numero %d é o MAIOR\n", n1 );
            
        }else if (n2>n1 && n2>n3 ){
             System.out.printf("O numero %d é o MAIOR\n", n2 ); 
             
       }else if (n3>n1 && n3>n2 ){
         System.out.printf("O numero %d é o MAIOR\n", n3 );   
    
    }else{
    System.out.println("Os números São iguais");
}
    }
}
            








        
    
    

