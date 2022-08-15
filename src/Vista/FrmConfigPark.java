/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controles_Personalizados.Paneles.PanelRound;
import com.sun.awt.AWTUtilities;
import java.awt.Color;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import Controlador.ControllerParqueo;
import java.awt.EventQueue;
import java.awt.HeadlessException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import java.util.List;
import javax.swing.JComboBox;

/**
 *
 * @author ferna
 */
public class FrmConfigPark extends javax.swing.JFrame {

    DefaultComboBoxModel<String> cmb;
    List list;
    String[] ubic;
    public ControllerParqueo controllerpark = new ControllerParqueo();
    FrmSetPark park;
    ResultSet rs;

    /**
     * Creates new form FrmConfigPark
     */
    public FrmConfigPark() {
        initComponents();
        setLocationRelativeTo(null);
        Shape forma = new RoundRectangle2D.Double(0, 0, this.getBounds().width, this.getBounds().height, 40, 40);
        AWTUtilities.setWindowShape(this, forma);
        setIconImage(Logo());
        loadPark();
        loadLocationPark();
    }

    public Image Logo() {
        Image retvalue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos_Proyecto/LogoB&GDash.png"));
        return retvalue;
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
        jLabel3 = new javax.swing.JLabel();
        panelPark3 = new Controles_Personalizados.Paneles.PanelRound();
        btnPark3 = new javax.swing.JLabel();
        panelPark4 = new Controles_Personalizados.Paneles.PanelRound();
        btnPark4 = new javax.swing.JLabel();
        panelPark11 = new Controles_Personalizados.Paneles.PanelRound();
        btnPark11 = new javax.swing.JLabel();
        panelPark12 = new Controles_Personalizados.Paneles.PanelRound();
        btnPark12 = new javax.swing.JLabel();
        panelPark10 = new Controles_Personalizados.Paneles.PanelRound();
        btnPark10 = new javax.swing.JLabel();
        panelPark9 = new Controles_Personalizados.Paneles.PanelRound();
        btnPark9 = new javax.swing.JLabel();
        panelPark8 = new Controles_Personalizados.Paneles.PanelRound();
        btnPark8 = new javax.swing.JLabel();
        panelPark7 = new Controles_Personalizados.Paneles.PanelRound();
        btnPark7 = new javax.swing.JLabel();
        panelPark6 = new Controles_Personalizados.Paneles.PanelRound();
        btnPark6 = new javax.swing.JLabel();
        panelPark5 = new Controles_Personalizados.Paneles.PanelRound();
        btnPark5 = new javax.swing.JLabel();
        panelPark16 = new Controles_Personalizados.Paneles.PanelRound();
        btnPark16 = new javax.swing.JLabel();
        panelPark15 = new Controles_Personalizados.Paneles.PanelRound();
        btnPark15 = new javax.swing.JLabel();
        panelPark14 = new Controles_Personalizados.Paneles.PanelRound();
        btnPark14 = new javax.swing.JLabel();
        panelPark13 = new Controles_Personalizados.Paneles.PanelRound();
        btnPark13 = new javax.swing.JLabel();
        panelPark2 = new Controles_Personalizados.Paneles.PanelRound();
        btnPark2 = new javax.swing.JLabel();
        panelPark1 = new Controles_Personalizados.Paneles.PanelRound();
        btnPark1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();
        panelPark17 = new Controles_Personalizados.Paneles.PanelRound();
        btnPark17 = new javax.swing.JLabel();
        panelPark18 = new Controles_Personalizados.Paneles.PanelRound();
        btnPark18 = new javax.swing.JLabel();
        panelPark19 = new Controles_Personalizados.Paneles.PanelRound();
        btnPark19 = new javax.swing.JLabel();
        panelPark20 = new Controles_Personalizados.Paneles.PanelRound();
        btnPark20 = new javax.swing.JLabel();
        CmbParqueos = new Controles_Personalizados.ComboBox.combobox();
        txtUbicacion = new Controles_Personalizados.textfields.TextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(58, 50, 75));
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/Parking-amico.png"))); // NOI18N
        panelRound1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 200, -1, -1));

        panelPark3.setBackground(new java.awt.Color(254, 254, 254));
        panelPark3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPark3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/vehiculo-park.png"))); // NOI18N
        btnPark3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPark3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPark3MouseClicked(evt);
            }
        });
        panelPark3.add(btnPark3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        panelRound1.add(panelPark3, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 230, 60, 60));

        panelPark4.setBackground(new java.awt.Color(254, 254, 254));
        panelPark4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPark4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/vehiculo-park.png"))); // NOI18N
        btnPark4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPark4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPark4MouseClicked(evt);
            }
        });
        panelPark4.add(btnPark4, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        panelRound1.add(panelPark4, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 230, 60, 60));

        panelPark11.setBackground(new java.awt.Color(254, 254, 254));
        panelPark11.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPark11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/vehiculo-park.png"))); // NOI18N
        btnPark11.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPark11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPark11MouseClicked(evt);
            }
        });
        panelPark11.add(btnPark11, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        panelRound1.add(panelPark11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 60, 60));

        panelPark12.setBackground(new java.awt.Color(254, 254, 254));
        panelPark12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPark12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/vehiculo-park.png"))); // NOI18N
        btnPark12.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPark12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPark12MouseClicked(evt);
            }
        });
        panelPark12.add(btnPark12, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        panelRound1.add(panelPark12, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 390, 60, 60));

        panelPark10.setBackground(new java.awt.Color(254, 254, 254));
        panelPark10.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPark10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/vehiculo-park.png"))); // NOI18N
        btnPark10.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPark10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPark10MouseClicked(evt);
            }
        });
        panelPark10.add(btnPark10, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        panelRound1.add(panelPark10, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 310, 60, 60));

        panelPark9.setBackground(new java.awt.Color(254, 254, 254));
        panelPark9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPark9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/vehiculo-park.png"))); // NOI18N
        btnPark9.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPark9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPark9MouseClicked(evt);
            }
        });
        panelPark9.add(btnPark9, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        panelRound1.add(panelPark9, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, 60, 60));

        panelPark8.setBackground(new java.awt.Color(254, 254, 254));
        panelPark8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPark8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/vehiculo-park.png"))); // NOI18N
        btnPark8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPark8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPark8MouseClicked(evt);
            }
        });
        panelPark8.add(btnPark8, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        panelRound1.add(panelPark8, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 310, 60, 60));

        panelPark7.setBackground(new java.awt.Color(254, 254, 254));
        panelPark7.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPark7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/vehiculo-park.png"))); // NOI18N
        btnPark7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPark7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPark7MouseClicked(evt);
            }
        });
        panelPark7.add(btnPark7, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        panelRound1.add(panelPark7, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 60, 60));

        panelPark6.setBackground(new java.awt.Color(254, 254, 254));
        panelPark6.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPark6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/vehiculo-park.png"))); // NOI18N
        btnPark6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPark6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPark6MouseClicked(evt);
            }
        });
        panelPark6.add(btnPark6, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        panelRound1.add(panelPark6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 60, 60));

        panelPark5.setBackground(new java.awt.Color(254, 254, 254));
        panelPark5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPark5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/vehiculo-park.png"))); // NOI18N
        btnPark5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPark5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPark5MouseClicked(evt);
            }
        });
        panelPark5.add(btnPark5, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        panelRound1.add(panelPark5, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 230, 60, 60));

        panelPark16.setBackground(new java.awt.Color(254, 254, 254));
        panelPark16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPark16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/vehiculo-park.png"))); // NOI18N
        btnPark16.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPark16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPark16MouseClicked(evt);
            }
        });
        panelPark16.add(btnPark16, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        panelRound1.add(panelPark16, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 470, 60, 60));

        panelPark15.setBackground(new java.awt.Color(254, 254, 254));
        panelPark15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPark15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/vehiculo-park.png"))); // NOI18N
        btnPark15.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPark15.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPark15MouseClicked(evt);
            }
        });
        panelPark15.add(btnPark15, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        panelRound1.add(panelPark15, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 390, 60, 60));

        panelPark14.setBackground(new java.awt.Color(254, 254, 254));
        panelPark14.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPark14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/vehiculo-park.png"))); // NOI18N
        btnPark14.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPark14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPark14MouseClicked(evt);
            }
        });
        panelPark14.add(btnPark14, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        panelRound1.add(panelPark14, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 390, 60, 60));

        panelPark13.setBackground(new java.awt.Color(254, 254, 254));
        panelPark13.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPark13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/vehiculo-park.png"))); // NOI18N
        btnPark13.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPark13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPark13MouseClicked(evt);
            }
        });
        panelPark13.add(btnPark13, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        panelRound1.add(panelPark13, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 60, 60));

        panelPark2.setBackground(new java.awt.Color(254, 254, 254));
        panelPark2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPark2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/vehiculo-park.png"))); // NOI18N
        btnPark2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPark2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPark2MouseClicked(evt);
            }
        });
        panelPark2.add(btnPark2, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        panelRound1.add(panelPark2, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 230, 60, 60));

        panelPark1.setBackground(new java.awt.Color(254, 254, 254));
        panelPark1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPark1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/vehiculo-park.png"))); // NOI18N
        btnPark1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPark1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPark1MouseClicked(evt);
            }
        });
        panelPark1.add(btnPark1, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        panelRound1.add(panelPark1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 60, 60));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/TextoEstacionamiento.png"))); // NOI18N
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, -1, -1));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/Maximizar.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        panelRound1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 11, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/CerrarLogin.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarMousePressed(evt);
            }
        });
        panelRound1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, -1, -1));

        panelPark17.setBackground(new java.awt.Color(254, 254, 254));
        panelPark17.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPark17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/vehiculo-park.png"))); // NOI18N
        btnPark17.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPark17.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPark17MouseClicked(evt);
            }
        });
        panelPark17.add(btnPark17, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        panelRound1.add(panelPark17, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 470, 60, 60));

        panelPark18.setBackground(new java.awt.Color(254, 254, 254));
        panelPark18.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPark18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/vehiculo-park.png"))); // NOI18N
        btnPark18.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPark18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPark18MouseClicked(evt);
            }
        });
        panelPark18.add(btnPark18, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        panelRound1.add(panelPark18, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 470, 60, 60));

        panelPark19.setBackground(new java.awt.Color(254, 254, 254));
        panelPark19.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPark19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/vehiculo-park.png"))); // NOI18N
        btnPark19.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPark19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPark19MouseClicked(evt);
            }
        });
        panelPark19.add(btnPark19, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        panelRound1.add(panelPark19, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 470, 60, 60));

        panelPark20.setBackground(new java.awt.Color(254, 254, 254));
        panelPark20.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnPark20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/vehiculo-park.png"))); // NOI18N
        btnPark20.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPark20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPark20MouseClicked(evt);
            }
        });
        panelPark20.add(btnPark20, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 10, -1, -1));

        panelRound1.add(panelPark20, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 470, 60, 60));

        CmbParqueos.setBackground(new java.awt.Color(58, 50, 75));
        CmbParqueos.setForeground(new java.awt.Color(253, 255, 254));
        CmbParqueos.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        CmbParqueos.setLabeText("Parqueos");
        CmbParqueos.setLineColor(new java.awt.Color(253, 255, 254));
        CmbParqueos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                CmbParqueosItemStateOnChanged(evt);
            }
        });
        panelRound1.add(CmbParqueos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 220, 80));

        txtUbicacion.setEditable(false);
        txtUbicacion.setBackground(new java.awt.Color(58, 50, 75));
        txtUbicacion.setForeground(new java.awt.Color(253, 255, 254));
        txtUbicacion.setCaretColor(new java.awt.Color(253, 255, 254));
        txtUbicacion.setDisabledTextColor(new java.awt.Color(253, 255, 254));
        txtUbicacion.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtUbicacion.setLabelText("Ubicación");
        txtUbicacion.setLineColor(new java.awt.Color(253, 255, 254));
        txtUbicacion.setSelectedTextColor(new java.awt.Color(58, 50, 75));
        txtUbicacion.setSelectionColor(new java.awt.Color(253, 255, 254));
        panelRound1.add(txtUbicacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 80, 280, 70));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1108, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // <editor-fold defaultstate="collapsed" desc="OPEN ADD FORM">      
