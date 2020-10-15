/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejemplo_Clase_File;

import java.io.File;
import javax.print.DocFlavor;

/**
 *
 * @author david
 */
public class Acceso_Ficheros {
    
    
    
    public static void main(String[] args) {
        
        File ruta=new File("c:" + File.separator + "Users" + File.separator + "david" + File.separator + "Desktop" + File.separator + "prueba clase file");
       // File ruta=new File("C:/Users/david/Desktop/prueva clase file");
        
        
        //System.out.println(ruta.getAbsolutePath());
        
       // System.out.println(ruta.exists());
        
        String[] lista_carpeta1=ruta.list();
        
        for(int i=0;i<lista_carpeta1.length;i++){
        
            System.out.println(lista_carpeta1[i]);
            
            File ruta2 = new File(ruta.getAbsolutePath(),lista_carpeta1[i] );
            
          
            
            if(ruta2.isDirectory()){
                
                 
                
                String[]carpeta2=ruta2.list();
                
                for(int j=0;j<carpeta2.length;j++){
                    
                    System.out.println(carpeta2[j]);
                    
                    File ruta3 = new File(ruta.getAbsolutePath(),carpeta2[j] );
                   
                    
                    if (ruta3.isDirectory()){
                        
                        String[]carpeta3=ruta3.list();
                        
                        for (int k=0;k<carpeta3.length;k++){
                        
                        System.out.println(carpeta3[k]);
                        
                        
                        }
                        
                    }else {
                    
                
                        ruta3.delete();
                        
                        
                        
                        }
                
                
              
                }
                
            }else {
                
                ruta2.delete();
                
                
            }
                
                
            
        
        
    }
        
        
    }
    
}



//public class ruta
