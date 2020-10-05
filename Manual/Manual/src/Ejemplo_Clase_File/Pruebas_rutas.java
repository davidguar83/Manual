
package Ejemplo_Clase_File;

import java.io.File;

/**
 *
 * @author david
 */
public class Pruebas_rutas {
    
    
    public static void main(String[] args) {
        
        
        
        File archivo =new File("build");
        
        System.out.println(archivo.getAbsolutePath());
        
        System.out.println(archivo.exists());
        
        
        
        
    }
    
    
}
