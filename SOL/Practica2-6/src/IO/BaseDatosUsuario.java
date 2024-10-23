package IO;

import Modelo.Usuario;
import java.sql.*;

public class BaseDatosUsuario {

    public static Usuario obtenerUsuario(String nombre, String contraseña) throws Exception {
        Connection con = BaseDatos_Conexion.getConnection();
        Usuario user = null;
        int existe = 0;
        try {
            String consulta = "SELECT * from usuario WHERE usuario.Usuario = ? and usuario.Contraseña = ?; ";
            PreparedStatement pstm = con.prepareStatement(consulta);
            pstm.setString(1, nombre);
            pstm.setString(2, contraseña);
           ResultSet rst = pstm.executeQuery();
            
            while(rst.next()){
                user = new Usuario(rst.getInt("ID"),rst.getString("Usuario"),rst.getString("Contraseña"));
            }
            
            if(existe == 0){
               throw new Exception();
            }
            
        } catch (SQLException e) {
            System.out.println("Error al obtner el id usuairo " + e.getMessage());
        }

        return user;
    }

    public static void crearUsuario(Usuario usuario) {
       Connection con = BaseDatos_Conexion.getConnection();
        try{
            String consulta = "Insert into usuario values (?,?,?)";
            PreparedStatement pstm = con.prepareStatement(consulta);
            pstm.setInt(1, usuario.getId());
            pstm.setString(2, usuario.getUsuario());
             pstm.setString(3, usuario.getContraseña());
             
             pstm.executeUpdate();
             
        }catch(SQLException sql){
            System.out.println("Error al crear un usuario" + sql.getMessage());
        }
    }

    public static void crearUsuarioDatosOpcionales(Usuario usuario) {
          Connection con = BaseDatos_Conexion.getConnection();
        try{
            String consulta = "Insert into usuariodatosopcionales values (?,?,?,?,?);";
            PreparedStatement pstm = con.prepareStatement(consulta);
            pstm.setInt(1, usuario.getId());
            pstm.setString(2, usuario.getNombre());
             pstm.setString(3, usuario.getApellidos());
             pstm.setString(4, usuario.getFecha_nacimiento());
             pstm.setString(5, usuario.getCorreo());
             
             pstm.executeUpdate();
             
        }catch(SQLException sql){
            System.out.println("Error al crear un usuario" + sql.getMessage());
        }
    }

    public static int obtenerIDUsuario() {
            Connection con = BaseDatos_Conexion.getConnection();
        try {
            String consulta = "SELECT MAX(ID +1) from usuario; ";
            PreparedStatement pstm = con.prepareStatement(consulta);
            ResultSet rst = pstm.executeQuery();
            
            while(rst.next()){
                return rst.getInt("ID");
            }
        } catch (SQLException e) {
            System.out.println("Error al obtner el id usuairo " + e.getMessage());
        }
        return -1000;
    }
}
