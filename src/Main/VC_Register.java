
package Main;

import static Main.ConexionBD.cerrarConexion;
import static Main.ConexionBD.getConexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class VC_Register extends javax.swing.JFrame { 
    VC_LogIn f_Login = new VC_LogIn();
    public static String userCreated;
    public static String pswdCreated;
    public static String roleCreated;
    public VC_Register() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Background = new javax.swing.JPanel();
        jLab_Exit = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTF_User = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jCB_Roles = new javax.swing.JComboBox<>();
        jTF_Password = new javax.swing.JTextField();
        jTF_ConfirmPassword = new javax.swing.JTextField();
        jBtn_Register = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(255, 255, 255));

        jLab_Exit.setFont(new java.awt.Font("OCR A Extended", 0, 24)); // NOI18N
        jLab_Exit.setForeground(new java.awt.Color(29, 76, 45));
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

        jLabel3.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(29, 76, 45));
        jLabel3.setText("Usuario:");

        jTF_User.setBackground(new java.awt.Color(255, 255, 255));
        jTF_User.setForeground(new java.awt.Color(0, 0, 0));

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(29, 76, 45));
        jLabel2.setText("Contraseña:");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Media/VC_RegisterLogo.png"))); // NOI18N

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(29, 76, 45));
        jLabel4.setText("Confirmar contraseña:");

        jLabel5.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(29, 76, 45));
        jLabel5.setText("Rol de usuario:");

        jCB_Roles.setBackground(new java.awt.Color(255, 255, 255));
        jCB_Roles.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "   ", "1- Admin. Sistemas", "2- Trabajador", "3- Cliente" }));

        jTF_Password.setBackground(new java.awt.Color(255, 255, 255));
        jTF_Password.setForeground(new java.awt.Color(0, 0, 0));

        jTF_ConfirmPassword.setBackground(new java.awt.Color(255, 255, 255));
        jTF_ConfirmPassword.setForeground(new java.awt.Color(0, 0, 0));

        jBtn_Register.setBackground(new java.awt.Color(255, 255, 255));
        jBtn_Register.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jBtn_Register.setForeground(new java.awt.Color(29, 76, 45));
        jBtn_Register.setText("Registrarse");
        jBtn_Register.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtn_Register.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_RegisterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addGap(0, 58, Short.MAX_VALUE)
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF_Password, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTF_User, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jCB_Roles, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTF_ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLab_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BackgroundLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBtn_Register)
                .addGap(149, 149, 149))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLab_Exit, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTF_User, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTF_Password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTF_ConfirmPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jCB_Roles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addComponent(jBtn_Register)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 23, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    private static String tipoRol(JComboBox combo,String res){
        String rol = combo.getSelectedItem().toString();
        switch(rol){
            case "   ":
                res = "null";
                JOptionPane.showMessageDialog(null, "Porfavor seleccione un rol");
                break;
            case "1- Admin. Sistemas":
                res = "db_owner";
                break;
            case "2- Trabajador":
                res = "db_datawriter";
                break;
            case "3- Cliente":
                res = "db_datareader";
                break;
        }
        return res;
    }
    
    private static void crearUsuario(String usuario, String pswd, String rol) throws SQLException{
        Connection con =getConexion(ConexionBD.con);
        String query1 =  "CREATE LOGIN "+usuario+ " WITH PASSWORD = "+"'"+pswd+"'";
        PreparedStatement st = con.prepareStatement(query1);
        st.executeUpdate();
        System.out.println("QUERY VALIDA");
        String query2 = "CREATE USER "+ usuario+ " FOR LOGIN "+usuario;
        st = con.prepareStatement(query2);
        st.executeUpdate();
        System.out.println("QUERY VALIDA");
        String query3 = "ALTER ROLE "+rol+" ADD MEMBER "+usuario;
        st = con.prepareStatement(query3);
        st.executeUpdate();
        System.out.println("QUERY VALIDA");
        cerrarConexion(con);
    }
    
    private void jLab_ExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_ExitMouseClicked
        f_Login.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jLab_ExitMouseClicked

    private void jLab_ExitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_ExitMouseEntered
        this.jLab_Exit.setForeground(new Color(53, 144, 84));
    }//GEN-LAST:event_jLab_ExitMouseEntered

    private void jLab_ExitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_ExitMouseExited
        this.jLab_Exit.setForeground(new Color(29, 76, 45));
    }//GEN-LAST:event_jLab_ExitMouseExited

    private void jBtn_RegisterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_RegisterActionPerformed
        String user = this.jTF_User.getText(); // User
        String pswd = this.jTF_Password.getText(); // Password
        String pswd2 = this.jTF_ConfirmPassword.getText(); // Confirm Password
        String role = this.jCB_Roles.getSelectedItem()+"";
        if(pswd.equals(pswd2)){
            if(this.jCB_Roles.getSelectedIndex()==0)
                JOptionPane.showMessageDialog(null, "Porfavor seleccione un rol");
            else{
                userCreated = user;
                pswdCreated = pswd;
                roleCreated = tipoRol(this.jCB_Roles,role);
                try {
                    this.crearUsuario(userCreated,pswdCreated,roleCreated);
                } catch (SQLException ex) {
                    System.out.println(ex.toString());;
                }
                JOptionPane.showMessageDialog(this, "USER: " + userCreated + " CREATED" + "\n" + roleCreated,
                    "", JOptionPane.INFORMATION_MESSAGE);
                this.dispose();
                f_Login.setVisible(true);
            }
        }else
            JOptionPane.showMessageDialog(this, "Passwords need to match", "", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jBtn_RegisterActionPerformed

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
            java.util.logging.Logger.getLogger(VC_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VC_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VC_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VC_Register.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VC_Register().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton jBtn_Register;
    private javax.swing.JComboBox<String> jCB_Roles;
    private javax.swing.JLabel jLab_Exit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField jTF_ConfirmPassword;
    private javax.swing.JTextField jTF_Password;
    private javax.swing.JTextField jTF_User;
    // End of variables declaration//GEN-END:variables
}
