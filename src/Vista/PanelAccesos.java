/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControllerAccesos;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import java.sql.ResultSet;
import java.sql.SQLException;
import Controles_Personalizados.Botones.UWPButton;
import Controles_Personalizados.RenderTable;
import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author danlo
 */
public class PanelAccesos extends javax.swing.JPanel {

    DefaultTableModel tb;
    ControllerAccesos controller = new ControllerAccesos();

    UWPButton btnupdate = new UWPButton();
    UWPButton btndelete = new UWPButton();

    public Font font = new Font("Roboto Black", Font.PLAIN, 18);
    /**
     * Creates new form PanelAccesos
     */
    public PanelAccesos() {
        initComponents();
        String[] header = {"IDAcceso", "Documento", "IDCarnet", "Fecha", "IDTipoAcceso", "Hora", "Tipo de acceso", "Notificación", "Modificar", "Eliminar"};
        tb = new DefaultTableModel(null, header);
        loadTable();
        TbAccesosWhite4.setDefaultRenderer(Object.class, new RenderTable());
        TbAccesosWhite4.setModel(tb);
        TbAccesosWhite4.removeColumn(TbAccesosWhite4.getColumnModel().getColumn(0));
        TbAccesosWhite4.removeColumn(TbAccesosWhite4.getColumnModel().getColumn(1));
        TbAccesosWhite4.removeColumn(TbAccesosWhite4.getColumnModel().getColumn(2));

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
        lblAccesos = new javax.swing.JLabel();
        btnFiltrar = new Controles_Personalizados.Botones.UWPButton();
        btnAgregar = new Controles_Personalizados.Botones.UWPButton();
        PanelTabla = new javax.swing.JScrollPane();
        TbAccesosWhite4 = new Controles_Personalizados.Tables.Table();
        ScrollTabla = new Controles_Personalizados.ScrollBar.ScrollBarCustom();

        PanelFondo.setBackground(new java.awt.Color(231, 234, 239));
        PanelFondo.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        PanelFondo.setPreferredSize(new java.awt.Dimension(1270, 620));
        PanelFondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblAccesos.setFont(new java.awt.Font("Roboto Medium", 0, 40)); // NOI18N
        lblAccesos.setForeground(new java.awt.Color(58, 50, 75));
        lblAccesos.setText("Accesos");
        PanelFondo.add(lblAccesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

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
        PanelFondo.add(btnAgregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 150, 40));

        PanelTabla.setHorizontalScrollBar(null);
        PanelTabla.setVerticalScrollBar(ScrollTabla);
        PanelTabla.setWheelScrollingEnabled(false);

        TbAccesosWhite4.setBackground(new java.awt.Color(231, 234, 239));
        TbAccesosWhite4.setModel(new javax.swing.table.DefaultTableModel(
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
        TbAccesosWhite4.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        TbAccesosWhite4.setGridColor(new java.awt.Color(58, 50, 75));
        TbAccesosWhite4.setName(""); // NOI18N
        TbAccesosWhite4.setSelectionBackground(new java.awt.Color(58, 50, 75));
        TbAccesosWhite4.setShowVerticalLines(false);
        TbAccesosWhite4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                TbAccesosWhite4MouseEntered(evt);
            }
        });
        PanelTabla.setViewportView(TbAccesosWhite4);

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

    FrmAgg_Acceso add = new FrmAgg_Acceso();

    private void btnAgregarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMouseClicked
        if (add.isVisible()) {
            add.toFront();
        } else {
            add.setVisible(true);
        }
    }//GEN-LAST:event_btnAgregarMouseClicked

    private void TbAccesosWhite4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TbAccesosWhite4MouseEntered
        int col = TbAccesosWhite4.getColumnModel().getColumnIndexAtX(evt.getX()); 
        int row = evt.getY()/TbAccesosWhite4.getRowHeight();
        if (row < TbAccesosWhite4.getRowCount() && row > 0 && col > 0 && col< TbAccesosWhite4.getColumnCount()) {
            Object value = TbAccesosWhite4.getValueAt(row, col);
            if (value instanceof UWPButton) {
                ((UWPButton)value).setEffectColor(new Color(254,254,254));
                UWPButton btn = (UWPButton) value;
                btn.setEffectColor(new Color(254,254,254));
            }
        }
    }//GEN-LAST:event_TbAccesosWhite4MouseEntered

    void loadTable() {
        btnupdate.setName("btnUpdate");
        btnupdate.setText("Modificar");
        btnupdate.setBackground(new Color(254,254,254));
        btnupdate.setEffectColor(new Color(255,255,255));
        btnupdate.setForeground(new Color(42,36,56));
        btnupdate.setFont(font);
        
        btndelete.setName("btnDelete");
        btndelete.setText("Eliminar");
        btndelete.setBackground(new Color(254,254,254));
        btndelete.setEffectColor(new Color(255,255,255));
        btndelete.setForeground(new Color(42, 36, 56));
        btndelete.setFont(font);
        ResultSet rs;
        try {
            while (tb.getRowCount() > 0) {
                tb.removeRow(0);
            }
            rs = ControllerAccesos.getdata("vwAccesos");
            while (rs.next()) {
                Object[] data = {rs.getInt("idAcceso"), rs.getString("numero_carnet"), rs.getInt("idCarnet"), rs.getDate("fecha"), rs.getInt("idTipoAcceso"), rs.getTime("hora"), rs.getString("tipo_acceso"), rs.getString("notificacion"), btnupdate, btndelete};
                tb.addRow(data);
            }
        } catch (SQLException e) {
            System.out.println("Error:" + e.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Controles_Personalizados.Paneles.PanelRound PanelFondo;
    private javax.swing.JScrollPane PanelTabla;
    private Controles_Personalizados.ScrollBar.ScrollBarCustom ScrollTabla;
    private Controles_Personalizados.Tables.Table TbAccesosWhite4;
    private Controles_Personalizados.Botones.UWPButton btnAgregar;
    private Controles_Personalizados.Botones.UWPButton btnFiltrar;
    private javax.swing.JLabel lblAccesos;
    // End of variables declaration//GEN-END:variables
}
