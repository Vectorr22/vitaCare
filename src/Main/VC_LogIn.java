
package Main;

import java.awt.Color;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class VC_LogIn extends javax.swing.JFrame {
    ConexionBD cone;
    public VC_LogIn() {
        
        initComponents();
        cone = new ConexionBD();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jTF_User = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jBtn_LogIn = new javax.swing.JButton();
        jLab_Exit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jBtn_Register = new javax.swing.JButton();
        jTF_Password = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(29, 76, 45));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/VC_LogInLogo.png"))); // NOI18N

        jTF_User.setBackground(new java.awt.Color(255, 255, 255));
        jTF_User.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Contraseña:");

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Usuario:");

        jBtn_LogIn.setBackground(new java.awt.Color(255, 255, 255));
        jBtn_LogIn.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jBtn_LogIn.setForeground(new java.awt.Color(51, 51, 51));
        jBtn_LogIn.setText("Iniciar Sesión");
        jBtn_LogIn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtn_LogIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_LogInActionPerformed(evt);
            }
        });

        jLab_Exit.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        jLab_Exit.setForeground(new java.awt.Color(255, 255, 255));
        jLab_Exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLab_Exit.setText("X");
        jLab_Exit.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLab_Exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_ExitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLab_ExitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLab_ExitMouseExited(evt);
            }
        });

        jLabel4.setText("¿No tienes un usuario?");

        jBtn_Register.setBackground(new java.awt.Color(255, 255, 255));
        jBtn_Register.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jBtn_Register.setForeground(new java.awt.Color(51, 51, 51));
        jBtn_Register.setText("REGISTRATE!");
        jBtn_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_RegisterActionPerformed(evt);
            }
        });

        jTF_Password.setBackground(new java.awt.Color(255, 255, 255));
        jTF_Password.setForeground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jBtn_LogIn)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTF_User, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                            .addComponent(jTF_Password))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jBtn_Register))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLab_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addComponent(jLab_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTF_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTF_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addComponent(jBtn_LogIn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 46, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBtn_Register)
                        .addGap(15, 15, 15))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLab_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_ExitMouseClicked
        System.exit(0);  // Exit
    }//GEN-LAST:event_jLab_ExitMouseClicked

    private void jLab_ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_ExitMouseEntered
        this.jLab_Exit.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_jLab_ExitMouseEntered

    private void jLab_ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_ExitMouseExited
        this.jLab_Exit.setForeground(new Color(251, 251, 251));
    }//GEN-LAST:event_jLab_ExitMouseExited

    private void jBtn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_RegisterActionPerformed
        this.setVisible(false);
        
        // Close LogIn frame and opens Register frame
        VC_Register f_Register = new VC_Register();;
        f_Register.setVisible(true);
    }//GEN-LAST:event_jBtn_RegisterActionPerformed

    private void jBtn_LogInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_LogInActionPerformed
        cone.DB_USER = this.jTF_User.getText();
        char[] passwordChars = jTF_Password.getPassword();
        String password = new String(passwordChars);
        cone.DB_PASSWORD = password;
        try {
            cone.getConexion(ConexionBD.con);
        } catch (SQLException ex) {
            System.out.println(ex.toString());;
        }
        
        VC_Main f_Main = new VC_Main();       
        
        f_Main.setVisible(true); // Show main frame after acces is granted
        
        this.dispose(); // Hide LogIn frame
        
        
    }//GEN-LAST:event_jBtn_LogInActionPerformed

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
            java.util.logging.Logger.getLogger(VC_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VC_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VC_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VC_LogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VC_LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton jBtn_LogIn;
    private javax.swing.JButton jBtn_Register;
    private javax.swing.JLabel jLab_Exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField jTF_Password;
    private javax.swing.JTextField jTF_User;
    // End of variables declaration//GEN-END:variables
}
