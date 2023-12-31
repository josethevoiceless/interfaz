/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interfazjose;

import aaaaa.Consulta_Usuarios;
import aaaaa.Usuarios;
import ctrl.ControlUsuarios;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.lang.System.Logger;
import java.lang.System.Logger.Level;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSE MUÑOS
 */
public class Inicio extends javax.swing.JFrame {
private static Scanner sc;
private static int intentos;
private static String user, pwd;
    /**
     * Creates new form ssd
     */
    public Inicio() {
        initComponents();
       
        this.Ocultar.setVisible(false);
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButton1 = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        Usuario = new javax.swing.JTextField();
        Contraseña = new javax.swing.JPasswordField();
        Acceder = new interfazjose.MyButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        RecuperarContraseña = new javax.swing.JLabel();
        Ver = new javax.swing.JLabel();
        Ocultar = new javax.swing.JLabel();
        Registrarse = new javax.swing.JLabel();
        Recordar = new javax.swing.JRadioButton();
        Salir = new interfazjose.MyButton();
        Registro = new interfazjose.MyButton();
        jLabel1 = new javax.swing.JLabel();

        jRadioButton1.setText("jRadioButton1");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setBackground(new java.awt.Color(102, 102, 102));
        jPanel2.setBorder(new javax.swing.border.MatteBorder(null));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Radiant-fotor-20231105154626 (1).png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, 1, -1, 122));

        jLabel4.setText("Usuario /Correo*");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 169, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel5.setText("Inicio de sesion");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(157, 23, 366, 70));

        Usuario.setBackground(new java.awt.Color(51, 51, 51));
        Usuario.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Usuario.setForeground(new java.awt.Color(204, 204, 204));
        Usuario.setToolTipText("Ingrese su nombre de usuario");
        Usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UsuarioActionPerformed(evt);
            }
        });
        jPanel2.add(Usuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 191, 417, 34));

        Contraseña.setBackground(new java.awt.Color(51, 51, 51));
        Contraseña.setForeground(new java.awt.Color(204, 204, 204));
        Contraseña.setToolTipText("Ingrese su contraseña");
        Contraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ContraseñaActionPerformed(evt);
            }
        });
        jPanel2.add(Contraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 265, 417, 33));

        Acceder.setBackground(new java.awt.Color(51, 51, 51));
        Acceder.setText("Iniciar sesión");
        Acceder.setBorderColor(new java.awt.Color(153, 153, 153));
        Acceder.setColor(new java.awt.Color(51, 51, 51));
        Acceder.setColorClick(new java.awt.Color(153, 153, 153));
        Acceder.setColorOver(new java.awt.Color(51, 51, 51));
        Acceder.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Acceder.setRadius(25);
        Acceder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AccederActionPerformed(evt);
            }
        });
        jPanel2.add(Acceder, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, 195, 33));

        jLabel2.setText("Contraseña*");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 243, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Emoji", 0, 20)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 204, 0));
        jLabel8.setText("Bienvenido de nuevo!");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(59, 129, 223, 34));

        jLabel6.setText("¿No tienes una cuenta?");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(35, 401, -1, 20));

        RecuperarContraseña.setText("¿Olvidaste la contraseña o su correo electronico?  ");
        RecuperarContraseña.setToolTipText("Recupere su contraseña");
        RecuperarContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RecuperarContraseñaMouseClicked(evt);
            }
        });
        jPanel2.add(RecuperarContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 380, -1, -1));

        Ver.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ver_32px.png"))); // NOI18N
        Ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VerMouseClicked(evt);
            }
        });
        jPanel2.add(Ver, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, 30));

        Ocultar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/ocultar_32px.png"))); // NOI18N
        Ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OcultarMouseClicked(evt);
            }
        });
        jPanel2.add(Ocultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, -1, 30));

        Registrarse.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        Registrarse.setForeground(new java.awt.Color(0, 204, 0));
        Registrarse.setText("Registrarse");
        Registrarse.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistrarseMouseClicked(evt);
            }
        });
        jPanel2.add(Registrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 70, 20));

        Recordar.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        Recordar.setText("Recordar");
        Recordar.setToolTipText("Recordar correo y contraseña al salir");
        Recordar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RecordarActionPerformed(evt);
            }
        });
        jPanel2.add(Recordar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, 530, 430));

        Salir.setForeground(new java.awt.Color(204, 204, 204));
        Salir.setText("Salir");
        Salir.setBorderColor(new java.awt.Color(0, 0, 0));
        Salir.setColor(new java.awt.Color(102, 0, 51));
        Salir.setColorClick(new java.awt.Color(255, 0, 102));
        Salir.setColorOver(new java.awt.Color(204, 0, 102));
        Salir.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Salir.setRadius(25);
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jPanel1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 460, 80, -1));

        Registro.setForeground(new java.awt.Color(204, 204, 204));
        Registro.setText("Registro");
        Registro.setBorderColor(new java.awt.Color(51, 102, 0));
        Registro.setColor(new java.awt.Color(0, 153, 0));
        Registro.setColorClick(new java.awt.Color(0, 102, 51));
        Registro.setColorOver(new java.awt.Color(51, 153, 0));
        Registro.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        Registro.setRadius(25);
        Registro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistroActionPerformed(evt);
            }
        });
        jPanel1.add(Registro, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 0, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/imagen-papel-tapiz-fondo-pintura-acrilica-gris_53876-104021.jpg"))); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 490));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ContraseñaActionPerformed

    private void AccederActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AccederActionPerformed
           Usuarios usuarios = new Usuarios();
        Consulta_Usuarios consulta_Usuarios = new Consulta_Usuarios();
        String user,clave;
        user=this.Usuario.getText();
        clave=this.Contraseña.getText();
        ControlUsuarios ctrl=new ControlUsuarios(usuarios, consulta_Usuarios);
        if(ctrl.Login(user, clave)){
            this.Usuario.setText("");
            this.Contraseña.setText("");
             ContenidoEditable contenidoFrame = new ContenidoEditable();
    contenidoFrame.setVisible(true);
        this.dispose();
        }

       
    }//GEN-LAST:event_AccederActionPerformed

    private void RegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistroActionPerformed
