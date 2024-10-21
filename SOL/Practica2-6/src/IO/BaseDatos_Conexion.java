
package IO;

import java.sql.*;
import java.sql.SQLException;

public class BaseDatos_Conexion {
    private static Connection con = null;
    
    private BaseDatos_Conexion(){}
    
    public static Connection getConnection(){
        if(con == null){
             try {
                String cadena_conexion = "jdbc:mysql://localhost:3306/";
                String usuario = "root";
                String contraseña = null;
                con = DriverManager.getConnection(cadena_conexion, usuario, contraseña);
            } catch (SQLException sql) {
                System.out.println("Error: Fallo de conexion interna " + sql.getMessage());
            }
        }
        
        return con;
    }
    
    
    public static void inicializarBaseDatos(){
        try{
            String consulta = "CREATE DATABASE IF NOT EXISTS bbdd_interfaces";
            PreparedStatement pstm = con.prepareStatement(consulta);
            pstm.executeUpdate();
            
              String uso_BBDD = "USE cruzvscara;";
            PreparedStatement pstm_use = con.prepareStatement(uso_BBDD);
            pstm_use.executeUpdate();
            
              String consulta_4 = "Create Table IF NOT EXISTS Usuario(\n"
                    + "ID int ,\n"
                    + "Nombre varchar(20),\n"
                    + "Contraseña varchar(20),\n"
                    + "constraint pk_jugXtor primary key (ID,Nombre) );";
            PreparedStatement pstm4 = con.prepareStatement(consulta_4);
            pstm4.executeUpdate();
            
            
            
            
        }catch(SQLException e){
            System.out.println("Error al crear la base de datos: " + e.getMessage());
        }
    }
}
