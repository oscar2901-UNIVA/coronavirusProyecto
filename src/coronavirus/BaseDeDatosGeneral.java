package coronavirus;

import Clases.ArchivoEscrituraHospitales;
import Clases.LecturaDeDatos;
import Clases.ArchivoEscrituraMedicamentos;
import Clases.ArchivoEscrituraPaciente;
import Clases.ArchivoEscrituraFarmacias;
import Clases.ArchivoEscrituraAdministrador;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class BaseDeDatosGeneral extends javax.swing.JFrame {

    List<ArchivoEscrituraPaciente> listaPacietes = new ArrayList<>();
    List<ArchivoEscrituraAdministrador> listaAdministradores = new ArrayList<>();
    List<ArchivoEscrituraFarmacias> listaFarmacias = new ArrayList<>();
    List<ArchivoEscrituraMedicamentos> listaMedicamentos = new ArrayList<>();
    List<ArchivoEscrituraHospitales> listaHospitales = new ArrayList<>();

    public BaseDeDatosGeneral() {
        initComponents(); //INICIA LOS COMPONNTES
        TablaPacientes();
        TablaAdminstradores();
        TablaFarmacias();
        TablaHospitales();
        TablaMedicamentos();
    }

    void TablaPacientes() {
        DefaultTableModel model = new DefaultTableModel();

        Object[] columnIdentifier = new Object[]{"Nombre Paciente", "Genero", "Edad", "Municipio", "Numero", "Correo"};               //aqui estoy haciuendo una estructura
        model.setColumnIdentifiers(columnIdentifier);
        tablaPaciente.setModel(model);

        listaPacietes = new LecturaDeDatos().ObtenerUsuario();

        Object[] row = new Object[6];

        for (Iterator<ArchivoEscrituraPaciente> iterator = listaPacietes.iterator(); iterator.hasNext();) {
            ArchivoEscrituraPaciente tempArchivoEscrituraPaciente = iterator.next();
            row[0] = tempArchivoEscrituraPaciente.getNombre();
            row[1] = tempArchivoEscrituraPaciente.getSexo();
            row[2] = tempArchivoEscrituraPaciente.getEdad();
            row[3] = tempArchivoEscrituraPaciente.getMuniciopio();
            row[4] = tempArchivoEscrituraPaciente.getNumero();
            row[5] = tempArchivoEscrituraPaciente.getCorreo();
            model.addRow(row);
        }

//      
        tablaPaciente.setSelectionMode(0);
        tablaPaciente.setRowSelectionInterval(0, 0);
    }

    void TablaAdminstradores() {

        DefaultTableModel model = new DefaultTableModel();

        Object[] columnIdentifier = new Object[]{"Usuario", "Contraseña"};               //aqui estoy haciuendo una estructura
        model.setColumnIdentifiers(columnIdentifier);
        tablaAdministradores.setModel(model);

        listaAdministradores = new LecturaDeDatos().ObtenerAdministrador();

        Object[] row = new Object[2];

        for (Iterator<ArchivoEscrituraAdministrador> iterator = listaAdministradores.iterator(); iterator.hasNext();) {
            ArchivoEscrituraAdministrador tempArchivoAdministradorEscritura = iterator.next();
            row[0] = tempArchivoAdministradorEscritura.getNombre();
            row[1] = tempArchivoAdministradorEscritura.getPassword();

            model.addRow(row);
        }
        tablaAdministradores.setSelectionMode(0);
        tablaAdministradores.setRowSelectionInterval(0, 0);

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

        Object[] columnIdentifier = new Object[]{"Nombre del medicamento", "Precio unitario"};               //aqui estoy haciuendo una estructura
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

        jMenu1 = new javax.swing.JMenu();
        btnRegresarMenu = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        BaseDeDatos = new javax.swing.JTabbedPane();
        jScrollPane6 = new javax.swing.JScrollPane();
        tablaPaciente = new javax.swing.JTable();
        jScrollPane7 = new javax.swing.JScrollPane();
        tablaAdministradores = new javax.swing.JTable();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaFarmacia = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tablaHospitales = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tablasMedicamentos = new javax.swing.JTable();
        btnModificar = new javax.swing.JButton();
        btnBorrar = new javax.swing.JButton();
        btnAgregar = new javax.swing.JButton();
        btnActualizar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(631, 631));
        getContentPane().setLayout(null);

        btnRegresarMenu.setText("Regresar al menu principal");
        btnRegresarMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegresarMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegresarMenu);
        btnRegresarMenu.setBounds(30, 590, 211, 29);

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnSalir);
        btnSalir.setBounds(380, 590, 210, 29);

        tablaPaciente.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane6.setViewportView(tablaPaciente);

        BaseDeDatos.addTab("Pacientes ", jScrollPane6);

        tablaAdministradores.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane7.setViewportView(tablaAdministradores);

        BaseDeDatos.addTab("Administradores ", jScrollPane7);

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

        BaseDeDatos.addTab("Farmacias", jScrollPane1);

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

        BaseDeDatos.addTab("Hospitales", jScrollPane2);

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

        BaseDeDatos.addTab("Medicamentos", jScrollPane3);

        getContentPane().add(BaseDeDatos);
        BaseDeDatos.setBounds(0, 190, 630, 316);

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar);
        btnModificar.setBounds(80, 530, 103, 29);

        btnBorrar.setText("Borrar");
        btnBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBorrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBorrar);
        btnBorrar.setBounds(430, 530, 97, 29);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        getContentPane().add(btnAgregar);
        btnAgregar.setBounds(260, 530, 93, 29);

        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });
        getContentPane().add(btnActualizar);
        btnActualizar.setBounds(500, 150, 107, 29);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/umbrella corporation.gif"))); // NOI18N
        getContentPane().add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 210);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Picture/negro.jpg"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 630, 640);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegresarMenuActionPerformed
        AdministradorPrincipal adm = new AdministradorPrincipal();
        adm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarMenuActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(WIDTH);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        int idx = BaseDeDatos.getSelectedIndex();
        System.out.println(idx);
        if (idx == 0) {
            RegistroPaciente Frame = new RegistroPaciente();
            Frame.setVisible(true);

        }
        if (idx == 1) {
            RegistroAdministrador Frame = new RegistroAdministrador();
            Frame.setVisible(true);

        }
        if (idx == 2) {
            RegistroFarmacias far = new RegistroFarmacias();
            far.setVisible(true);

        }
        if (idx == 3) {
            RegistroHospitales hos = new RegistroHospitales();
            hos.setVisible(true);
        }
        if (idx == 4) {
            RegistroMedicamentos med = new RegistroMedicamentos();
            med.setVisible(true);

        }


    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        int idx = BaseDeDatos.getSelectedIndex();
            if (idx == 0) {
                int index = tablaPaciente.getSelectedRow();
                PantallaModificarPacientes Pant = new PantallaModificarPacientes(index,this);
                Pant.setVisible(true);

        }
        if (idx==1){
            int index = tablaAdministradores.getSelectedRow();
            PantallaModificarAdministrador Frame= new PantallaModificarAdministrador(index,this);
            Frame.setVisible(true);
        }
        if (idx==2){
            int index =tablaFarmacia.getSelectedRow();
            PantallaModificarFarmacia Frame= new PantallaModificarFarmacia(index,this);
            Frame.setVisible(true);
        }
        if (idx==3){
            int index =tablaHospitales.getSelectedRow();
            PantallaModificarHospitales Frame= new PantallaModificarHospitales(index,this);
            Frame.setVisible(true);
        }
        if (idx==4){
            int index =tablasMedicamentos.getSelectedRow();
            PantallaModificarMedicamentos Frame= new PantallaModificarMedicamentos(index,this);
            Frame.setVisible(true);
        }
        
        
        
        
        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        TablaPacientes();
        TablaAdminstradores();
        TablaFarmacias();
        TablaHospitales();
        TablaMedicamentos();
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBorrarActionPerformed
              int idx = BaseDeDatos.getSelectedIndex();
        if (idx==0){
            int Index =tablaPaciente.getSelectedRow();
            
            listaPacietes.remove(Index);
            (new ArchivoEscrituraPaciente()).BorrarPacientes();
            for (Iterator<ArchivoEscrituraPaciente> iterator = listaPacietes.iterator(); iterator.hasNext();) {
                ArchivoEscrituraPaciente next = iterator.next();
                next.GuardarPaciente2();
            }
            
           TablaPacientes();
        }
        
        
        if (idx==1){
            int Index = tablaAdministradores.getSelectedRow();
            if (Index==0){
                JOptionPane.showMessageDialog(this,"No se puede elminar Administrador principal" );
                return;
            }
            listaAdministradores.remove(Index);
            (new ArchivoEscrituraAdministrador()).BorrarAdministrador();
            for (Iterator<ArchivoEscrituraAdministrador> iterator = listaAdministradores.iterator(); iterator.hasNext();) {
                ArchivoEscrituraAdministrador next = iterator.next();
                next.GuardarAdministrador2();
            }
            TablaAdminstradores();
        }
        
        
        if (idx==2){
            int Index =tablaFarmacia.getSelectedRow();
            
            listaFarmacias.remove(Index);
            (new ArchivoEscrituraFarmacias()).BorrarFarmacia();
            for (Iterator<ArchivoEscrituraFarmacias> iterator = listaFarmacias.iterator(); iterator.hasNext();) {
                ArchivoEscrituraFarmacias next = iterator.next();
                next.GuardarFarmacia2();
            }
            
           TablaFarmacias();
        
        }
        
        
        
        if (idx==3){
            int Index =tablaHospitales.getSelectedRow();
            
            listaHospitales.remove(Index);
            (new ArchivoEscrituraHospitales()).BorrarHospitales();
            for (Iterator<ArchivoEscrituraHospitales> iterator = listaHospitales.iterator(); iterator.hasNext();) {
                ArchivoEscrituraHospitales next = iterator.next();
                next.GuardarHospital2();
            }
            
           TablaHospitales();
        
        }
        
        
        
        if (idx==4){
            int Index =tablasMedicamentos.getSelectedRow();
            
            listaMedicamentos.remove(Index);
            (new ArchivoEscrituraMedicamentos()).BorrarMedicamentos();
            for (Iterator<ArchivoEscrituraMedicamentos> iterator = listaMedicamentos.iterator(); iterator.hasNext();) {
                ArchivoEscrituraMedicamentos next = iterator.next();
                next.GuardarMedicamento2();
            }
            
           TablaMedicamentos();
        }
        
        
        
        
        
        
        
    }//GEN-LAST:event_btnBorrarActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BaseDeDatosGeneral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTabbedPane BaseDeDatos;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBorrar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegresarMenu;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JTable tablaAdministradores;
    private javax.swing.JTable tablaFarmacia;
    private javax.swing.JTable tablaHospitales;
    private javax.swing.JTable tablaPaciente;
    private javax.swing.JTable tablasMedicamentos;
    // End of variables declaration//GEN-END:variables
}
