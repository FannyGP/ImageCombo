/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author FANNY
 */
public class Principal extends javax.swing.JFrame {

    String ruta = "";
    URL url = null;
    ImageIcon icon = null;
    
    public Principal() {
        initComponents();
        this.setLocationRelativeTo(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        lblOpcion = new javax.swing.JLabel();
        jcbOpciones = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblOpcion.setFont(new java.awt.Font("Comic Sans MS", 0, 8)); // NOI18N
        lblOpcion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblOpcion.setText("SELECCIONE \nUNA \nOPCION");
        lblOpcion.setMaximumSize(new java.awt.Dimension(128, 128));
        lblOpcion.setMinimumSize(new java.awt.Dimension(128, 128));
        jPanel2.add(lblOpcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 128, 128));

        jcbOpciones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3" }));
        jcbOpciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbOpcionesActionPerformed(evt);
            }
        });
        jPanel2.add(jcbOpciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jcbOpcionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbOpcionesActionPerformed
        // TODO add your handling code here:
        int op = jcbOpciones.getSelectedIndex();
        
        switch (op) {
            case 0: 
                JOptionPane.showMessageDialog(null,"Número 1",
                        "Opcion Seleccionada", JOptionPane.INFORMATION_MESSAGE);
                ruta = "/imagenes/Dancing.png";
                url = this.getClass().getResource(ruta);
                icon = new ImageIcon(url);
                lblOpcion.setText(null);
                lblOpcion.setIcon(icon);
                break;
            case 1:
                JOptionPane.showMessageDialog(null,"Número 1",
                        "Opcion Seleccionada", JOptionPane.INFORMATION_MESSAGE);
                ruta = "/imagenes/Dancing.png";
                url = this.getClass().getResource(ruta);
                icon = new ImageIcon(url);
                lblOpcion.setText(null);
                lblOpcion.setIcon(icon);
                break;
            case 2:
                JOptionPane.showMessageDialog(null,"Número 1",
                        "Opcion Seleccionada", JOptionPane.INFORMATION_MESSAGE);
                ruta = "/imagenes/Dancing.png";
                url = this.getClass().getResource(ruta);
                icon = new ImageIcon(url);
                lblOpcion.setText(null);
                lblOpcion.setIcon(icon);
                break;
            default:
                throw new AssertionError();
        }
    }//GEN-LAST:event_jcbOpcionesActionPerformed
//hola
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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel jPanel2;
    private javax.swing.JComboBox<String> jcbOpciones;
    private javax.swing.JLabel lblOpcion;
    // End of variables declaration//GEN-END:variables
}
