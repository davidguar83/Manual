/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Manual;

/**
 *
 * @author david
 */
public class Ejemplo_valueof_endsWith {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        String dos="2";
        String a="";
        
        for(int i=0;i<100;i++){  // recorre el for desde el 0 al 99
            
            a=String.valueOf(i);  //convierte los numeros del for en estring, en este caso del 0-99, devolviendo valores numericos pero como texto
            
            //System.out.println(a);
            
             if(a.endsWith(dos)){  // compara los numeros pasados a string , con la variable declarada como String y nombre dos "2". 
                 
                 System.out.println(a); // imprime solo los numeros que cumplan esa consicion
            
            
            
        }
        }
            
            
        
        
    }
    
}
