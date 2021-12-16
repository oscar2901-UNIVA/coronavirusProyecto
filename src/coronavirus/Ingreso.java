/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronavirus;

import Clases.ArchivoEscrituraAdministrador;
import Clases.LecturaDeDatos;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import Clases.ArchivoEscrituraAdministrador;
import Clases.LecturaDeDatos;
import javax.swing.Icon;
import javax.swing.ImageIcon;
/**
 *
 * @author apple
 */
public class Ingreso extends javax.swing.JFrame {
   Icon modificar;
    public Ingreso() {
        initComponents();
        modificar = new ImageIcon("src/Picture/200.gif");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        labelError = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnMenuPrincipal = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        txtUsuario = new javax.swing.JTextField();
        txtPassword = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        labelError.setForeground(new java.awt.Color(255, 51, 51));
        labelError.setText("Usuario o Password Incorrecto");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(631, 631));
        getContentPane().setLayout(null);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 220, 110, 40);

        jLabel3.setFont(new java.awt.Font("Lucida Grande", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(60, 300, 140, 60);

        btnMenuPrincipal.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        btnMenuPrincipal.setText("Regrear al menu principal");
        btnMenuPrincipal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuPrincipalActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenuPrincipal);
        btnMenuPrincipal.setBounds(80, 520, 190, 32);

        btnIngresar.setFont(new java.awt.Font("Lucida Grande", 0, 12)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(btnIngresar);
        btnIngresar.setBounds(350, 520, 200, 30);
        getContentPane().add(txtUsuario);
        txtUsuario.setBounds(230, 230, 220, 26);

        txtPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPasswordActionPerformed(evt);
            }
        });
        getContentPane().add(txtPassword);
        txtPassword.setBounds(230, 310, 210, 26);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/umbrella corporation.gif"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 150);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/negro.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 620, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnMenuPrincipalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuPrincipalActionPerformed
        InicioPrograma pri=new InicioPrograma();
        pri.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnMenuPrincipalActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
//        char clave[]=txtContraseña.getPassword();
//
//        String clavedef = new String(clave);
//
//        if (txtUsuario2.getText().equals("Oscar") && clavedef.equals("1234")){
//            this.dispose();
//            JOptionPane.showMessageDialog(null, "Bienvenido\n Has ingresado "
//                + "satisfactoriamente al sistema", "Mensaje de bienvenida",
//                JOptionPane.INFORMATION_MESSAGE);
//
//            AdministradorPrincipal adm = new AdministradorPrincipal();
//            adm.setVisible(true);
//        }else {
//            JOptionPane.showMessageDialog(null, "Acceso denegado:\n"
//                + "Por favor ingrese un usuario y/o contraseña correctos",
//                "Acceso denegado", JOptionPane.ERROR_MESSAGE);
        boolean usuarioEncontrado=false;
        List<ArchivoEscrituraAdministrador> tempListAdministrador= new ArrayList<>();
        tempListAdministrador=new LecturaDeDatos().ObtenerAdministrador();
        
        ArchivoEscrituraAdministrador tempAdministrador=new ArchivoEscrituraAdministrador(txtUsuario.getText(),String.copyValueOf(txtPassword.getPassword()));
        for (Iterator<ArchivoEscrituraAdministrador> iterator = tempListAdministrador.iterator(); iterator.hasNext();) {
            ArchivoEscrituraAdministrador next = iterator.next();
            if(tempAdministrador.Compare(next)){
                usuarioEncontrado=true;
                JOptionPane.showMessageDialog(this,"Bienvenido","Mensaje",JOptionPane.WARNING_MESSAGE,modificar );
                AdministradorPrincipal frame2= new AdministradorPrincipal();        
                frame2.setVisible(true);
                dispose(); 
            }
            
        }
        if(usuarioEncontrado== false) {
            labelError.setVisible(true);
            JOptionPane.showMessageDialog(this,"error de contraseña o usuario","Mensaje",JOptionPane.WARNING_MESSAGE);
        }
        
        
        System.out.println("1");
        
        if(tempListAdministrador.contains(tempAdministrador)){
                   
    
       
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

    private void txtPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPasswordActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPasswordActionPerformed

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
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ingreso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ingreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnMenuPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel labelError;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}