//PARA GUARDAR LOS ESTACIONAMIENTOS OCUPADOS, SE HARÁ POR MEDIO DE UNA CONSULTA    
    private void btnPark1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPark1MouseClicked
        modifPanelPark(panelPark1, "PARQUEO 1", 1);
    }//GEN-LAST:event_btnPark1MouseClicked

    private void btnPark2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPark2MouseClicked
        modifPanelPark(panelPark2, "PARQUEO 2", 2);
    }//GEN-LAST:event_btnPark2MouseClicked

    private void btnPark3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPark3MouseClicked
        modifPanelPark(panelPark3, "PARQUEO 3", 3);
    }//GEN-LAST:event_btnPark3MouseClicked

    private void btnPark4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPark4MouseClicked
        modifPanelPark(panelPark4, "PARQUEO 4", 4);
    }//GEN-LAST:event_btnPark4MouseClicked

    private void btnPark11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPark11MouseClicked
        modifPanelPark(panelPark11, "PARQUEO 11", 11);
    }//GEN-LAST:event_btnPark11MouseClicked

    private void btnPark12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPark12MouseClicked
        modifPanelPark(panelPark12, "PARQUEO 12", 12);
    }//GEN-LAST:event_btnPark12MouseClicked

    private void btnPark10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPark10MouseClicked
        modifPanelPark(panelPark13, "PARQUEO 10", 10);
    }//GEN-LAST:event_btnPark10MouseClicked

    private void btnPark9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPark9MouseClicked
        modifPanelPark(panelPark10, "PARQUEO 9", 9);
    }//GEN-LAST:event_btnPark9MouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        //AQUÍ LOS VERIFICA Y LOS ESTACIONAMIENTOS ÚTILIZADOS Y POR MEDIO DEL SIGUIENTE MÉTODO "checkState"

    }//GEN-LAST:event_formWindowActivated

    private void btnPark8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPark8MouseClicked
        modifPanelPark(panelPark8, "PARQUEO 8", 8);
    }//GEN-LAST:event_btnPark8MouseClicked

    private void btnPark7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPark7MouseClicked
        modifPanelPark(panelPark7, "PARQUEO 7", 7);
    }//GEN-LAST:event_btnPark7MouseClicked

    private void btnPark6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPark6MouseClicked
        modifPanelPark(panelPark6, "PARQUEO 6", 6);
    }//GEN-LAST:event_btnPark6MouseClicked

    private void btnPark5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPark5MouseClicked
        modifPanelPark(panelPark5, "PARQUEO 5", 5);
    }//GEN-LAST:event_btnPark5MouseClicked

    private void btnPark15MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPark15MouseClicked
        modifPanelPark(panelPark15, "PARQUEO 15", 15);
    }//GEN-LAST:event_btnPark15MouseClicked

    private void btnPark14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPark14MouseClicked
        modifPanelPark(panelPark14, "PARQUEO 14", 14);
    }//GEN-LAST:event_btnPark14MouseClicked

    private void btnPark13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPark13MouseClicked
        modifPanelPark(panelPark13, "PARQUEO 13", 13);
    }//GEN-LAST:event_btnPark13MouseClicked

    private void btnCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMousePressed
        this.dispose();
        PanelOpcionesPersonal.showinter = 0;
        try {
            park.dispose();
        } catch (Exception e) {

        }
    }//GEN-LAST:event_btnCerrarMousePressed

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void btnPark16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPark16MouseClicked
        modifPanelPark(panelPark16, "PARQUEO 16", 16);
    }//GEN-LAST:event_btnPark16MouseClicked

    private void btnPark17MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPark17MouseClicked
        modifPanelPark(panelPark17, "PARQUEO 17", 17);
    }//GEN-LAST:event_btnPark17MouseClicked

    private void btnPark18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPark18MouseClicked
        modifPanelPark(panelPark18, "PARQUEO 18", 18);

    }//GEN-LAST:event_btnPark18MouseClicked

    private void btnPark19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPark19MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPark19MouseClicked

    private void btnPark20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPark20MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnPark20MouseClicked
