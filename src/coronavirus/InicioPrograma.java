    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package coronavirus;

/**
 *
 * @author oscarjavierpereztorres
 */
public class InicioPrograma extends javax.swing.JFrame {

    /** Creates new form Primera */
    public InicioPrograma() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAdministrador = new javax.swing.JButton();
        btnPaciente = new javax.swing.JButton();
        btnPuntosDeInteres = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(540, 600));
        setMinimumSize(new java.awt.Dimension(631, 631));
        getContentPane().setLayout(null);

        btnAdministrador.setBackground(new java.awt.Color(153, 153, 153));
        btnAdministrador.setText("Administrador");
        btnAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdministradorActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdministrador);
        btnAdministrador.setBounds(140, 200, 120, 29);

        btnPaciente.setText("Paciente");
        btnPaciente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacienteActionPerformed(evt);
            }
        });
        getContentPane().add(btnPaciente);
        btnPaciente.setBounds(360, 260, 120, 29);

        btnPuntosDeInteres.setText("Seguro de gastos medicos");
        btnPuntosDeInteres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPuntosDeInteresActionPerformed(evt);
            }
        });
        getContentPane().add(btnPuntosDeInteres);
        btnPuntosDeInteres.setBounds(200, 400, 230, 30);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/tenor.gif"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(80, 120, 440, 370);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(250, 570, 140, 29);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/hqdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 320, 480, 330);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/hqdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, 0, 480, 360);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/hqdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(160, 320, 470, 310);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/hqdefault.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(160, 0, 470, 350);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdministradorActionPerformed
      Ingreso ing = new Ingreso();
      ing.setVisible(true);
      this.dispose();
      
    }//GEN-LAST:event_btnAdministradorActionPerformed

    private void btnPacienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacienteActionPerformed
        RegistroPaciente pac = new RegistroPaciente();
        pac.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPacienteActionPerformed

    private void btnPuntosDeInteresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntosDeInteresActionPerformed
        PuntosDeInterres PdI = new PuntosDeInterres();
        PdI.setVisible(true);
    }//GEN-LAST:event_btnPuntosDeInteresActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnSalirActionPerformed

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
            java.util.logging.Logger.getLogger(InicioPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioPrograma.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioPrograma().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdministrador;
    private javax.swing.JButton btnPaciente;
    private javax.swing.JButton btnPuntosDeInteres;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    // End of variables declaration//GEN-END:variables

}
