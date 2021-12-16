/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronavirus;

import Clases.LecturaDeDatos;
import Clases.ArchivoEscrituraPaciente;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author apple
 */
public class PantallaModificarPacientes extends javax.swing.JFrame {

int index;
BaseDeDatosGeneral administradorbasededatos;
    
    public PantallaModificarPacientes(int idx,BaseDeDatosGeneral pA) {
        administradorbasededatos = pA;
        initComponents();
        index=idx;
        List<ArchivoEscrituraPaciente> listaPacietes= new ArrayList<>();
        listaPacietes = new LecturaDeDatos().ObtenerUsuario();
        
        txtNombrePaciente.setText(String.valueOf(listaPacietes.get(idx).getNombre()));
        txtEdadPaciente.setText(String.valueOf(listaPacietes.get(idx).getEdad()));
        txtCorreoPaciente.setText(String.valueOf(listaPacietes.get(idx).getCorreo()));
        txtNumeroPaciente.setText(String.valueOf(listaPacietes.get(idx).getNumero()));
        
            
    }
      
    
    
    
    
    
    
    
    
    
    
    
    public PantallaModificarPacientes() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombrePaciente = new javax.swing.JTextField();
        txtEdadPaciente = new javax.swing.JTextField();
        txtNumeroPaciente = new javax.swing.JTextField();
        txtCorreoPaciente = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnModificarPaciente = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        cmbSexo = new javax.swing.JComboBox<>();
        cmbMunicipio = new javax.swing.JComboBox<>();
        btnCancealar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(631, 631));
        getContentPane().setLayout(null);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre: ");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(40, 220, 70, 16);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Edad: ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(40, 310, 38, 16);

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Numero:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 390, 60, 20);

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Correo: ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(40, 420, 50, 20);

        txtNombrePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePacienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombrePaciente);
        txtNombrePaciente.setBounds(120, 220, 160, 26);
        getContentPane().add(txtEdadPaciente);
        txtEdadPaciente.setBounds(120, 310, 160, 26);
        getContentPane().add(txtNumeroPaciente);
        txtNumeroPaciente.setBounds(120, 390, 160, 30);
        getContentPane().add(txtCorreoPaciente);
        txtCorreoPaciente.setBounds(120, 420, 160, 30);

        jLabel8.setFont(new java.awt.Font("Lucida Grande", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Modificar pacientes");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(180, 120, 250, 30);

        btnModificarPaciente.setText("Modificar");
        btnModificarPaciente.setToolTipText("");
        btnModificarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificarPaciente);
        btnModificarPaciente.setBounds(210, 540, 180, 29);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Genero:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(40, 260, 60, 20);

        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setText("Municipio:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(40, 340, 100, 30);

        cmbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "Hombre ", "Mujer" }));
        cmbSexo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbSexoActionPerformed(evt);
            }
        });
        getContentPane().add(cmbSexo);
        cmbSexo.setBounds(120, 260, 140, 27);

        cmbMunicipio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "Zapopan", "Guadalajara", "Tlaquepaque", "El salto", "Ixtlahuacan", "Tlajomulco de zuñiga", "Juanacatlan", "Tonala", "Zapotlanejo" }));
        getContentPane().add(cmbMunicipio);
        cmbMunicipio.setBounds(120, 350, 130, 27);

        btnCancealar.setText("Cancelar");
        btnCancealar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancealarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancealar);
        btnCancealar.setBounds(260, 570, 98, 29);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/umbrella corporation.gif"))); // NOI18N
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 500, 180);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/negro.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 620, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtNombrePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePacienteActionPerformed
        this.dispose();
    }//GEN-LAST:event_txtNombrePacienteActionPerformed

    private void btnModificarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarPacienteActionPerformed
        List<ArchivoEscrituraPaciente> listaPaciente= new ArrayList<>();
        LecturaDeDatos LD = new LecturaDeDatos();
        
        listaPaciente =LD.ObtenerUsuario();
        
        ArchivoEscrituraPaciente PacienteTemp = new ArchivoEscrituraPaciente();
        PacienteTemp.setNombre(txtNombrePaciente.getText());
        PacienteTemp.setSexo((String) cmbSexo.getSelectedItem());
        PacienteTemp.setEdad(Integer.parseInt(txtEdadPaciente.getText()));
        PacienteTemp.setMuniciopio((String) cmbMunicipio.getSelectedItem());
        PacienteTemp.setNumero(Long.parseLong(txtNumeroPaciente.getText()));
        PacienteTemp.setCorreo(txtCorreoPaciente.getText());
        PacienteTemp.GuardarPaciente2();
        listaPaciente.set(index, PacienteTemp);
        listaPaciente.get(index).BorrarPacientes();
        for (Iterator<ArchivoEscrituraPaciente> iterator = listaPaciente.iterator(); iterator.hasNext();) {
            ArchivoEscrituraPaciente next = iterator.next();
            next.GuardarPaciente2();
        }
            
       administradorbasededatos.TablaPacientes();
        
        dispose();
    }//GEN-LAST:event_btnModificarPacienteActionPerformed

    private void cmbSexoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbSexoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbSexoActionPerformed

    private void btnCancealarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancealarActionPerformed
       dispose();
    }//GEN-LAST:event_btnCancealarActionPerformed

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
            java.util.logging.Logger.getLogger(PantallaModificarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaModificarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaModificarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaModificarPacientes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaModificarPacientes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancealar;
    private javax.swing.JButton btnModificarPaciente;
    private javax.swing.JComboBox<String> cmbMunicipio;
    private javax.swing.JComboBox<String> cmbSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txtCorreoPaciente;
    private javax.swing.JTextField txtEdadPaciente;
    private javax.swing.JTextField txtNombrePaciente;
    private javax.swing.JTextField txtNumeroPaciente;
    // End of variables declaration//GEN-END:variables
}