// </editor-fold>  
    
    void modifPanelPark(PanelRound pnl, String parkname, int N) {
        try {

            park = new FrmSetPark(String.valueOf(N));
            FrmSetPark park2 = new FrmSetPark();
            if (park2.viewIDPark(N) == true) {
                ControllerParqueo.setIDParqueo(N);
                //pnl.setBackground(Color.GRAY);
                if (park.isVisible()) {
                    park.toFront();
                    park.setVisible(false);
                    JOptionPane.showMessageDialog(null, "Se cerro el formulario anterior,\ndebido a que no puede tenerlos \nal mismo tiempo abiertos", "Formulario cerrado", JOptionPane.WARNING_MESSAGE);
                } else {
                    park.setVisible(true);
                    FrmSetPark.setParkname(parkname);

                }
            }
        } catch (HeadlessException e) {
            System.out.println("Exeception: " + e.toString());
        }

    }

    void checkState(PanelRound pnl, int N) {
        ControllerParqueo.setNumberPark(N);
        /*if () {
            
        }*/
        pnl.setBackground(Color.GRAY);
    }

    void loadPark() {
        try {
            rs = controllerpark.loadPark();
            list = new ArrayList();
            cmb = new DefaultComboBoxModel<>();
            while (rs.next()) {
                list.add(rs.getInt("idParqueo"));
                cmb.addElement(rs.getString("numero_parqueo"));
                CmbParqueos.setModel(cmb);
            }
        } catch (SQLException e) {
            System.out.println("Error: " + e.toString());
        }
    }
    
    private void CmbParqueosItemStateOnChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_CmbParqueosItemStateOnChanged
        rs = controllerpark.getLocationPark((String) CmbParqueos.getSelectedItem());
        try {
            if (rs.next()) {
                do {                    
                    if (rs.getString("Ubicacion") != null) {
                        txtUbicacion.setText(rs.getString("Ubicacion"));
                    } else {
                        txtUbicacion.setText("");
                    }
 
                } while (rs.next());
            }
        } catch (SQLException e) {
            System.out.println("Error:" + e.toString());
        }
    }//GEN-LAST:event_CmbParqueosItemStateOnChanged
    
    void loadLocationPark() {
        rs = controllerpark.getLocationPark((String) CmbParqueos.getSelectedItem());
        try {
            if (rs.next()) {
                do {
                    txtUbicacion.setText(rs.getString("Ubicacion"));
                } while (rs.next());
            }
        } catch (SQLException e) {
            System.out.println("Error:"+e.toString());
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
            java.util.logging.Logger.getLogger(FrmConfigPark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmConfigPark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmConfigPark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmConfigPark.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmConfigPark().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Controles_Personalizados.ComboBox.combobox CmbParqueos;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnMinimizar;
    private javax.swing.JLabel btnPark1;
    private javax.swing.JLabel btnPark10;
    private javax.swing.JLabel btnPark11;
    private javax.swing.JLabel btnPark12;
    private javax.swing.JLabel btnPark13;
    private javax.swing.JLabel btnPark14;
    private javax.swing.JLabel btnPark15;
    private javax.swing.JLabel btnPark16;
    private javax.swing.JLabel btnPark17;
    private javax.swing.JLabel btnPark18;
    private javax.swing.JLabel btnPark19;
    private javax.swing.JLabel btnPark2;
    private javax.swing.JLabel btnPark20;
    private javax.swing.JLabel btnPark3;
    private javax.swing.JLabel btnPark4;
    private javax.swing.JLabel btnPark5;
    private javax.swing.JLabel btnPark6;
    private javax.swing.JLabel btnPark7;
    private javax.swing.JLabel btnPark8;
    private javax.swing.JLabel btnPark9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private Controles_Personalizados.Paneles.PanelRound panelPark1;
    private Controles_Personalizados.Paneles.PanelRound panelPark10;
    private Controles_Personalizados.Paneles.PanelRound panelPark11;
    private Controles_Personalizados.Paneles.PanelRound panelPark12;
    private Controles_Personalizados.Paneles.PanelRound panelPark13;
    private Controles_Personalizados.Paneles.PanelRound panelPark14;
    private Controles_Personalizados.Paneles.PanelRound panelPark15;
    private Controles_Personalizados.Paneles.PanelRound panelPark16;
    private Controles_Personalizados.Paneles.PanelRound panelPark17;
    private Controles_Personalizados.Paneles.PanelRound panelPark18;
    private Controles_Personalizados.Paneles.PanelRound panelPark19;
    private Controles_Personalizados.Paneles.PanelRound panelPark2;
    private Controles_Personalizados.Paneles.PanelRound panelPark20;
    private Controles_Personalizados.Paneles.PanelRound panelPark3;
    private Controles_Personalizados.Paneles.PanelRound panelPark4;
    private Controles_Personalizados.Paneles.PanelRound panelPark5;
    private Controles_Personalizados.Paneles.PanelRound panelPark6;
    private Controles_Personalizados.Paneles.PanelRound panelPark7;
    private Controles_Personalizados.Paneles.PanelRound panelPark8;
    private Controles_Personalizados.Paneles.PanelRound panelPark9;
    private Controles_Personalizados.Paneles.PanelRound panelRound1;
    private Controles_Personalizados.textfields.TextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
