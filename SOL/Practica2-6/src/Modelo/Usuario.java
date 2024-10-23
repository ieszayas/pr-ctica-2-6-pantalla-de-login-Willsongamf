/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import IO.BaseDatosUsuario;

/**
 *
 * @author DAM2_09
 */
public class Usuario {
    private static int id_s = BaseDatosUsuario.obtenerIDUsuario();
    private String usuario = "";
    private int id = -1; 
    private String contraseña = "";
    
    private String nombre;
    private String apellidos;
    private String Fecha_nacimiento;
    private String Correo;

    public Usuario(String usuario, String contraseña) {
        this.usuario = usuario;
        this.contraseña = contraseña;
        int id = id_s;
        id_s++;
        
        
    }
    public Usuario (int id,String usuario,String contraseña){
        this.id = id;
         this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public Usuario(String usuario, String contraseña,String nombre, String apellidos, String Fecha_nacimiento, String Correo) {
        this(usuario,contraseña);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.Fecha_nacimiento = Fecha_nacimiento;
        this.Correo = Correo;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getFecha_nacimiento() {
        return Fecha_nacimiento;
    }

    public void setFecha_nacimiento(String Fecha_nacimiento) {
        this.Fecha_nacimiento = Fecha_nacimiento;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }
    
    
    
    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
 
    
    
}
