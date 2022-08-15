/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import java.sql.SQLException;
import java.sql.ResultSet;
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import Controles_Personalizados.Botones.UWPButton;
import javax.swing.ImageIcon;
import Controlador.ControllerAccesos;
import Controles_Personalizados.Tables.Table;
import java.text.SimpleDateFormat;
import java.util.Date;


/**
 *
 * @author ferna
 */
public class FrmAgg_Acceso extends javax.swing.JFrame {

    ButtonGroup grpAccess = new ButtonGroup();
    public Font font = new Font("Roboto Black", Font.PLAIN, 18);
    DefaultTableModel tbmodel;
    UWPButton btnagregar = new UWPButton();    
    private ImageIcon iconAdd = new ImageIcon(getClass().getResource("/Recursos_Proyecto/Agregar.png"));
    
    /**
     * Creates new form FrmAgg_Acceso
     */
    public FrmAgg_Acceso() {
        initComponents();
        setLocationRelativeTo(null);
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 40, 40);
        AWTUtilities.setWindowShape(this, forma);
        setIconImage(Logo());
        load();
        loadTable();
        chkCancelar.setFont(font);
        chkCancelar.setForeground(Color.GRAY);
        chkCancelar.setEnabled(false);
    }

    public Image Logo() {
        Image retvalue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos_Proyecto/B&G Morado 2.png"));
        return retvalue;
    }

    private void load() {
        grpAccess.add(rbtnEntrada);
        grpAccess.add(rbtnSalida);
        rbtnEntrada.setFont(font);
        rbtnEntrada.setForeground(Color.WHITE);
        rbtnSalida.setFont(font);
        rbtnSalida.setForeground(Color.WHITE);
        jLabel1.setFont(font);
        jLabel1.setForeground(Color.white);

        String[ ] headers = {"ID Personal", "Nombres", "Apellidos", "Correo", "Carnet", "ID Tipo de personal","Tipo de personal", "Seleccionar"};
        tbmodel = new DefaultTableModel(null, headers);
        tbPersonal.setModel(tbmodel);
        tbPersonal.removeColumn(tbPersonal.getColumnModel().getColumn(0));
        tbPersonal.removeColumn(tbPersonal.getColumnModel().getColumn(4));
        tbPersonal.setDefaultRenderer(Object.class, new Controles_Personalizados.RenderTable());
        
        btnagregar.setName("btnAgregar");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelRound1 = new Controles_Personalizados.Paneles.PanelRound();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        lblVehiculos = new javax.swing.JLabel();
        PanelTabla = new javax.swing.JScrollPane();
        tbPersonal = new Controles_Personalizados.Tables.Table();
        ScrollTabla = new Controles_Personalizados.ScrollBar.ScrollBarCustom();
        btnListo = new Controles_Personalizados.Botones.ButtonGradient();
        rbtnEntrada = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        rbtnSalida = new javax.swing.JRadioButton();
        chkCancelar = new javax.swing.JCheckBox();
        txtJustificacion = new Controles_Personalizados.textfields.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1205, 684));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(58, 50, 75));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/Maximizar.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        panelRound1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 10, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/CerrarLogin.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarMousePressed(evt);
            }
        });
        panelRound1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1170, 10, -1, -1));

        lblVehiculos.setFont(new java.awt.Font("Roboto Medium", 0, 30)); // NOI18N
        lblVehiculos.setForeground(new java.awt.Color(253, 255, 254));
        lblVehiculos.setText("PERSONAL");
        panelRound1.add(lblVehiculos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 10, -1, -1));

        PanelTabla.setHorizontalScrollBar(null);
        PanelTabla.setVerticalScrollBar(ScrollTabla);
        PanelTabla.setWheelScrollingEnabled(false);

        tbPersonal = new Controles_Personalizados.Tables.Table(){

            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tbPersonal.setBackground(new java.awt.Color(231, 234, 239));
        tbPersonal.setModel(new javax.swing.table.DefaultTableModel(
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
                "CARNET", "NOMBRES", "APELLIDOS", "CORREO", "TIPO USUARIO", "ACCIONES"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbPersonal.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N
        tbPersonal.setGridColor(new java.awt.Color(58, 50, 75));
        tbPersonal.setName(""); // NOI18N
        tbPersonal.setSelectionBackground(new java.awt.Color(58, 50, 75));
        tbPersonal.setShowVerticalLines(false);
        tbPersonal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbPersonalMouseClicked(evt);
            }
        });
        PanelTabla.setViewportView(tbPersonal);

        panelRound1.add(PanelTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, 1130, 440));

        ScrollTabla.setBackground(new java.awt.Color(58, 50, 75));
        ScrollTabla.setForeground(new java.awt.Color(58, 50, 75));
        panelRound1.add(ScrollTabla, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 160, 10, 40));

        btnListo.setBackground(new java.awt.Color(42, 36, 56));
        btnListo.setForeground(new java.awt.Color(58, 50, 75));
        btnListo.setText("Listo");
        btnListo.setColor1(new java.awt.Color(253, 255, 254));
        btnListo.setColor2(new java.awt.Color(253, 255, 254));
        btnListo.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnListo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListoActionPerformed(evt);
            }
        });
        panelRound1.add(btnListo, new org.netbeans.lib.awtextra.AbsoluteConstraints(1020, 580, 150, 40));

        rbtnEntrada.setBackground(new java.awt.Color(58, 50, 75));
        rbtnEntrada.setText("Entrada");
        rbtnEntrada.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRound1.add(rbtnEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 570, 100, 30));

        jLabel1.setBackground(new java.awt.Color(58, 50, 75));
        jLabel1.setText("Tipo de acceso");
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        rbtnSalida.setBackground(new java.awt.Color(58, 50, 75));
        rbtnSalida.setText("Salida");
        rbtnSalida.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        panelRound1.add(rbtnSalida, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, 100, 30));

        chkCancelar.setBackground(new java.awt.Color(58, 50, 75));
        chkCancelar.setLabel("Cancelar");
        chkCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chkCancelarActionPerformed(evt);
            }
        });
        panelRound1.add(chkCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 50, -1, -1));

        txtJustificacion.setBackground(new java.awt.Color(58, 50, 75));
        txtJustificacion.setForeground(new java.awt.Color(253, 255, 254));
        txtJustificacion.setCaretColor(new java.awt.Color(253, 255, 254));
        txtJustificacion.setDisabledTextColor(new java.awt.Color(253, 255, 254));
        txtJustificacion.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtJustificacion.setLabelText("Justificación");
        txtJustificacion.setLineColor(new java.awt.Color(253, 255, 254));
        txtJustificacion.setSelectedTextColor(new java.awt.Color(58, 50, 75));
        txtJustificacion.setSelectionColor(new java.awt.Color(253, 255, 254));
        panelRound1.add(txtJustificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 570, 620, 70));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1210, 690));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //EN LA TABLA, EN LA COL DE ACCIONES PONER LOS CHECBOX PARA SELECCIONAR SI ENTRADA O SALIDA 
    private void btnCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMousePressed
        this.dispose();

    }//GEN-LAST:event_btnCerrarMousePressed

    void insert(){
        Date today = new Date();
        today.getTime();
        
        SimpleDateFormat formatDate = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat formatHour = new SimpleDateFormat("hh:mm:ss");
        String date = formatDate.format(today);
        String hour = formatHour.format(today);
        
        ControllerAccesos.setDate(date);
        ControllerAccesos.setHour(hour);
        ControllerAccesos.setJustification(txtJustificacion.getText());
    }
    
    private void btnListoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListoActionPerformed
        // TODO add your handling code here:
        if (ControllerAccesos.getID() != 0 && (rbtnEntrada.isSelected() || rbtnSalida.isSelected())) {
            if (rbtnEntrada.isSelected()) {
                ControllerAccesos.setTypeAccess(1);//intro
                insert();
                if (ControllerAccesos.insertAccess() == true) {
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "No se ha podido ingresar el dato", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }else{
                ControllerAccesos.setTypeAccess(2);//out
                insert();
                if (ControllerAccesos.insertAccess() == true) {
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "No se ha podido ingresar el dato", "Error", JOptionPane.WARNING_MESSAGE);
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Existen campos vacios, porfavor llenarlos", "Campos vacios", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnListoActionPerformed

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void tbPersonalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbPersonalMouseClicked
        
        Table tb = (Table)evt.getSource();
        int id = Integer.valueOf(tb.getModel().getValueAt(tb.getSelectedRow(), 0).toString());
        
        int col = tbPersonal.getColumnModel().getColumnIndexAtX(evt.getX());
        int row = evt.getY()/ tbPersonal.getRowHeight();
        try {
            if (row < tbPersonal.getRowCount() && row >= 0 && col < tbPersonal.getColumnCount() && col >= 0) {
                Object obj = tbPersonal.getValueAt(row, col);
                if (obj instanceof  UWPButton) {
                    ((UWPButton) obj).doClick();
                    chkCancelar.setEnabled(Boolean.TRUE);
                    chkCancelar.setForeground(Color.WHITE);
                    chkCancelar.setEnabled(true);
                    
                    UWPButton btn = (UWPButton) obj;
                    if (btn.getName().equals("btnAgregar")) {
                        ControllerAccesos.setID(id);
                        tbPersonal.setVisible(false);
                        chkCancelar.setSelected(false);                        
                    }
                }
            }
        } catch (Exception e) {
            System.out.println("Error do click in table: "+e.toString());
        }
    }//GEN-LAST:event_tbPersonalMouseClicked

    private void chkCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chkCancelarActionPerformed
        if (chkCancelar.isSelected()) {
            tbPersonal.setVisible(true);
        }
    }//GEN-LAST:event_chkCancelarActionPerformed

    private void loadTable() {
        btnagregar.setName("btnAgregar");
        btnagregar.setBackground(new Color(231,234,239));
        btnagregar.setIcon(iconAdd);
        
        ResultSet rs;
        if (tbmodel.getRowCount() > 0) {
            tbmodel.removeRow(0);
        } else {
            try {
                rs = Controlador.ControllerAccesos.getdata("vwPersonales");

                while (rs.next()) {
                    Object[] data = {rs.getInt("idPersonal"), rs.getString("nombre_p"), rs.getString("apellido_p"), rs.getString("correo"), rs.getString("Carnet"), rs.getInt("idTipoPersonal"), rs.getString("tipo_personal"), btnagregar};
                    tbmodel.addRow(data);
                }

            } catch (SQLException e) {
                System.out.println("Error: " + e.toString());
            }
        }

    }

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
            java.util.logging.Logger.getLogger(FrmAgg_Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgg_Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgg_Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgg_Acceso.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgg_Acceso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane PanelTabla;
    private Controles_Personalizados.ScrollBar.ScrollBarCustom ScrollTabla;
    private javax.swing.JLabel btnCerrar;
    private Controles_Personalizados.Botones.ButtonGradient btnListo;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JCheckBox chkCancelar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblVehiculos;
    private Controles_Personalizados.Paneles.PanelRound panelRound1;
    private javax.swing.JRadioButton rbtnEntrada;
    private javax.swing.JRadioButton rbtnSalida;
    private Controles_Personalizados.Tables.Table tbPersonal;
    private Controles_Personalizados.textfields.TextField txtJustificacion;
    // End of variables declaration//GEN-END:variables

}
