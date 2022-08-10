/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControllerContactos;
import Controles_Personalizados.Botones.UWPButton;
import java.awt.Color;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author danlo
 */
public class PanelContactos extends javax.swing.JPanel {

    /**
     * Creates new form PanelContactos
     */
    public PanelContactos() {
        initComponents();
        
        String[] headerContactos = {"Id Contacto", "contacto", "id Personal", "id TipoContacto", "Modificar", "Eliminar"};
        model = new DefaultTableModel(null, headerContactos){
            @Override
            public boolean isCellEditable(int row, int column){ // aqui esta
                return false;
            }
        };
        CargarTabla();
    }
    
    DefaultTableModel model;
    UWPButton btnModificar = new UWPButton(); 
    UWPButton btnEliminar = new UWPButton();
    ImageIcon Modificar = new ImageIcon(getClass().getResource("/Recursos_Proyecto/editar.png"));
    ImageIcon Eliminar = new ImageIcon(getClass().getResource("/Recursos_Proyecto/Eliminar.png"));

    DefaultComboBoxModel<String> modelcombo = new DefaultComboBoxModel<>();
    ArrayList list;
    int tipo_contacto = 0;
    int idpersonal = 0;
    
    
    final void CargarTabla() {
        tbContactos.setModel(model);
        while(model.getRowCount() > 0){
            model.removeRow(0);
        }
        try {
            ResultSet rs = ControllerContactos.CargarTablaContactos_Controller();           
            while(rs.next()){
                btnModificar.setIcon(Modificar);
                btnEliminar.setIcon(Eliminar);
                btnModificar.setBackground(new Color(231,234,239));
                btnEliminar.setBackground(new Color(231,234,239));
                Object[] oValues = {rs.getInt("idContacto"), rs.getString("contacto"), rs.getInt("idPersonal"), rs.getInt("idTipoContacto"), btnModificar, btnEliminar};
                model.addRow(oValues);
            }
        } catch(Exception e){
        }
        
    }
    
    final void CenterTableContent() {
        DefaultTableCellRenderer centerRende = new DefaultTableCellRenderer();
        centerRende.setHorizontalAlignment(JLabel.CENTER);
        tbContactos.getColumnModel().getColumn(0).setCellRenderer(centerRende);
        tbContactos.getColumnModel().getColumn(1).setCellRenderer(centerRende);
        tbContactos.getColumnModel().getColumn(2).setCellRenderer(centerRende);
        tbContactos.getColumnModel().getColumn(3).setCellRenderer(centerRende);
        tbContactos.getColumnModel().getColumn(4).setCellRenderer(centerRende);
        tbContactos.getColumnModel().getColumn(5).setCellRenderer(centerRende);

    }
    
