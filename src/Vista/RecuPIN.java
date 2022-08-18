/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.ControllerRecuperacionContra;
import com.sun.awt.AWTUtilities;
import java.awt.Image;
import java.awt.Shape;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.geom.RoundRectangle2D;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author danlo
 */
public class RecuPIN extends javax.swing.JFrame {

    /**
     * Creates new form RecuperacionPIN
     */
    public RecuPIN() {
        initComponents();
         this.setLocationRelativeTo(null); 
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

        PanelImagen = new Controles_Personalizados.Paneles.PanelRound();
        PanelCampos = new Controles_Personalizados.Paneles.PanelRound();
        textoRest = new javax.swing.JLabel();
        btnGoBack = new javax.swing.JLabel();
        txtUsuario = new Controles_Personalizados.textfields.TextField();
        btnRestablecer = new Controles_Personalizados.Botones.ButtonGradient();
        txtPIN = new Controles_Personalizados.textfields.PasswordField();
        ImagenRecuPIN = new javax.swing.JLabel();
        btnMinimizar = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelImagen.setBackground(new java.awt.Color(42, 36, 56));
        PanelImagen.setPreferredSize(new java.awt.Dimension(1366, 768));
        PanelImagen.setRoundBottomLeft(40);
        PanelImagen.setRoundBottomRight(40);
        PanelImagen.setRoundTopLeft(40);
        PanelImagen.setRoundTopRight(40);
        PanelImagen.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        PanelCampos.setBackground(new java.awt.Color(254, 254, 254));
        PanelCampos.setPreferredSize(new java.awt.Dimension(698, 768));
        PanelCampos.setRoundBottomLeft(35);
        PanelCampos.setRoundTopLeft(35);
        PanelCampos.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        textoRest.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/TextoRecuPIN.png"))); // NOI18N
        PanelCampos.add(textoRest, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 120, -1, -1));

