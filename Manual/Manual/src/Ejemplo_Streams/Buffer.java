/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Streams;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author david
 */
public class Buffer {
    
    
     public static void main(String[] args) {
        
        
        
        
        Leer_Fichero2 accediendo2 = new Leer_Fichero2();
        
        accediendo2.lee2();
        
                
        
    }
        
        
    }
    
    
    class Leer_Fichero2{
        
        
        public void lee2(){
            
            try {
                FileReader entrada2 = new FileReader("C:/Users/david/Desktop/prueba clase file/texto1.txt");
                
                
                BufferedReader mibuffer = new BufferedReader(entrada2);
                
                String linea= "";
                
                while(linea!=null){
                    
                linea=mibuffer.readLine();
                    
                    if(linea!=null){
                    System.out.println(linea);
                    
                    }
                    
                }
                
                
                entrada2.close();
                
            } catch (IOException e) {
                System.out.println("archivo no encontrado");;
            }
            
            
            
        }
        
    
}
