/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronavirus;



import Clases.LecturaDeDatos;
import Clases.ArchivoEscrituraPaciente;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author oscarjavierpereztorres
 */
public class RegistroPaciente extends javax.swing.JFrame {

   
    public RegistroPaciente() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        Genero = new javax.swing.ButtonGroup();
        Municipio = new javax.swing.ButtonGroup();
        jComboBox1 = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jTextField1 = new javax.swing.JTextField();
        btnRegresarMenuPrinc = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblAlumnos1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtCorreoPaciente1 = new javax.swing.JTextField();
        btnGuardarPaciente = new javax.swing.JButton();
        btnSalir3 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        txtNombrePaciente = new javax.swing.JTextField();
        txtEdadPaciente = new javax.swing.JTextField();
        txtNombrePaciente1 = new javax.swing.JTextField();
        txtNumeroPaciente = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txtNombrePaciente2 = new javax.swing.JTextField();
        txtNumeroPaciente1 = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jRadioButton5 = new javax.swing.JRadioButton();
        jRadioButton6 = new javax.swing.JRadioButton();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jScrollPane1.setViewportView(jTextPane1);

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(540, 600));
        setMinimumSize(new java.awt.Dimension(631, 631));
        getContentPane().setLayout(null);

        btnRegresarMenuPrinc.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnRegresarMenuPrinc.setText("Regresar al menu principal");
        btnRegresarMenuPrinc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenuPrincActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresarMenuPrinc);
        btnRegresarMenuPrinc.setBounds(430, 770, 310, 60);

        jScrollPane3.setViewportView(tblAlumnos1);

        getContentPane().add(jScrollPane3);
        jScrollPane3.setBounds(50, 420, 1020, 290);

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Modificar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(350, 350, 140, 31);

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setText("Eliminar");
        getContentPane().add(jButton2);
        jButton2.setBounds(500, 350, 110, 31);

        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setText("limpiar campos");
        getContentPane().add(jButton3);
        jButton3.setBounds(730, 350, 170, 31);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Ciudad:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(40, 250, 80, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Codigo postal:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(270, 250, 114, 20);

        txtCorreoPaciente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoPaciente1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtCorreoPaciente1);
        txtCorreoPaciente1.setBounds(390, 250, 160, 20);

        btnGuardarPaciente.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnGuardarPaciente.setText("Agregar");
        btnGuardarPaciente.setToolTipText("");
        btnGuardarPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnGuardarPaciente);
        btnGuardarPaciente.setBounds(220, 350, 120, 31);

        btnSalir3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btnSalir3.setText("Salir");
        btnSalir3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalir3ActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir3);
        btnSalir3.setBounds(620, 350, 100, 31);

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel12.setText("Genero:");
        getContentPane().add(jLabel12);
        jLabel12.setBounds(940, 160, 70, 20);

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel13.setText("CURP:");
        getContentPane().add(jLabel13);
        jLabel13.setBounds(400, 200, 50, 22);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Registro pacientes");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 195, 29);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Apellido Materno:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(0, 0, 138, 22);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel8.setText("Nombre:");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 68, 22);

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Apellido paterno:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(310, 160, 190, 22);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Fecha de nacimiento:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(40, 200, 167, 22);

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton1.setText("F");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton1);
        jRadioButton1.setBounds(0, 0, 35, 31);

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton2.setText("M");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2);
        jRadioButton2.setBounds(0, 0, 39, 31);

        txtNombrePaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePacienteActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombrePaciente);
        txtNombrePaciente.setBounds(450, 160, 160, 20);
        getContentPane().add(txtEdadPaciente);
        txtEdadPaciente.setBounds(220, 200, 170, 20);

        txtNombrePaciente1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePaciente1ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombrePaciente1);
        txtNombrePaciente1.setBounds(770, 160, 160, 20);
        getContentPane().add(txtNumeroPaciente);
        txtNumeroPaciente.setBounds(110, 250, 140, 20);

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel11.setText("Registro pacientes");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(0, 0, 510, 29);

        jLabel14.setBackground(new java.awt.Color(255, 255, 255));
        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel14.setText("Apellido materno:");
        getContentPane().add(jLabel14);
        jLabel14.setBounds(620, 160, 140, 22);

        txtNombrePaciente2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombrePaciente2ActionPerformed(evt);
            }
        });
        getContentPane().add(txtNombrePaciente2);
        txtNombrePaciente2.setBounds(110, 160, 190, 20);
        getContentPane().add(txtNumeroPaciente1);
        txtNumeroPaciente1.setBounds(460, 200, 150, 20);

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel15.setText("Registro pacientes");
        getContentPane().add(jLabel15);
        jLabel15.setBounds(0, 0, 195, 29);

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel16.setText("Nombre:");
        getContentPane().add(jLabel16);
        jLabel16.setBounds(40, 160, 70, 22);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("Registro paciente");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(460, 50, 280, 60);

        jRadioButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton3.setText("F");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton3);
        jRadioButton3.setBounds(0, 0, 35, 31);

        jRadioButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton4.setText("M");
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton4);
        jRadioButton4.setBounds(0, 0, 39, 31);

        jRadioButton5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton5.setText("F");
        jRadioButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton5);
        jRadioButton5.setBounds(1010, 140, 35, 31);

        jRadioButton6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton6.setText("M");
        getContentPane().add(jRadioButton6);
        jRadioButton6.setBounds(1010, 180, 93, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMenuPrincActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenuPrincActionPerformed
        InicioPrograma pri=new InicioPrograma();
        pri.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarMenuPrincActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtCorreoPaciente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoPaciente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoPaciente1ActionPerformed

    private void btnGuardarPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarPacienteActionPerformed
        List<ArchivoEscrituraPaciente> listaPacientes= new ArrayList<>();
        LecturaDeDatos fr=new LecturaDeDatos();
        listaPacientes=fr.ObtenerUsuario();

        if(fr.BuscarUsuario(txtNombrePaciente.getText())!=-1){
            JOptionPane.showMessageDialog(this,"No se pudo agregar al paciente. El paciente ya esta existente" );
        }
        else{

            ArchivoEscrituraPaciente PacienteTemp=new ArchivoEscrituraPaciente();
            PacienteTemp.setNombre(txtNombrePaciente.getText());
            PacienteTemp.setSexo(cmbSexo.getSelectedItem().toString());
            PacienteTemp.setEdad(Integer.parseInt(txtEdadPaciente.getText()));
            PacienteTemp.setMuniciopio(cmbMunicipio.getSelectedItem().toString());
            PacienteTemp.setNumero(Long.parseLong(txtNumeroPaciente.getText()));
            PacienteTemp.setCorreo(txtCorreoPaciente.getText());
            PacienteTemp.GuardarPaciente2();
            JOptionPane.showMessageDialog(this,"El paciente fue registrado exitosamente");

            int id=listaPacientes.size()+1;

        }
        txtNombrePaciente.setText("");
        txtEdadPaciente.setText("");
        txtCorreoPaciente.setText("");
        txtNumeroPaciente.setText("");

        //       ArchivoEscrituraPaciente AeP= new ArchivoEscrituraPaciente();
        //
        //
        //
        //       AeP.setNombre(txtNombrePaciente.getText());
        //       AeP.setSexo(cmbSexo.getSelectedItem().toString());
        //       AeP.setEdad(Integer.parseInt(txtEdadPaciente.getText()));
        //       AeP.setMuniciopio(cmbMunicipio.getSelectedItem().toString());
        //       AeP.setCorreo(txtCorreoPaciente.getText());
        //
        //       AeP.setNumero(Long.parseLong(txtNumeroPaciente.getText()));
        //
        //        try{
            //            if(AeP.GuardarPacientes()){ // Se llama la funcion guardar de alumno
                //
                //            JOptionPane.showMessageDialog(this,"El paciente fue registrado exitosamente");
                //
                //            txtNombrePaciente.setText("");
                //            txtEdadPaciente.setText("");
                //            txtCorreoPaciente.setText("");
                //            txtNumeroPaciente.setText("");
                //
                //            }
            //        }catch (Exception e) {
            //             System.out.println("Error ");
            //        }
        //
    }//GEN-LAST:event_btnGuardarPacienteActionPerformed

    private void btnSalir3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalir3ActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnSalir3ActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void txtNombrePacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePacienteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePacienteActionPerformed

    private void txtNombrePaciente1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePaciente1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePaciente1ActionPerformed

    private void txtNombrePaciente2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombrePaciente2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombrePaciente2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jRadioButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton5ActionPerformed
     

    
    
    
    
    
    
  
    
    
    
    
    
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(RegistroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroPaciente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new RegistroPaciente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup Genero;
    private javax.swing.ButtonGroup Municipio;
    private javax.swing.JButton btnGuardarPaciente;
    private javax.swing.JButton btnRegresarMenuPrinc;
    private javax.swing.JButton btnSalir3;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JRadioButton jRadioButton5;
    private javax.swing.JRadioButton jRadioButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JTable tblAlumnos1;
    private javax.swing.JTextField txtCorreoPaciente1;
    private javax.swing.JTextField txtEdadPaciente;
    private javax.swing.JTextField txtNombrePaciente;
    private javax.swing.JTextField txtNombrePaciente1;
    private javax.swing.JTextField txtNombrePaciente2;
    private javax.swing.JTextField txtNumeroPaciente;
    private javax.swing.JTextField txtNumeroPaciente1;
    // End of variables declaration//GEN-END:variables
}