        btnGoBack.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/bxs-left-arrow-circle 1.png"))); // NOI18N
        btnGoBack.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGoBackMouseClicked(evt);
            }
        });
        PanelCampos.add(btnGoBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        txtUsuario.setBackground(new java.awt.Color(254, 254, 254));
        txtUsuario.setForeground(new java.awt.Color(42, 36, 56));
        txtUsuario.setCaretColor(new java.awt.Color(42, 36, 56));
        txtUsuario.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtUsuario.setLabelText("Nombre - Usuario");
        txtUsuario.setLineColor(new java.awt.Color(42, 36, 56));
        txtUsuario.setSelectionColor(new java.awt.Color(58, 50, 75));
        txtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtUsuarioKeyTyped(evt);
            }
        });
        PanelCampos.add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 350, 310, 70));

        btnRestablecer.setText("Restablecer");
        btnRestablecer.setToolTipText("");
        btnRestablecer.setColor1(new java.awt.Color(42, 36, 56));
        btnRestablecer.setColor2(new java.awt.Color(42, 36, 56));
        btnRestablecer.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
        btnRestablecer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestablecerActionPerformed(evt);
            }
        });
        PanelCampos.add(btnRestablecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 560, 300, -1));

        txtPIN.setBackground(new java.awt.Color(254, 254, 254));
        txtPIN.setForeground(new java.awt.Color(42, 36, 56));
        txtPIN.setCaretColor(new java.awt.Color(42, 36, 56));
        txtPIN.setFont(new java.awt.Font("Roboto Light", 0, 18)); // NOI18N
        txtPIN.setLabelText("PIN ");
        txtPIN.setLineColor(new java.awt.Color(42, 36, 56));
        txtPIN.setPreferredSize(new java.awt.Dimension(6, 54));
        txtPIN.setSelectionColor(new java.awt.Color(58, 50, 75));
        txtPIN.setShowAndHide(true);
        txtPIN.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtPINKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPINKeyTyped(evt);
            }
        });
        PanelCampos.add(txtPIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 450, 310, 70));

        PanelImagen.add(PanelCampos, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        ImagenRecuPIN.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/PINimg.png"))); // NOI18N
        PanelImagen.add(ImagenRecuPIN, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 140, -1, -1));

        btnMinimizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/Maximizar.png"))); // NOI18N
        btnMinimizar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMinimizarMouseClicked(evt);
            }
        });
        PanelImagen.add(btnMinimizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1310, 20, -1, -1));

        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos_Proyecto/CerrarLogin.png"))); // NOI18N
        btnCerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnCerrarMousePressed(evt);
            }
        });
        PanelImagen.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(1330, 20, -1, -1));

        getContentPane().add(PanelImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGoBackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGoBackMouseClicked
        // TODO add your handling code here:
        MenuRecu men = new MenuRecu();
        men.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnGoBackMouseClicked

    private void btnRestablecerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestablecerActionPerformed
        // TODO add your handling code here:
        RecuperarContra();
    }//GEN-LAST:event_btnRestablecerActionPerformed

    private void btnCerrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCerrarMousePressed
        System.exit(0);
    }//GEN-LAST:event_btnCerrarMousePressed

    private void btnMinimizarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMinimizarMouseClicked
        // TODO add your handling code here:
        this.setExtendedState(JFrame.ICONIFIED);
    }//GEN-LAST:event_btnMinimizarMouseClicked

    private void txtUsuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyTyped
        // TODO add your handling code here:
        char car = evt.getKeyChar();
        if(txtUsuario.getText().length() >= 15)
        {
            evt.consume();
        }else{
            if(txtUsuario.getText().equals("") && car == 95){
                evt.consume();
            }else if(txtUsuario.getText().contains("_") && car == 95){
                evt.consume();
            }else{
                ValidacionesSistema.ValidacionesBeep_Go.SinEspacios(evt);
                ValidacionesSistema.ValidacionesBeep_Go.SoloLetrasNumerosGuionBajo(evt);
            }
        }
    }//GEN-LAST:event_txtUsuarioKeyTyped

    private void txtPINKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPINKeyPressed
        // TODO add your handling code here:
        if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            RecuperarContra();
        }
    }//GEN-LAST:event_txtPINKeyPressed

    private void txtPINKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPINKeyTyped
        // TODO add your handling code here:
        if(txtPIN.getText().length() >= 4){
            evt.consume();
        }else{
            ValidacionesSistema.ValidacionesBeep_Go.SinEspacios(evt);
            ValidacionesSistema.ValidacionesBeep_Go.SoloNumeros(evt);
        }
    }//GEN-LAST:event_txtPINKeyTyped

    private void txtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtUsuarioKeyPressed
        // TODO add your handling code here:
         if (evt.getKeyCode()==KeyEvent.VK_ENTER){
            RecuperarContra();
        }
    }//GEN-LAST:event_txtUsuarioKeyPressed

    void RecuperarContra(){
        if (txtUsuario.getText().equals("") || txtPIN.getText().equals("")) {
            JOptionPane.showMessageDialog(null, "Existen campos vacios", "Error de proceso", JOptionPane.WARNING_MESSAGE);
        } else {
            ControllerRecuperacionContra obj = new ControllerRecuperacionContra();
            obj.setUsuario(txtUsuario.getText());
            String PIN = ValidacionesSistema.ValidacionesBeep_Go.EncriptarContra(String.valueOf(txtPIN.getText()));
            obj.setPIN(PIN); 
            
            int respuesta = obj.RecuperarContraPINController();

            if (respuesta == 1) {
                obj.setContra(ValidacionesSistema.ValidacionesBeep_Go.EncriptarContra(txtUsuario.getText() + "123"));
                boolean respuesta2 = obj.RecuperarContraController();
                if(respuesta2 == true){
                    ValidacionesSistema.ValidacionesBeep_Go.Notificacion("Proceso completado", "La contraseña ha sido actualizada", 1);
                    FrmLogin log = new FrmLogin();
                    log.setVisible(true);
                    this.dispose();
                }else{
                    JOptionPane.showMessageDialog(null, "La contraseña no pudo ser actualizada", "Error", JOptionPane.ERROR_MESSAGE);
                }
            } else {
                JOptionPane.showMessageDialog(null, "Credenciales incorrectas");
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
            java.util.logging.Logger.getLogger(RecuPIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RecuPIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RecuPIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RecuPIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RecuPIN().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenRecuPIN;
    private Controles_Personalizados.Paneles.PanelRound PanelCampos;
    private Controles_Personalizados.Paneles.PanelRound PanelImagen;
    private javax.swing.JLabel btnCerrar;
    private javax.swing.JLabel btnGoBack;
    private javax.swing.JLabel btnMinimizar;
    private Controles_Personalizados.Botones.ButtonGradient btnRestablecer;
    private javax.swing.JLabel textoRest;
    private Controles_Personalizados.textfields.PasswordField txtPIN;
    private Controles_Personalizados.textfields.TextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
