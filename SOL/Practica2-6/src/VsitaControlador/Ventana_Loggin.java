/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VsitaControlador;

import javax.swing.JOptionPane;
import javax.swing.JTextField;



/**
 *
 * @author DAM2_09
 */
public class Ventana_Loggin extends javax.swing.JFrame {

   
    public Ventana_Loggin() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        Texto_Loggin = new javax.swing.JLabel();
        Texto_Usuario = new javax.swing.JLabel();
        Texto_Password = new javax.swing.JLabel();
        Campo_Usuario = new javax.swing.JTextField();
        ChechkBox_Mostrar_Password = new javax.swing.JCheckBox();
        Boton_Loggin = new javax.swing.JButton();
        Campo_Password = new javax.swing.JPasswordField();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Texto_Loggin.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Texto_Loggin.setText("Por favor introduzca sus credemciales para acceder");

        Texto_Usuario.setText("User");

        Texto_Password.setText("Password");

        Campo_Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_UsuarioActionPerformed(evt);
            }
        });

        ChechkBox_Mostrar_Password.setText("Mostrar");
        ChechkBox_Mostrar_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChechkBox_Mostrar_PasswordActionPerformed(evt);
            }
        });

        Boton_Loggin.setText("Entrar");
        Boton_Loggin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Boton_LogginActionPerformed(evt);
            }
        });

        Campo_Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Campo_PasswordActionPerformed(evt);
            }
        });
        Campo_Password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                Campo_PasswordKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Texto_Loggin)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Texto_Password)
                            .addComponent(Texto_Usuario))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(Campo_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Campo_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))
                        .addComponent(ChechkBox_Mostrar_Password)))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Boton_Loggin)
                .addGap(178, 178, 178))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(Texto_Loggin)
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto_Usuario)
                    .addComponent(Campo_Usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Texto_Password)
                    .addComponent(ChechkBox_Mostrar_Password)
                    .addComponent(Campo_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(Boton_Loggin)
                .addContainerGap(72, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void Campo_UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_UsuarioActionPerformed

    }//GEN-LAST:event_Campo_UsuarioActionPerformed

    private void ChechkBox_Mostrar_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChechkBox_Mostrar_PasswordActionPerformed
        if (ChechkBox_Mostrar_Password.isSelected()) {
            Campo_Password.setEchoChar((char) 0);

        } else {
            Campo_Password.setEchoChar('*');

        }

    }//GEN-LAST:event_ChechkBox_Mostrar_PasswordActionPerformed

    private void Boton_LogginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Boton_LogginActionPerformed
        if(Campo_Usuario.getText().equalsIgnoreCase("javier") || Campo_Password.getText().equalsIgnoreCase("1234")){
             this.setVisible(false);
        Ventana_Bienvenida Ventana_Nueva = new Ventana_Bienvenida(this);
        Ventana_Nueva.setVisible(true);
        Campo_Usuario.setText(null);
        Campo_Password.setText(null);
        }else{
            JOptionPane.showMessageDialog(null, "Error al iniciar sesion");
        }
       

    }//GEN-LAST:event_Boton_LogginActionPerformed

    public String getCampo_Usuario() {
        return Campo_Usuario.getText();
    }

    private void Campo_PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Campo_PasswordActionPerformed

    }//GEN-LAST:event_Campo_PasswordActionPerformed

    private void Campo_PasswordKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_Campo_PasswordKeyReleased

    }//GEN-LAST:event_Campo_PasswordKeyReleased

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
            java.util.logging.Logger.getLogger(Ventana_Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_Loggin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_Loggin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Boton_Loggin;
    private javax.swing.JPasswordField Campo_Password;
    private javax.swing.JTextField Campo_Usuario;
    private javax.swing.JCheckBox ChechkBox_Mostrar_Password;
    private javax.swing.JLabel Texto_Loggin;
    private javax.swing.JLabel Texto_Password;
    private javax.swing.JLabel Texto_Usuario;
    private javax.swing.JCheckBox jCheckBox1;
    // End of variables declaration//GEN-END:variables
}
