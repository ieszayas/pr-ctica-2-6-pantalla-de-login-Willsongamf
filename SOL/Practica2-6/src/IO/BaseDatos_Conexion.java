package IO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.sql.SQLException;
import java.util.Properties;

public class BaseDatos_Conexion {

    private static Connection con = null;

    private BaseDatos_Conexion() {
    }

    public static Connection getConnection() {
        if (con == null) {
            try {

                Properties properties = new Properties();

                properties.load(new FileInputStream(new File("./config.properties")));

                String cadena_conexion = String.valueOf(properties.get("conexion"));

                String usuario = String.valueOf(properties.get("user"));

                String contraseña = null;

                // TODO Auto-generated catch block
                con = DriverManager.getConnection(cadena_conexion, usuario, contraseña);
            } catch (IOException io) {
                System.out.println("Error: Fallo de conexion interna " + io.getMessage());
            } catch (SQLException e) {
                System.out.println("Error al Conectar la Base de Datos" + e.getMessage());
            }
        }

        return con;
    }

    public static void cerrarConexxion() {
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar conexion " + e.getMessage());
            }

        }
    }

    public static void inicializarBaseDatos() {
        getConnection();
        try {
            String consulta = "CREATE DATABASE IF NOT EXISTS bbdd_interfaces";
            PreparedStatement pstm = con.prepareStatement(consulta);
            pstm.executeUpdate();

            String uso_BBDD = "USE bbdd_interfaces;";
            PreparedStatement pstm_use = con.prepareStatement(uso_BBDD);
            pstm_use.executeUpdate();

            String consulta_4 = "Create Table IF NOT EXISTS Usuario(\n"
                    + "ID int ,\n"
                    + "N_Usuario varchar(20) Unique,\n"
                    + "Contraseña varchar(20),\n"
                    + "constraint pk_jugXtor primary key (ID,N_Usuario) );";
            PreparedStatement pstm4 = con.prepareStatement(consulta_4);
            pstm4.executeUpdate();

            String consulta_5 = "CREATE TABLE if not EXISTS UsuarioDatosOpcionales(\n"
                    + "\n"
                    + "ID_U int,\n"
                    + "Nombre varchar(20),\n"
                    + "Apellido varchar(20),\n"
                    + "Fecha varchar(20),\n"
                    + "Correo varchar(20),\n"
                    + "constraint pk_jugXtor primary key (ID_u),\n"
                    + "    \n"
                    + "FOREIGN KEY fk_usuario (ID_U) REFERENCES Usuario(ID)\n"
                    + "\n"
                    + "\n"
                    + ");";
            PreparedStatement pstm5 = con.prepareStatement(consulta_5);
            pstm5.executeUpdate();

        } catch (SQLException e) {
            System.out.println("Error al crear la base de datos: " + e.getMessage());
        }
    }
}
