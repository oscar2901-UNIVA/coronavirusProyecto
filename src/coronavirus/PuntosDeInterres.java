/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coronavirus;

import Clases.ArchivoEscrituraFarmacias;
import Clases.ArchivoEscrituraMedicamentos;
import Clases.LecturaDeDatos;
import Clases.ArchivoEscrituraHospitales;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author apple
 */
public class PuntosDeInterres extends javax.swing.JFrame {

    List<ArchivoEscrituraFarmacias> listaFarmacias = new ArrayList<>();
    List<ArchivoEscrituraMedicamentos> listaMedicamentos = new ArrayList<>();
    List<ArchivoEscrituraHospitales> listaHospitales = new ArrayList<>();
    
    
    public PuntosDeInterres() {
        initComponents();
         TablaFarmacias();
        TablaHospitales();
        TablaMedicamentos();
    }

   void TablaFarmacias() {
        DefaultTableModel model = new DefaultTableModel();

        Object[] columnIdentifier = new Object[]{"Nombre", "Municipio", "Precios"};               //aqui estoy haciuendo una estructura
        model.setColumnIdentifiers(columnIdentifier);
        tablaFarmacia.setModel(model);

        listaFarmacias = new LecturaDeDatos().ObtenerFarmacias();

        Object[] row = new Object[3];

        for (Iterator<ArchivoEscrituraFarmacias> iterator = listaFarmacias.iterator(); iterator.hasNext();) {
            ArchivoEscrituraFarmacias tempEscrituraFarmacias = iterator.next();
            row[0] = tempEscrituraFarmacias.getNombreFarmacia();
            row[1] = tempEscrituraFarmacias.getMunicipio();
            row[2] = tempEscrituraFarmacias.getPrecio();
            model.addRow(row);
        }

        tablaFarmacia.setSelectionMode(0);
        tablaFarmacia.setRowSelectionInterval(0, 0);

    }

    void TablaMedicamentos() {
        DefaultTableModel model = new DefaultTableModel();

        Object[] columnIdentifier = new Object[]{"Nombre del medicamento", "Precio de datos"};               //aqui estoy haciuendo una estructura
        model.setColumnIdentifiers(columnIdentifier);
        tablasMedicamentos.setModel(model);

        listaMedicamentos = new LecturaDeDatos().ObtenerMedicamentos();

        Object[] row = new Object[2];

        for (Iterator<ArchivoEscrituraMedicamentos> iterator = listaMedicamentos.iterator(); iterator.hasNext();) {
            ArchivoEscrituraMedicamentos tempEscrituraMedicamentos = iterator.next();
            row[0] = tempEscrituraMedicamentos.getNombreMedicamento();
            
            row[1] = tempEscrituraMedicamentos.getPrecioUnitario();
            model.addRow(row);
        }
        tablasMedicamentos.setSelectionMode(0);
        tablasMedicamentos.setRowSelectionInterval(0, 0);
    }

    void TablaHospitales() {
        DefaultTableModel model = new DefaultTableModel();

        Object[] columnIdentifier = new Object[]{"Nombre del hospital", "Aceptan seguro"};               //aqui estoy haciuendo una estructura
        model.setColumnIdentifiers(columnIdentifier);
        tablaHospitales.setModel(model);

        listaHospitales = new LecturaDeDatos().ObtenerHospitales();

        Object[] row = new Object[2];

        for (Iterator<ArchivoEscrituraHospitales> iterator = listaHospitales.iterator(); iterator.hasNext();) {
            ArchivoEscrituraHospitales tempEscrituraHospitales = iterator.next();
            row[0] = tempEscrituraHospitales.getNombreHospital();
            row[1] = tempEscrituraHospitales.getSeguro();
            model.addRow(row);
        }
        tablaHospitales.setSelectionMode(0);
        tablaHospitales.setRowSelectionInterval(0, 0);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToggleButton1 = new javax.swing.JToggleButton();
        btnRegresarMenu = new javax.swing.JButton();
        tablasDeDatos = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaHospitales = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablasMedicamentos = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFarmacia = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jToggleButton1.setText("jToggleButton1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(631, 631));
        getContentPane().setLayout(null);

        btnRegresarMenu.setText("Cancelar");
        btnRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresarMenu);
        btnRegresarMenu.setBounds(210, 550, 98, 29);

        tablaHospitales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tablaHospitales);

        tablasDeDatos.addTab("Hospitales", jScrollPane2);

        tablasMedicamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tablasMedicamentos);

        tablasDeDatos.addTab("Medicamentos", jScrollPane3);

        tablaFarmacia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tablaFarmacia);

        tablasDeDatos.addTab("Farmacias", jScrollPane1);

        getContentPane().add(tablasDeDatos);
        tablasDeDatos.setBounds(0, 136, 630, 370);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/umbrella corporation.gif"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 210);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/negro.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 630, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenuActionPerformed
        
        this.dispose();
    }//GEN-LAST:event_btnRegresarMenuActionPerformed

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
            java.util.logging.Logger.getLogger(PuntosDeInterres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PuntosDeInterres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PuntosDeInterres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PuntosDeInterres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PuntosDeInterres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegresarMenu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JTable tablaFarmacia;
    private javax.swing.JTable tablaHospitales;
    private javax.swing.JTabbedPane tablasDeDatos;
    private javax.swing.JTable tablasMedicamentos;
    // End of variables declaration//GEN-END:variables
}
