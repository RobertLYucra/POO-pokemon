/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.net.URL;
import static javafx.scene.input.KeyCode.R;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;


/**
 *
 * @author alumno
 */
public class jFEntrenador extends javax.swing.JFrame {
    private URL url;
   
    public jFEntrenador() {
        initComponents();
        
        this.setLocationRelativeTo(null);
        jButton1.setEnabled(false);
    }
    public static String nombre = "";
    public static String sexo = "";
    
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jButton3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registrarse datos");
        setLocation(new java.awt.Point(0, 0));
        setMaximizedBounds(new java.awt.Rectangle(700, 400, 400, 400));
        setMaximumSize(new java.awt.Dimension(650, 400));
        setMinimumSize(new java.awt.Dimension(650, 400));
        setSize(new java.awt.Dimension(603, 358));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tiger Expert", 1, 16)); // NOI18N
        jLabel2.setText("Nombre:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, -1, -1));

        txtNombre.setFont(new java.awt.Font("Tiger Expert", 1, 16)); // NOI18N
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 170, 228, -1));

        jLabel3.setFont(new java.awt.Font("Tiger Expert", 1, 16)); // NOI18N
        jLabel3.setText("Sexo:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, -1, 23));

        jButton1.setFont(new java.awt.Font("Tiger Expert", 1, 16)); // NOI18N
        jButton1.setText("EMPEZAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 310, -1, 39));

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("MASCULINO");
        jRadioButton1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton1ItemStateChanged(evt);
            }
        });
        getContentPane().add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 240, 100, -1));

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("FEMENINO");
        jRadioButton2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jRadioButton2ItemStateChanged(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 240, 100, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Anonimo.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, -1, -1));

        jPanel1.setForeground(new java.awt.Color(1, 1, 1));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, 80, 30));

        jButton3.setFont(new java.awt.Font("Tiger Expert", 0, 12)); // NOI18N
        jButton3.setText("Salir");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 10, -1, -1));

        jLabel4.setFont(new java.awt.Font("Tiger Expert", 1, 48)); // NOI18N
        jLabel4.setText("REGISTRARSE");
        jPanel2.add(jLabel4);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 20, 360, 70));

        jPanel3.setForeground(new java.awt.Color(1, 1, 1));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 80, 30));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/gimnasio2 (1).jpg"))); // NOI18N
        jLabel5.setText("jLabel5");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 650, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        
        if(txtNombre.getText().length()==0){
            JOptionPane.showMessageDialog(null, "Ingrese su nombre...");
        }
        else{
            nombre = txtNombre.getText();
            if(jRadioButton1.isSelected()){
                sexo = jRadioButton1.getText();
            }
            else if(jRadioButton2.isSelected()){
                sexo = jRadioButton2.getText();
            }
            jFPresentarPokemon p = new jFPresentarPokemon();
            p.setVisible(true);
            this.dispose();
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton2ItemStateChanged
        if(jRadioButton2.isSelected()){
            url = this.getClass().getResource("/Imagenes/EntrenadoraMujer.png");
            ImageIcon icon = new ImageIcon(url);
            jLabel1.setIcon(icon);
            //habilitar boton
            jButton1.setEnabled(true);
            
        }
        
    }//GEN-LAST:event_jRadioButton2ItemStateChanged

    private void jRadioButton1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jRadioButton1ItemStateChanged
        if(jRadioButton1.isSelected()){
            url = this.getClass().getResource("/Imagenes/EntrenadorVaron.png");
            ImageIcon icon = new ImageIcon(url);
            jLabel1.setIcon(icon);
            
             //habilitar boton
            jButton1.setEnabled(true);
        }
    }//GEN-LAST:event_jRadioButton1ItemStateChanged

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(jFEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(jFEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(jFEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(jFEntrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new jFEntrenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public static javax.swing.JRadioButton jRadioButton1;
    public static javax.swing.JRadioButton jRadioButton2;
    public javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
