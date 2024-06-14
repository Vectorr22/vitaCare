/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Main;

import java.awt.Color;

/**
 *
 * @author Salva
 */
public class VC_Altas extends javax.swing.JFrame {

    /**
     * Creates new form VC_Altas
     */
    public VC_Altas() {
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

        Background = new javax.swing.JPanel();
        jBtn_Pacientes = new javax.swing.JButton();
        jBtn_Hospitales = new javax.swing.JButton();
        jBtn_Medicos = new javax.swing.JButton();
        jLab_Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        Background.setBackground(new java.awt.Color(29, 76, 45));
        Background.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        jBtn_Pacientes.setBackground(new java.awt.Color(188, 189, 190));
        jBtn_Pacientes.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jBtn_Pacientes.setForeground(new java.awt.Color(29, 76, 45));
        jBtn_Pacientes.setText("Pacientes");
        jBtn_Pacientes.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtn_Pacientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_PacientesActionPerformed(evt);
            }
        });

        jBtn_Hospitales.setBackground(new java.awt.Color(188, 189, 190));
        jBtn_Hospitales.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jBtn_Hospitales.setForeground(new java.awt.Color(29, 76, 45));
        jBtn_Hospitales.setText("Hospitales");
        jBtn_Hospitales.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtn_Hospitales.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_HospitalesActionPerformed(evt);
            }
        });

        jBtn_Medicos.setBackground(new java.awt.Color(188, 189, 190));
        jBtn_Medicos.setFont(new java.awt.Font("MS Reference Sans Serif", 1, 24)); // NOI18N
        jBtn_Medicos.setForeground(new java.awt.Color(29, 76, 45));
        jBtn_Medicos.setText("Medicos");
        jBtn_Medicos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jBtn_Medicos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_MedicosActionPerformed(evt);
            }
        });

        jLab_Back.setFont(new java.awt.Font("MS Reference Sans Serif", 0, 24)); // NOI18N
        jLab_Back.setForeground(new java.awt.Color(188, 189, 190));
        jLab_Back.setText("REGRESAR");
        jLab_Back.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLab_Back.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLab_Back.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLab_BackMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLab_BackMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLab_BackMouseExited(evt);
            }
        });

        javax.swing.GroupLayout BackgroundLayout = new javax.swing.GroupLayout(Background);
        Background.setLayout(BackgroundLayout);
        BackgroundLayout.setHorizontalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(99, 99, 99)
                        .addGroup(BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jBtn_Medicos, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jBtn_Hospitales, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)
                            .addComponent(jBtn_Pacientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(BackgroundLayout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(jLab_Back)))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        BackgroundLayout.setVerticalGroup(
            BackgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BackgroundLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jBtn_Pacientes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtn_Medicos, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jBtn_Hospitales, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLab_Back, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(45, Short.MAX_VALUE))
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

    private void jLab_BackMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_BackMouseClicked
        VC_Main f_Main = new VC_Main();
        
        f_Main.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jLab_BackMouseClicked

    private void jLab_BackMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_BackMouseEntered
        this.jLab_Back.setForeground(new Color(51, 51, 51));
    }//GEN-LAST:event_jLab_BackMouseEntered

    private void jLab_BackMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLab_BackMouseExited
        this.jLab_Back.setForeground(new Color(188, 189, 190));
    }//GEN-LAST:event_jLab_BackMouseExited

    private void jBtn_PacientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_PacientesActionPerformed
        VC_Altas_Pacientes f_AltPacientes = new VC_Altas_Pacientes();
        
        f_AltPacientes.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jBtn_PacientesActionPerformed

    private void jBtn_MedicosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_MedicosActionPerformed
        VC_Altas_Medicos f_AltMedicos = new VC_Altas_Medicos();
        
        f_AltMedicos.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jBtn_MedicosActionPerformed

    private void jBtn_HospitalesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_HospitalesActionPerformed
        VC_Altas_Hospitales f_AltHospitales = new VC_Altas_Hospitales();
        
        f_AltHospitales.setVisible(true);
        
        this.dispose();
    }//GEN-LAST:event_jBtn_HospitalesActionPerformed

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
            java.util.logging.Logger.getLogger(VC_Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VC_Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VC_Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VC_Altas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VC_Altas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Background;
    private javax.swing.JButton jBtn_Hospitales;
    private javax.swing.JButton jBtn_Medicos;
    private javax.swing.JButton jBtn_Pacientes;
    private javax.swing.JLabel jLab_Back;
    // End of variables declaration//GEN-END:variables
}
