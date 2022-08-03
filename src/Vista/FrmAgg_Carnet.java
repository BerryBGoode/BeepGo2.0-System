/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import com.sun.awt.AWTUtilities;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;

/**
 *
 * @author ferna
 */
public class FrmAgg_Carnet extends javax.swing.JFrame {

    /**
     * Creates new form FrmAgg_Carnet
     */
    public FrmAgg_Carnet() {
        initComponents();
        Shape forma= new RoundRectangle2D.Double(0,0, this.getBounds() .width, this.getBounds() .height,40,40);
        AWTUtilities. setWindowShape(this, forma);
        setIconImage(Logo());
    }
public Image Logo(){
    Image retvalue=Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos_Proyecto/B&G Morado 2.png"));
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
        btngeneretCod = new Controles_Personalizados.Botones.ButtonGradient();
        ContenedorCodigoQR = new Controles_Personalizados.Paneles.PanelRound();
        PanelCodigoQR = new Controles_Personalizados.Paneles.PanelRound();
        btnContinuar = new Controles_Personalizados.Botones.ButtonGradient();
        jLabel1 = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1099, 578));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panelRound1.setBackground(new java.awt.Color(58, 50, 75));
        panelRound1.setFocusable(false);
        panelRound1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btngeneretCod.setBackground(new java.awt.Color(42, 36, 56));
        btngeneretCod.setForeground(new java.awt.Color(58, 50, 75));
        btngeneretCod.setText("Generar código de barra");
        btngeneretCod.setColor1(new java.awt.Color(253, 255, 254));
        btngeneretCod.setColor2(new java.awt.Color(253, 255, 254));
        btngeneretCod.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        panelRound1.add(btngeneretCod, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 310, -1));

        ContenedorCodigoQR.setBackground(new java.awt.Color(253, 255, 254));
        ContenedorCodigoQR.setPreferredSize(new java.awt.Dimension(259, 252));
        ContenedorCodigoQR.setRoundBottomLeft(40);
        ContenedorCodigoQR.setRoundBottomRight(40);
        ContenedorCodigoQR.setRoundTopLeft(40);
        ContenedorCodigoQR.setRoundTopRight(40);
        ContenedorCodigoQR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCodigoQR.setBackground(new java.awt.Color(42, 36, 56));
        PanelCodigoQR.setRoundBottomLeft(40);
        PanelCodigoQR.setRoundBottomRight(40);
        PanelCodigoQR.setRoundTopLeft(40);
        PanelCodigoQR.setRoundTopRight(40);
        PanelCodigoQR.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        ContenedorCodigoQR.add(PanelCodigoQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 390, 80));

        panelRound1.add(ContenedorCodigoQR, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 380, 430, 120));

        btnContinuar.setBackground(new java.awt.Color(42, 36, 56));
        btnContinuar.setForeground(new java.awt.Color(58, 50, 75));
        btnContinuar.setText("Continuar");
        btnContinuar.setColor1(new java.awt.Color(253, 255, 254));
        btnContinuar.setColor2(new java.awt.Color(253, 255, 254));
        btnContinuar.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });
        panelRound1.add(btnContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 510, 150, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/carnet-add.png"))); // NOI18N
        panelRound1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 40, -1, -1));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/Maximizar.png"))); // NOI18N
        btnMinimizar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        panelRound1.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1050, 10, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/CerrarLogin.png"))); // NOI18N
        btnCerrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarMousePressed(evt);
            }
        });
        panelRound1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 10, -1, -1));

        getContentPane().add(panelRound1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1100, 580));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed
        // TODO add your handling code here:
        this.dispose();
        PanelOpcionesPersonal.showinter =0;
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMousePressed
        PanelOpcionesPersonal.showinter = 0;
        this.dispose();        
    }//GEN-LAST:event_btnCerrarMousePressed

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

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
            java.util.logging.Logger.getLogger(FrmAgg_Carnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAgg_Carnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAgg_Carnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAgg_Carnet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAgg_Carnet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Controles_Personalizados.Paneles.PanelRound ContenedorCodigoQR;
    private Controles_Personalizados.Paneles.PanelRound PanelCodigoQR;
    private javax.swing.JLabel btnCerrar;
    private Controles_Personalizados.Botones.ButtonGradient btnContinuar;
    private javax.swing.JLabel btnMinimizar;
    private Controles_Personalizados.Botones.ButtonGradient btngeneretCod;
    private javax.swing.JLabel jLabel1;
    private Controles_Personalizados.Paneles.PanelRound panelRound1;
    // End of variables declaration//GEN-END:variables
}
