/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Streams;

import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Escribir_Fichero {
    
    
    
    public static void main(String[] args) {
        
        
        Escribiendo a = new Escribiendo();
        
        
        a.escribir();
        
        
        
        
    }
    
}



class Escribiendo{
    
    public void escribir(){
        
        String frase = " esto es una prueba de escritura";
        
        
        try {
            FileWriter escritura = new FileWriter("C:/Users/david/Desktop/prueba clase file/texto_escritura.txt");   //si ponemos(, true) lo que hace es escribir el texto de nuevo, sino lo que hace es sobreescribir el texto existente
            
            for( int i=0;i<frase.length();i++){
                
                escritura.write(frase.charAt(i));
                
                
                
                
            }
            escritura.close();
            
        } catch (IOException e) {
            System.out.println("Archivo no escontrado");
        }
        
        
        
        
    }
    
    
    
}
