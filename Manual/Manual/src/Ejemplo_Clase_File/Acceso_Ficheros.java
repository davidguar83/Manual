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
        
        File ruta=new File("c:" + File.separator + "Users" + File.separator + "david" + File.separator + "Desktop");
        
        System.out.println(ruta.getAbsolutePath());
        
        System.out.println(ruta.exists());
        
        String[] nombres_archivos=ruta.list();
        
        for(int i=0;i<nombres_archivos.length;i++){
        
            System.out.println(nombres_archivos[i]);
            
            File f = new File(ruta.getAbsolutePath(),nombres_archivos[i] );
            
            if(f.isDirectory()){
                
                String[]archivos_subcarpeta=f.list();
                
                for(int j=0;j<archivos_subcarpeta.length;j++){
                    
                    System.out.println(archivos_subcarpeta[j]);
                    
                    
                }
                
                
              
                
                
            }
                
                
            
        
        
    }
        
        
    }
    
}



//public class ruta