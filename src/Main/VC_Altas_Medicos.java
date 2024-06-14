/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Salva
 */
public class VC_Altas_Medicos extends javax.swing.JFrame {
    String numRegistro,primNom,segunNom,apPat,apMat,tel,correo;
    int especialidad;
    /**
     * Creates new form VC_Altas_Pacientes
     */
    public VC_Altas_Medicos() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTF_NSS = new javax.swing.JTextField();
        jTF_Nombre1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTF_Nombre2 = new javax.swing.JTextField();
        jTF_ApPaterno = new javax.swing.JTextField();
        jTF_Ap_Materno = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTF_Telefono = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jTF_Correo = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jBtn_Registrar = new javax.swing.JButton();
        jBtn_Salir = new javax.swing.JButton();
        jcb_especialidad = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(188, 189, 190));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(29, 76, 45), 4));

        jLabel1.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(29, 76, 45));
        jLabel1.setText("MEDICOS");

        jLabel2.setForeground(new java.awt.Color(29, 76, 45));
        jLabel2.setText("Num de registro:");

        jTF_NSS.setBackground(new java.awt.Color(255, 255, 255));
        jTF_NSS.setForeground(new java.awt.Color(29, 76, 45));

        jTF_Nombre1.setBackground(new java.awt.Color(255, 255, 255));
        jTF_Nombre1.setForeground(new java.awt.Color(29, 76, 45));

        jLabel3.setForeground(new java.awt.Color(29, 76, 45));
        jLabel3.setText("Nombre:");

        jTF_Nombre2.setBackground(new java.awt.Color(255, 255, 255));
        jTF_Nombre2.setForeground(new java.awt.Color(29, 76, 45));

        jTF_ApPaterno.setBackground(new java.awt.Color(255, 255, 255));
        jTF_ApPaterno.setForeground(new java.awt.Color(29, 76, 45));

        jTF_Ap_Materno.setBackground(new java.awt.Color(255, 255, 255));
        jTF_Ap_Materno.setForeground(new java.awt.Color(29, 76, 45));

        jLabel4.setForeground(new java.awt.Color(29, 76, 45));
        jLabel4.setText("Telefono:");

        jTF_Telefono.setBackground(new java.awt.Color(255, 255, 255));
        jTF_Telefono.setForeground(new java.awt.Color(29, 76, 45));

        jLabel9.setForeground(new java.awt.Color(29, 76, 45));
        jLabel9.setText("Correo:");

        jTF_Correo.setBackground(new java.awt.Color(255, 255, 255));
        jTF_Correo.setForeground(new java.awt.Color(29, 76, 45));

        jLabel10.setForeground(new java.awt.Color(29, 76, 45));
        jLabel10.setText("Num de especialidad:");

        jBtn_Registrar.setBackground(new java.awt.Color(255, 255, 255));
        jBtn_Registrar.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jBtn_Registrar.setForeground(new java.awt.Color(29, 76, 45));
        jBtn_Registrar.setText("Registrar");
        jBtn_Registrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtn_Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_RegistrarActionPerformed(evt);
            }
        });

        jBtn_Salir.setBackground(new java.awt.Color(255, 255, 255));
        jBtn_Salir.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jBtn_Salir.setForeground(new java.awt.Color(29, 76, 45));
        jBtn_Salir.setText("Salir");
        jBtn_Salir.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jBtn_Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_SalirActionPerformed(evt);
            }
        });

        jcb_especialidad.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cardiología", "Dermatología", "Gastroenterología", "Neurología", "Oftalmología", " " }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel9)
                            .addComponent(jLabel10))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTF_Telefono, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTF_NSS, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jTF_Nombre1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTF_Nombre2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTF_ApPaterno)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTF_Ap_Materno))
                                    .addComponent(jTF_Correo, javax.swing.GroupLayout.Alignment.TRAILING)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jcb_especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jBtn_Registrar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBtn_Salir)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTF_NSS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTF_Nombre1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_ApPaterno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_Ap_Materno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTF_Nombre2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTF_Telefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTF_Correo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(jcb_especialidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtn_Registrar)
                    .addComponent(jBtn_Salir))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jBtn_SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_SalirActionPerformed
        int x = JOptionPane.showConfirmDialog(this, "¿Ha terminado de realizar sus registros?",
                "Confirmación", JOptionPane.YES_NO_OPTION);

        if (x == 0) {
            VC_Main f_Main = new VC_Main();

            f_Main.setVisible(true);

            this.dispose();
        }
    }//GEN-LAST:event_jBtn_SalirActionPerformed

    private void jBtn_RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_RegistrarActionPerformed
        numRegistro = "'"+this.jTF_NSS.getText()+"'";
        primNom = "'"+this.jTF_Nombre1.getText()+"'";
        segunNom = "'"+this.jTF_Nombre2.getText()+"'";
        apPat = "'"+this.jTF_ApPaterno.getText()+"'";
        apMat = "'"+this.jTF_Ap_Materno.getText()+"'";
        tel = "'"+this.jTF_Telefono.getText()+"'";
        correo = "'"+this.jTF_Correo.getText()+"'";
        String esp = this.jcb_especialidad.getSelectedItem().toString();
        
        switch(esp){
            case "Cardiología":
                especialidad = 1;
                break;
            case "Dermatología":
                especialidad = 2;
                break;
            case "Gastroenterología":
                especialidad = 3;
                break;
            case "Neurología":
                especialidad = 4;
                break;
            case "Oftalmología":
                especialidad = 5;
                break;
        }
        
        String query = "INSERT INTO medico VALUES("+numRegistro+", "+primNom+", "+segunNom+", "+apPat+", "+apMat+", "+tel+", "+correo+", "+especialidad+");";
        try {
            Connection con = ConexionBD.getConexion(ConexionBD.con);
            PreparedStatement st = con.prepareStatement(query);
            int filasInsertadas = st.executeUpdate();
            if(filasInsertadas>0)
                System.out.println("operaciones correcta");
            else
                System.out.println("error al insertar medico");
        } catch (SQLException ex) {
            System.out.println(ex.toString());
        }
        
    }//GEN-LAST:event_jBtn_RegistrarActionPerformed

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
            java.util.logging.Logger.getLogger(VC_Altas_Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VC_Altas_Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VC_Altas_Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VC_Altas_Medicos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VC_Altas_Medicos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Registrar;
    private javax.swing.JButton jBtn_Salir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTF_ApPaterno;
    private javax.swing.JTextField jTF_Ap_Materno;
    private javax.swing.JTextField jTF_Correo;
    private javax.swing.JTextField jTF_NSS;
    private javax.swing.JTextField jTF_Nombre1;
    private javax.swing.JTextField jTF_Nombre2;
    private javax.swing.JTextField jTF_Telefono;
    private javax.swing.JComboBox<String> jcb_especialidad;
    // End of variables declaration//GEN-END:variables
}
