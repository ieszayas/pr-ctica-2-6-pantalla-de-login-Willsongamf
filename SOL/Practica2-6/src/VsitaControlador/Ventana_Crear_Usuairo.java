/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VsitaControlador;

import IO.BaseDatosUsuario;
import Modelo.Usuario;
import java.awt.Color;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author calvo
 */
public class Ventana_Crear_Usuairo extends javax.swing.JFrame {

    Ventana_Loggin ventana_loggin;

    Border borde_rojo = BorderFactory.createLineBorder(Color.red);
    Border borde_green = BorderFactory.createLineBorder(Color.green);
     Usuario user;

    public Ventana_Crear_Usuairo(Ventana_Loggin entrada) {
        initComponents();
        ventana_loggin = entrada;
        ventana_loggin.setVisible(false);

    }

    public Ventana_Crear_Usuairo() {
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Texto_Creacion_Usuario = new javax.swing.JLabel();
        Campo_Usuario = new javax.swing.JTextField();
        Texto_Creacion_User = new javax.swing.JLabel();
        Texto_Creacion_Contraseña = new javax.swing.JLabel();
        Texto_Creacion_Contraseña_Validacion = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Tetxo_Agregar_Opcional = new javax.swing.JLabel();
        Campo_Nombre = new javax.swing.JTextField();
        Campo_Apellido = new javax.swing.JTextField();
        Campo_Fecha = new javax.swing.JTextField();
        Campo_Correo = new javax.swing.JTextField();
        Boton_Cerrar = new javax.swing.JButton();
        Boton_Agregar = new javax.swing.JButton();
        Texto_Creacion_Nombre = new javax.swing.JLabel();
        Texto_Creacion_Apellido = new javax.swing.JLabel();
        Texto_Creacion_Fecha = new javax.swing.JLabel();
        Texto_Creacion_Correo = new javax.swing.JLabel();
        CheckBox_AgregarOpcionales = new javax.swing.JCheckBox();
        Campo_Contraseña = new javax.swing.JPasswordField();
        Campo_Contraseña_Validacion = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Crear Usuario");

        Texto_Creacion_Usuario.setText("Por favor introduzca los datos del nuevo usuario");

        Texto_Creacion_User.setText("Usuario");

        Texto_Creacion_Contraseña.setText("Contraseña");

        Texto_Creacion_Contraseña_Validacion.setText("Confirma Contraseña");

        Tetxo_Agregar_Opcional.setText("Agregar Opcional");
        Tetxo_Agregar_Opcional.setEnabled(false);

        Campo_Nombre.setEnabled(false);

        Campo_Apellido.setEnabled(false);

        Campo_Fecha.setEnabled(false);

        Campo_Correo.setEnabled(false);
        Campo_Correo.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Campo_CorreoKeyReleased(evt);
            }
        });

        Boton_Cerrar.setText("Volver");
        Boton_Cerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_CerrarActionPerformed(evt);
            }
        });

        Boton_Agregar.setText("Agregar");
        Boton_Agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_AgregarActionPerformed(evt);
            }
        });

        Texto_Creacion_Nombre.setText("Nombre");
        Texto_Creacion_Nombre.setEnabled(false);

        Texto_Creacion_Apellido.setText("Apellido");
        Texto_Creacion_Apellido.setEnabled(false);

        Texto_Creacion_Fecha.setText("Fecha_Nacimiento");
        Texto_Creacion_Fecha.setEnabled(false);

        Texto_Creacion_Correo.setText("Correo");
        Texto_Creacion_Correo.setEnabled(false);

        CheckBox_AgregarOpcionales.setText("Campos_Ocpionales");
        CheckBox_AgregarOpcionales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckBox_AgregarOpcionalesActionPerformed(evt);
            }
        });

        Campo_Contraseña_Validacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Campo_Contraseña_ValidacionKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(153, 153, 153)
                .addComponent(Tetxo_Agregar_Opcional)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addComponent(Texto_Creacion_Usuario))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Texto_Creacion_Nombre)
                                            .addComponent(Texto_Creacion_Apellido)
                                            .addComponent(Texto_Creacion_Fecha)
                                            .addComponent(Texto_Creacion_Correo))
                                        .addGap(72, 72, 72)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(Campo_Nombre, javax.swing.GroupLayout.DEFAULT_SIZE, 112, Short.MAX_VALUE)
                                            .addComponent(Campo_Apellido)
                                            .addComponent(Campo_Fecha)
                                            .addComponent(Campo_Correo))))
                                .addGap(54, 54, 54))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Boton_Cerrar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Boton_Agregar))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(19, 19, 19)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Texto_Creacion_User)
                                            .addComponent(Texto_Creacion_Contraseña)))
                                    .addComponent(Texto_Creacion_Contraseña_Validacion))
                                .addGap(31, 31, 31)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(Campo_Contraseña)
                                    .addComponent(Campo_Usuario)
                                    .addComponent(Campo_Contraseña_Validacion, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(CheckBox_AgregarOpcionales)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(Texto_Creacion_Usuario)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Campo_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_Creacion_User))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto_Creacion_Contraseña)
                    .addComponent(Campo_Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(Texto_Creacion_Contraseña_Validacion)
                        .addGap(13, 13, 13))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Campo_Contraseña_Validacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(CheckBox_AgregarOpcionales)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Tetxo_Agregar_Opcional)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Campo_Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texto_Creacion_Nombre))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Campo_Apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Texto_Creacion_Apellido))
                        .addGap(26, 26, 26)
                        .addComponent(Campo_Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Texto_Creacion_Fecha))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Campo_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Texto_Creacion_Correo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Boton_Cerrar)
                    .addComponent(Boton_Agregar))
                .addGap(36, 36, 36))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Boton_AgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_AgregarActionPerformed
        if (Campo_Usuario.getText().isEmpty() || String.valueOf(Campo_Contraseña.getPassword()).isEmpty() || String.valueOf(Campo_Contraseña_Validacion.getPassword()).isEmpty()) {
            JOptionPane.showMessageDialog(null, "No se han rellenado todos los campos obligatorios");
            return;
        }
        if (!comporbraContraseña()) {
            JOptionPane.showMessageDialog(null, "Las contraseñas no coinciden");
            return;
        }
        if (CheckBox_AgregarOpcionales.isSelected()) {
            if (comprobarCamposAgracion()) {

                crearUsuarioDatosOpcionales();
                this.setVisible(false);
                ventana_loggin.setVisible(true);
                return;

            } else {
                JOptionPane.showMessageDialog(null, "No todos los campos opcionales se han rellenado o el correo no hes valido");
            }
        }

        if (!crearUsuario()) {
            return;
        }
        this.setVisible(false);
        ventana_loggin.setVisible(true);
    }//GEN-LAST:event_Boton_AgregarActionPerformed

    public boolean crearUsuario() {

         user = new Usuario(Campo_Usuario.getText(), String.valueOf(Campo_Contraseña.getPassword()));
        if (!BaseDatosUsuario.crearUsuario(user)) {
            JOptionPane.showMessageDialog(null, "El Usuario ya existe");
            return false;
        }
        return true;

    }

    private boolean crearUsuarioDatosOpcionales() {
        if (crearUsuario()) {
             user.setAtributosOpcionales(Campo_Nombre.getText(), Campo_Apellido.getText(), Campo_Fecha.getText(), Campo_Correo.getText());
            BaseDatosUsuario.crearUsuarioDatosOpcionales(user);
            return true;
        }
        return false;
    }

    private boolean comporbraContraseña() {

        if (!String.valueOf(Campo_Contraseña.getPassword()).equals(String.valueOf(Campo_Contraseña_Validacion.getPassword()))) {
            return false;
        }
        return true;
    }
    private void CheckBox_AgregarOpcionalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckBox_AgregarOpcionalesActionPerformed
        if (CheckBox_AgregarOpcionales.isSelected()) {
            Campo_Nombre.setEnabled(true);
            Campo_Apellido.setEnabled(true);
            Campo_Fecha.setEnabled(true);
            Campo_Correo.setEnabled(true);
            Tetxo_Agregar_Opcional.setEnabled(true);
            Texto_Creacion_Nombre.setEnabled(true);
            Texto_Creacion_Apellido.setEnabled(true);
            Texto_Creacion_Fecha.setEnabled(true);
            Texto_Creacion_Correo.setEnabled(true);
        } else {
            Campo_Nombre.setEnabled(false);
            Campo_Apellido.setEnabled(false);
            Campo_Fecha.setEnabled(false);
            Campo_Correo.setEnabled(false);
            Tetxo_Agregar_Opcional.setEnabled(false);
            Texto_Creacion_Nombre.setEnabled(false);
            Texto_Creacion_Apellido.setEnabled(false);
            Texto_Creacion_Fecha.setEnabled(false);
            Texto_Creacion_Correo.setEnabled(false);
        }
    }//GEN-LAST:event_CheckBox_AgregarOpcionalesActionPerformed

    private void Boton_CerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_CerrarActionPerformed
        this.setVisible(false);
        ventana_loggin.setVisible(true);
    }//GEN-LAST:event_Boton_CerrarActionPerformed

    private void Campo_CorreoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Campo_CorreoKeyReleased

        if (!Campo_Correo.getText().matches("^[\\w-.]+@([\\w-]+.)+[\\w-]{3,4}$")) {
            Campo_Correo.setBorder(borde_rojo);
        } else {
            Campo_Correo.setBorder(borde_green);
        }
    }//GEN-LAST:event_Campo_CorreoKeyReleased

    private void Campo_Contraseña_ValidacionKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Campo_Contraseña_ValidacionKeyReleased
        if (!comporbraContraseña()) {
            Campo_Contraseña_Validacion.setBorder(borde_rojo);
        } else {
            Campo_Contraseña_Validacion.setBorder(borde_green);
        }
    }//GEN-LAST:event_Campo_Contraseña_ValidacionKeyReleased

    private boolean comprobarCamposAgracion() {
        String arraycampos[] = new String[4];
        arraycampos[0] = Campo_Nombre.getText();
        arraycampos[1] = Campo_Apellido.getText();
        arraycampos[2] = Campo_Fecha.getText();
        arraycampos[3] = Campo_Correo.getText();

        for (int i = 0; i < arraycampos.length; i++) {
            if (arraycampos[i].isEmpty()) {
                return false;
            }
        }
        if(Campo_Correo.getBorder().equals(borde_rojo) ){
         return false;   
        }
        return true;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ventana_Crear_Usuairo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Crear_Usuairo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Crear_Usuairo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Crear_Usuairo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Crear_Usuairo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Agregar;
    private javax.swing.JButton Boton_Cerrar;
    private javax.swing.JTextField Campo_Apellido;
    private javax.swing.JPasswordField Campo_Contraseña;
    private javax.swing.JPasswordField Campo_Contraseña_Validacion;
    private javax.swing.JTextField Campo_Correo;
    private javax.swing.JTextField Campo_Fecha;
    private javax.swing.JTextField Campo_Nombre;
    private javax.swing.JTextField Campo_Usuario;
    private javax.swing.JCheckBox CheckBox_AgregarOpcionales;
    private javax.swing.JLabel Tetxo_Agregar_Opcional;
    private javax.swing.JLabel Texto_Creacion_Apellido;
    private javax.swing.JLabel Texto_Creacion_Contraseña;
    private javax.swing.JLabel Texto_Creacion_Contraseña_Validacion;
    private javax.swing.JLabel Texto_Creacion_Correo;
    private javax.swing.JLabel Texto_Creacion_Fecha;
    private javax.swing.JLabel Texto_Creacion_Nombre;
    private javax.swing.JLabel Texto_Creacion_User;
    private javax.swing.JLabel Texto_Creacion_Usuario;
    private javax.swing.JSeparator jSeparator1;
    // End of variables declaration//GEN-END:variables
}
