
package IO;

import Modelo.Usuario;

public class BaseDatosUsuario {
    public static Usuario obtenerUsuario(String nombre,String contraseña){
        return new Usuario();
    }
    
    public static void crearUsuario(Usuario usuario){
        
    }
    
    public static int obtenerIDUsuario(){
        return -100;
    }
}