    final void EliminarContacto() {
        int confirmacion = JOptionPane.YES_NO_OPTION;
        JOptionPane.showMessageDialog(this, "Estas seguro que deseas eliminar el registro", "Confirmacion de eliminacion", confirmacion);
        if(confirmacion == JOptionPane.YES_OPTION){
//            ControllerContactos.idcontacto = Integer.parseInt(lblID.getText());
            boolean respuesta = ControllerContactos.EliminarContactos_Controller();
            if(respuesta == true) {
                ValidacionesSistema.ValidacionesBeep_Go.Notificacion("Eliminacion de registro", "Contacto eliminado con exito", 1);
            } else {
                ValidacionesSistema.ValidacionesBeep_Go.Notificacion("Eliminacion de registro", "Contacto no fue eliminado", 2);
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelFondo = new Controles_Personalizados.Paneles.PanelRound();
        lblContactos = new javax.swing.JLabel();
        btnFiltrar = new Controles_Personalizados.Botones.UWPButton();
        btnAgregar = new Controles_Personalizados.Botones.UWPButton();
        PanelTabla = new javax.swing.JScrollPane();
        tbContactos = new Controles_Personalizados.Tables.Table();
        ScrollTabla = new Controles_Personalizados.ScrollBar.ScrollBarCustom();

        PanelFondo.setBackground(new java.awt.Color(231, 234, 239));
        PanelFondo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        PanelFondo.setPreferredSize(new java.awt.Dimension(1270, 620));
        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblContactos.setFont(new java.awt.Font("Roboto Medium", 0, 40)); // NOI18N
        lblContactos.setForeground(new java.awt.Color(58, 50, 75));
        lblContactos.setText("Contactos");
        PanelFondo.add(lblContactos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        btnFiltrar.setBackground(new java.awt.Color(58, 50, 75));
        btnFiltrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/Filtrar Blanco.png"))); // NOI18N
        btnFiltrar.setText(" Filtrar");
        btnFiltrar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnFiltrar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnFiltrar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        PanelFondo.add(btnFiltrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 80, 150, 40));

        btnAgregar.setBackground(new java.awt.Color(58, 50, 75));
        btnAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/Agregar Blanco.png"))); // NOI18N
        btnAgregar.setText(" Agregar");
        btnAgregar.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        btnAgregar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnAgregar.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        btnAgregar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMouseClicked(evt);
            }
        });
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });
        PanelFondo.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, 40));

        PanelTabla.setHorizontalScrollBar(null);
        PanelTabla.setVerticalScrollBar(ScrollTabla);
        PanelTabla.setWheelScrollingEnabled(false);

        tbContactos.setBackground(new java.awt.Color(231, 234, 239));
        tbContactos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CARNET", "NOMBRES", "TIPO USUARIO", "%ENTRADAS", "%SALIDAS", "ACCIONES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbContactos.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tbContactos.setGridColor(new java.awt.Color(58, 50, 75));
        tbContactos.setName(""); // NOI18N
        tbContactos.setSelectionBackground(new java.awt.Color(58, 50, 75));
        tbContactos.setShowVerticalLines(false);
        tbContactos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbContactosMouseClicked(evt);
            }
        });
        PanelTabla.setViewportView(tbContactos);

        PanelFondo.add(PanelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 1230, 480));

        ScrollTabla.setBackground(new java.awt.Color(58, 50, 75));
        ScrollTabla.setForeground(new java.awt.Color(58, 50, 75));
        PanelFondo.add(ScrollTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(1238, 177, 10, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1270, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 620, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelFondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    FrmPersonal_Contacto add = new FrmPersonal_Contacto();
    
    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        if (add.isVisible()) {
            add.toFront();
        }else{
            add.setVisible(true);
        }
        
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAgregarActionPerformed

    FrmAgg_Contacto frmContactos = new FrmAgg_Contacto();
    
    private void tbContactosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbContactosMouseClicked
        int column = tbContactos.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY() / tbContactos.getRowHeight();
        btnModificar.setName("btnModificar");
        btnEliminar.setName("btnEliminar");
        if(row < tbContactos.getRowCount() || row >= 0 || column < tbContactos.getColumnCount() || column >= 0){
            Object vals = tbContactos.getValueAt(row, column);
            if (vals instanceof UWPButton){
                ((UWPButton) vals).doClick(); // aqui esta
                UWPButton btns = (UWPButton) vals;
                if (btns.getName().equals("btnModificar")){
                    frmContactos.show();
                    //Actualizar Contacto metodo
                }
                if (btns.getName().equals("btnEliminar")){
                    // Eliminar Contacto metodo
                    EliminarContacto();
                    CargarTabla();
                }
            }
        }
    }//GEN-LAST:event_tbContactosMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Controles_Personalizados.Paneles.PanelRound PanelFondo;
    private javax.swing.JScrollPane PanelTabla;
    private Controles_Personalizados.ScrollBar.ScrollBarCustom ScrollTabla;
    private Controles_Personalizados.Botones.UWPButton btnAgregar;
    private Controles_Personalizados.Botones.UWPButton btnFiltrar;
    private javax.swing.JLabel lblContactos;
    private Controles_Personalizados.Tables.Table tbContactos;
    // End of variables declaration//GEN-END:variables
}
