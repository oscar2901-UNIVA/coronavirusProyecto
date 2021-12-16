/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronavirus;

import Clases.ArchivoEscrituraFarmacias;
import Clases.ArchivoEscrituraHospitales;
import Clases.LecturaDeDatos;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author oscarjavierpereztorres
 */
public class RegistroHospitales extends javax.swing.JFrame {

    
    public RegistroHospitales() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtNombreHospital = new javax.swing.JTextField();
        btnGuardar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        btnRegresarMenu = new javax.swing.JButton();
        cmbSeguro = new javax.swing.JComboBox<>();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(631, 631));
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Hospitales");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(212, 115, 180, 98);

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre del hospital:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(106, 261, 143, 17);

        jLabel4.setFont(new java.awt.Font("Lucida Grande", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Aceptan seguro de gastos medicos:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(6, 342, 243, 17);
        getContentPane().add(txtNombreHospital);
        txtNombreHospital.setBounds(261, 258, 198, 26);

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardar);
        btnGuardar.setBounds(220, 570, 93, 40);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(460, 570, 150, 40);

        btnRegresarMenu.setText("Regresar al menu anterior");
        btnRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresarMenu);
        btnRegresarMenu.setBounds(0, 570, 205, 40);

        cmbSeguro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar:", "Si", "No" }));
        getContentPane().add(cmbSeguro);
        cmbSeguro.setBounds(260, 340, 200, 27);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(btnCancelar);
        btnCancelar.setBounds(340, 570, 98, 40);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/umbrella corporation.gif"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(0, 0, 500, 180);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/negro.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(0, 0, 630, 630);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
//        ArchivoEscrituraHospitales EscHospitales = new ArchivoEscrituraHospitales();
//    
//        EscHospitales.setNombreHospital(txtNombreHospital.getText());
//  
//        EscHospitales.setSeguro(cmbSeguro.getSelectedItem().toString());
//       
//       
//        
//        try{
//            if(EscHospitales.save()){ // Se llama la funcion guardar de alumno
//            
//            JOptionPane.showMessageDialog(this,"El hospital fue registrado exitosamente");
//            
//            txtNombreHospital.setText("");
//     
//           
//            
//            }
//        }catch (Exception e) {
//             System.out.println("Error ");
//        }                     
        

      List<ArchivoEscrituraHospitales> listaHospitales= new ArrayList<>();
         LecturaDeDatos fr=new LecturaDeDatos();
         listaHospitales=fr.ObtenerHospitales();
        
        if(fr.BuscarHospital(txtNombreHospital.getText())!=-1){
            JOptionPane.showMessageDialog(this,"No se pudo agregar el hospital ya existe" );
        }else{
            ArchivoEscrituraHospitales HospitalTemp=new ArchivoEscrituraHospitales();
            HospitalTemp.setNombreHospital(txtNombreHospital.getText());
            HospitalTemp.setSeguro(cmbSeguro.getSelectedItem().toString());
            
            
            HospitalTemp.GuardarHospital2();
            JOptionPane.showMessageDialog(this,"El hospital fue registrado exitosamente");
            int id=listaHospitales.size()+1;
        }
        txtNombreHospital.setText("");

       
















    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenuActionPerformed
       AdministradorPrincipal adm=new AdministradorPrincipal();
    adm.setVisible(true);
    this.dispose();
    }//GEN-LAST:event_btnRegresarMenuActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(RegistroHospitales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroHospitales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroHospitales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroHospitales.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroHospitales().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnRegresarMenu;
    private javax.swing.JButton btnSalir;
    private javax.swing.JComboBox<String> cmbSeguro;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtNombreHospital;
    // End of variables declaration//GEN-END:variables
}
