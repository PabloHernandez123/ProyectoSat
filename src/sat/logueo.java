/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sat;

import javax.swing.JOptionPane;

/**
 *
 * @author jorge.l
 */
public class logueo extends javax.swing.JFrame {

    /**
     * Creates new form logueo
     */
    public logueo() {
        initComponents();
        this.setTitle("Login");
        this.setLocation(400,200);
        this.setResizable(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_asesor = new javax.swing.JButton();
        btn_alumnos = new javax.swing.JButton();
        contra1 = new javax.swing.JPasswordField();
        contra2 = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();
        btn_salir = new javax.swing.JButton();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/UACM.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 180, 90));

        jLabel2.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel2.setText("contraseña");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 250, 90, 20));

        jLabel4.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel4.setText("registro de asesor ");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 140, 20));

        jLabel5.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel5.setText("contraseña");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 90, 20));

        btn_asesor.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btn_asesor.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar.jpg"))); // NOI18N
        btn_asesor.setText("aceptar");
        btn_asesor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_asesorMouseClicked(evt);
            }
        });
        getContentPane().add(btn_asesor, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, -1, 30));

        btn_alumnos.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btn_alumnos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/aceptar.jpg"))); // NOI18N
        btn_alumnos.setText("aceptar");
        btn_alumnos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_alumnosMouseClicked(evt);
            }
        });
        getContentPane().add(btn_alumnos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 150, -1, 30));
        getContentPane().add(contra1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 110, -1));
        getContentPane().add(contra2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 250, 110, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 14)); // NOI18N
        jLabel6.setText("registro de alumnos ");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, 160, 30));

        btn_salir.setFont(new java.awt.Font("Tahoma", 3, 12)); // NOI18N
        btn_salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/salir.jpg"))); // NOI18N
        btn_salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirActionPerformed(evt);
            }
        });
        getContentPane().add(btn_salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, 120, -1));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fondo2.jpg"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(4, 4, 500, 360));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_alumnosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_alumnosMouseClicked
       String contrasena = "alumnos";
        
        String pass = new String (contra1.getPassword());
        if(pass.equals(contrasena)){
            alumnos data = new alumnos();
            data.setVisible(true);
            dispose();
        }else{
            JOptionPane.showConfirmDialog(this,"Contraseña Incorrecta\n Ingrese los datos correctamente!");
        }
    }//GEN-LAST:event_btn_alumnosMouseClicked

    private void btn_asesorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_asesorMouseClicked
         String contrasena = "asesor";
        
        String pass = new String (contra2.getPassword());
        if(pass.equals(contrasena)){
            asesor data = new asesor();
            data.setVisible(true);
            dispose();
        }else{
            JOptionPane.showConfirmDialog(this,"Contraseña Incorrecta\n Ingrese los datos correctamente!");
        }
    }//GEN-LAST:event_btn_asesorMouseClicked

    private void btn_salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirActionPerformed
         this.dispose();
    }//GEN-LAST:event_btn_salirActionPerformed

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
            java.util.logging.Logger.getLogger(logueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(logueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(logueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(logueo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new logueo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_alumnos;
    private javax.swing.JButton btn_asesor;
    private javax.swing.JButton btn_salir;
    private javax.swing.JPasswordField contra1;
    private javax.swing.JPasswordField contra2;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
