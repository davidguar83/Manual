/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Streams;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author david
 */
public class Lectura_Escritura_Bytes {
    
    
    
    public static void main(String[] args) {
        
        
        int contador=0;
        
        int[] datos_entrada= new int[100000]; 
        
        
        
        try{
            
            FileInputStream archi_lectura = new FileInputStream("C:/Users/david/Desktop/prueba clase file/texto1.txt");
            
            
            boolean final_archi=false;
            
            
            while(!final_archi){
                
                int byte_entrada = archi_lectura.read();
                if (byte_entrada!=-1)
                    
                    datos_entrada[contador]=byte_entrada;
                    
                
                
                
                else
                    
                    final_archi=true;
                    
                    System.out.println(datos_entrada[contador]);
                    
                contador++;
                
            }  
            
            archi_lectura.close();
            
            
            
        }catch(IOException e){
            
            
            System.out.println("Error, al aceder a la imagen");
            
        }
        
        
        
        System.out.println(contador);
        
        crea_fichero(datos_entrada);
        
        
        
    }
    
    
    
    static void crea_fichero(int datos_nuevo_fichero[]){
        
        try{
            
            FileOutputStream archivo_nuevo= new FileOutputStream("C:/Users/david/Desktop/prueba clase file/Copia_texto1.txt");
            
            for(int i=0;i<datos_nuevo_fichero.length;i++){
                
                archivo_nuevo.write(datos_nuevo_fichero[i]);
                
                
            }
            
            
            
            
        }catch(IOException e){ 
            System.out.println("Error, al crear el archivo");
            
            
            
            
            
            
            
            
        }
            
        
        
    }
    
    
}