Registro registroPanel = new Registro();
registroPanel.setVisible(true);
this.setVisible(false);


    }//GEN-LAST:event_RegistroActionPerformed

    private void VerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VerMouseClicked
        Ver.setVisible(false);
        Ocultar.setVisible(true);
        Contraseña.setEchoChar((char)0);
    }//GEN-LAST:event_VerMouseClicked

    private void OcultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OcultarMouseClicked
 Ver.setVisible(true);
        Ocultar.setVisible(false);
        Contraseña.setEchoChar('*');    }//GEN-LAST:event_OcultarMouseClicked

    private void RegistrarseMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistrarseMouseClicked
 Registro registroPanel = new Registro();
registroPanel.setVisible(true);
this.setVisible(false);


    }//GEN-LAST:event_RegistrarseMouseClicked

    private void RecuperarContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RecuperarContraseñaMouseClicked
RecuperarContraseña recuperarPanel = new RecuperarContraseña();
recuperarPanel.setVisible(true);

this.setVisible(false);
    }//GEN-LAST:event_RecuperarContraseñaMouseClicked

    private void UsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_UsuarioActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
      this.setVisible(false);
      System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_SalirActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void RecordarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RecordarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RecordarActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private interfazjose.MyButton Acceder;
    private javax.swing.JPasswordField Contraseña;
    private javax.swing.JLabel Ocultar;
    private javax.swing.JRadioButton Recordar;
    private javax.swing.JLabel RecuperarContraseña;
    private javax.swing.JLabel Registrarse;
    private interfazjose.MyButton Registro;
    private interfazjose.MyButton Salir;
    private javax.swing.JTextField Usuario;
    private javax.swing.JLabel Ver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    // End of variables declaration//GEN-END:variables

  
}
