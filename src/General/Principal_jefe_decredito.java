/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package General;

import sprint1.Administrador;

// clonando 2
/**
 *
 * @author estevan
 */
public class Principal_jefe_decredito extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal_jefe_decredito() {
        initComponents();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem11 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem9 = new javax.swing.JMenuItem();
        consultar_c = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jmCuentasEm = new javax.swing.JMenu();
        jMenuItem10 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 51, 51));

        jDesktopPane1.setBackground(new java.awt.Color(255, 200, 217));
        jDesktopPane1.setForeground(new java.awt.Color(255, 0, 102));
        jDesktopPane1.setPreferredSize(new java.awt.Dimension(1068, 959));

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1068, Short.MAX_VALUE)
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 727, Short.MAX_VALUE)
        );

        getContentPane().add(jDesktopPane1, java.awt.BorderLayout.CENTER);

        jMenuBar1.setBackground(new java.awt.Color(51, 0, 51));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createCompoundBorder(new javax.swing.border.MatteBorder(null), null));

        jMenu1.setBackground(new java.awt.Color(204, 255, 255));
        jMenu1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED, null, new java.awt.Color(0, 0, 0), null, null));
        jMenu1.setForeground(new java.awt.Color(0, 51, 51));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/archivom.png"))); // NOI18N
        jMenu1.setText("Registrar      ");
        jMenu1.setFont(new java.awt.Font("Sitka Small", 1, 16)); // NOI18N

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem2.setBackground(new java.awt.Color(204, 255, 255));
        jMenuItem2.setFont(new java.awt.Font("Sitka Small", 1, 15)); // NOI18N
        jMenuItem2.setForeground(new java.awt.Color(0, 51, 51));
        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/anadir (1).png"))); // NOI18N
        jMenuItem2.setText("Registrar Solicitud de Inversion");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setBackground(new java.awt.Color(204, 255, 255));
        jMenuItem1.setFont(new java.awt.Font("Sitka Small", 1, 15)); // NOI18N
        jMenuItem1.setForeground(new java.awt.Color(0, 51, 51));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/anadir (2).png"))); // NOI18N
        jMenuItem1.setText("Registrar Solicitud de Credito");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setBackground(new java.awt.Color(204, 255, 255));
        jMenuItem3.setFont(new java.awt.Font("Sitka Small", 1, 15)); // NOI18N
        jMenuItem3.setForeground(new java.awt.Color(0, 51, 51));
        jMenuItem3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/anadir (3).png"))); // NOI18N
        jMenuItem3.setText("Registrar Nuevo Cliente");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuItem11.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem11.setBackground(new java.awt.Color(204, 255, 255));
        jMenuItem11.setFont(new java.awt.Font("Sitka Small", 1, 15)); // NOI18N
        jMenuItem11.setForeground(new java.awt.Color(0, 51, 51));
        jMenuItem11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/visualizarms.png"))); // NOI18N
        jMenuItem11.setText("Ver - Actualizar datos");
        jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem11ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem11);

        jMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(204, 255, 255));
        jMenu2.setBorder(javax.swing.BorderFactory.createCompoundBorder(null, javax.swing.BorderFactory.createEtchedBorder(new java.awt.Color(255, 51, 51), new java.awt.Color(102, 0, 51))));
        jMenu2.setForeground(new java.awt.Color(0, 51, 51));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/revision.png"))); // NOI18N
        jMenu2.setText("Administracion de Solicitudes     ");
        jMenu2.setActionCommand("Administracion de Solicitudes    ");
        jMenu2.setFont(new java.awt.Font("Sitka Small", 1, 16)); // NOI18N

        jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem4.setBackground(new java.awt.Color(204, 255, 255));
        jMenuItem4.setFont(new java.awt.Font("Sitka Small", 1, 15)); // NOI18N
        jMenuItem4.setForeground(new java.awt.Color(0, 51, 51));
        jMenuItem4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/registro (2).png"))); // NOI18N
        jMenuItem4.setText("Administrar Solicitudes de Credito");
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem4);

        jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_I, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem5.setBackground(new java.awt.Color(204, 255, 255));
        jMenuItem5.setFont(new java.awt.Font("Sitka Small", 1, 15)); // NOI18N
        jMenuItem5.setForeground(new java.awt.Color(0, 51, 51));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/registro (1).png"))); // NOI18N
        jMenuItem5.setText("Administrar Solicitudes de Inversion");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem5);

        jMenuItem8.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem8.setBackground(new java.awt.Color(204, 255, 255));
        jMenuItem8.setFont(new java.awt.Font("Sitka Small", 1, 15)); // NOI18N
        jMenuItem8.setForeground(new java.awt.Color(0, 51, 51));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/registro (4).png"))); // NOI18N
        jMenuItem8.setText("Creditos Aprobados");
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem8);

        jMenuItem9.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_A, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem9.setBackground(new java.awt.Color(204, 255, 255));
        jMenuItem9.setFont(new java.awt.Font("Sitka Small", 1, 15)); // NOI18N
        jMenuItem9.setForeground(new java.awt.Color(0, 51, 51));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/registro (5).png"))); // NOI18N
        jMenuItem9.setText("Inversiones Aprobadas");
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem9);

        consultar_c.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK));
        consultar_c.setBackground(new java.awt.Color(204, 255, 255));
        consultar_c.setFont(new java.awt.Font("Sitka Small", 1, 15)); // NOI18N
        consultar_c.setForeground(new java.awt.Color(0, 51, 51));
        consultar_c.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/buscar (1).png"))); // NOI18N
        consultar_c.setText("consulltar solicitudes");
        consultar_c.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consultar_cActionPerformed(evt);
            }
        });
        jMenu2.add(consultar_c);

        jMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(204, 255, 255));
        jMenu3.setBorder(new javax.swing.border.MatteBorder(null));
        jMenu3.setForeground(new java.awt.Color(0, 51, 51));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/pagos.png"))); // NOI18N
        jMenu3.setText("Pagos");
        jMenu3.setActionCommand("   Pagos");
        jMenu3.setFocusable(false);
        jMenu3.setFont(new java.awt.Font("Sitka Small", 1, 16)); // NOI18N

        jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.ALT_MASK));
        jMenuItem6.setBackground(new java.awt.Color(204, 255, 255));
        jMenuItem6.setFont(new java.awt.Font("Sitka Small", 1, 15)); // NOI18N
        jMenuItem6.setForeground(new java.awt.Color(0, 51, 51));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/comprar (1).png"))); // NOI18N
        jMenuItem6.setText("Pagos de Creditos");
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem7.setBackground(new java.awt.Color(204, 255, 255));
        jMenuItem7.setFont(new java.awt.Font("Sitka Small", 1, 15)); // NOI18N
        jMenuItem7.setForeground(new java.awt.Color(0, 51, 51));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/comprar.png"))); // NOI18N
        jMenuItem7.setText("Pagos a Inversionistas");
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        jMenuBar1.add(jMenu3);

        jmCuentasEm.setBackground(new java.awt.Color(204, 255, 255));
        jmCuentasEm.setBorder(new javax.swing.border.MatteBorder(null));
        jmCuentasEm.setForeground(new java.awt.Color(0, 51, 51));
        jmCuentasEm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/name usr.png"))); // NOI18N
        jmCuentasEm.setText("   Cuentas");
        jmCuentasEm.setActionCommand("Cuentas");
        jmCuentasEm.setFont(new java.awt.Font("Sitka Small", 1, 16)); // NOI18N

        jMenuItem10.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem10.setBackground(new java.awt.Color(204, 255, 255));
        jMenuItem10.setFont(new java.awt.Font("Sitka Small", 1, 15)); // NOI18N
        jMenuItem10.setForeground(new java.awt.Color(0, 51, 51));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/opcion-multimedia.png"))); // NOI18N
        jMenuItem10.setText("Menu Principal");
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jmCuentasEm.add(jMenuItem10);

        jMenuBar1.add(jmCuentasEm);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        jDesktopPane1.removeAll();
        SolicitudCredito sol=new SolicitudCredito();
        jDesktopPane1.add(sol);
        sol.show();
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        jDesktopPane1.removeAll();
        SolicitudInversion solinv = new SolicitudInversion();
        jDesktopPane1.add(solinv);
        solinv.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
       jDesktopPane1.removeAll();
        Jefe_reg_s re = new Jefe_reg_s();
        jDesktopPane1.add(re);
        re.show();

    }//GEN-LAST:event_jMenuItem4ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        jDesktopPane1.removeAll();
        CreditosAprobados ca=new CreditosAprobados();
        jDesktopPane1.add(ca);
        ca.show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        jDesktopPane1.removeAll();
        PagosCredito pg =new PagosCredito();
        jDesktopPane1.add(pg);
        pg.show();
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        jDesktopPane1.removeAll();
        NuevoCliente nv = new NuevoCliente();
        jDesktopPane1.add(nv);
        nv.show();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        jDesktopPane1.removeAll();
        PagosInversion pg1 =new PagosInversion();
        jDesktopPane1.add(pg1);
        pg1.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
       jDesktopPane1.removeAll();
        jefe_sol_inv rinv=new jefe_sol_inv();
        jDesktopPane1.add(rinv);
        rinv.show();
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        jDesktopPane1.removeAll();
        InversionAprobados ca=new InversionAprobados();
        jDesktopPane1.add(ca);
        ca.show();
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        login vista = new login();
        vista.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void consultar_cActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consultar_cActionPerformed

           jDesktopPane1.removeAll();
            consultar_jefe con= new consultar_jefe();
             jDesktopPane1.add(con);
        con.show();
    }//GEN-LAST:event_consultar_cActionPerformed

    private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
        jDesktopPane1.removeAll();
        Ver_Actualizar con= new Ver_Actualizar();
        jDesktopPane1.add(con);
        con.show();
    }//GEN-LAST:event_jMenuItem11ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal_jefe_decredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_jefe_decredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_jefe_decredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_jefe_decredito.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_jefe_decredito().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem consultar_c;
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem11;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu jmCuentasEm;
    // End of variables declaration//GEN-END:variables
}