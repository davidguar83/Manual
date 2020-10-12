/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Streams;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author david
 */
public class Acceso_Fichero {
    
    public static void main(String[] args) {
        
        
        
        
        Leer_Fichero accediendo = new Leer_Fichero();
        
        accediendo.lee();
        
                
        
    }
        
        
    }
    
    
    class Leer_Fichero{
        
        
        public void lee(){
            
            try {
                FileReader entrada = new FileReader("C:/Users/david/Desktop/prueba clase file/texto1.txt");
                
                int c= 0;
                
                while(c!=-1){
                    
                    c=entrada.read();
                    
                    char letra = (char)c;
                    
                    System.out.print(letra);
                    
                    
                    
                }
                
                
                entrada.close();
                
            } catch (IOException e) {
                System.out.println("archivo no encontrado");;
            }
            
            
            
        }
        
        
        
        
        
        
        
    }
    
    
    

