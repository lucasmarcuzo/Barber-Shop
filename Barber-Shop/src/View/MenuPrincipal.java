package View;

import Controller.MenuPrincipalController;
import javax.swing.JLabel;

//@author lucasMarcuzo
public class MenuPrincipal extends javax.swing.JFrame implements IIconePadrao{

    private final MenuPrincipalController controller;
    
    //Creates new form MenuPrincipal
    public MenuPrincipal() {
        initComponents();
        this.controller = new MenuPrincipalController(this);
        inserirIconePadrao(this);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelFundoMenuPrincipal = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabelUsuario = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuCadastro = new javax.swing.JMenu();
        MenuItemCliente = new javax.swing.JMenuItem();
        MenuItemServico = new javax.swing.JMenuItem();
        MenuItemUsuario = new javax.swing.JMenuItem();
        jMenuOperacao = new javax.swing.JMenu();
        MenuItemAgenda = new javax.swing.JMenuItem();
        jMenuRelatorio = new javax.swing.JMenu();
        MenuItemTrabalho = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Principal");
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(1880, 980));
        setResizable(false);
        setSize(new java.awt.Dimension(1880, 980));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFundoMenuPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        jLabelFundoMenuPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelFundoMenuPrincipal.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/BarbeariaMenuPrincipal.gif"))); // NOI18N
        jLabelFundoMenuPrincipal.setOpaque(true);
        jLabelFundoMenuPrincipal.setPreferredSize(null);
        getContentPane().add(jLabelFundoMenuPrincipal, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, -1, -1));

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));

        jLabelUsuario.setBackground(new java.awt.Color(238, 238, 238));
        jLabelUsuario.setFont(new java.awt.Font("Dialog", 0, 48)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(208, 146, 33));
        jLabelUsuario.setText("Bem Vindo, ");
        jLabelUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabelUsuario.setFocusable(false);
        jLabelUsuario.setInheritsPopupMenu(false);
        jLabelUsuario.setRequestFocusEnabled(false);
        jLabelUsuario.setVerifyInputWhenFocusTarget(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(708, 708, 708)
                .addComponent(jLabelUsuario)
                .addContainerGap(951, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        jLabelUsuario.getAccessibleContext().setAccessibleName("Usuario");

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1920, 60));

        jMenuBar1.setBackground(new java.awt.Color(0, 0, 0));
        jMenuBar1.setAutoscrolls(true);

        jMenuCadastro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/identificacao.png"))); // NOI18N
        jMenuCadastro.setText(" Cadastro");
        jMenuCadastro.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N

        MenuItemCliente.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuItemCliente.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/cliente32-icon.png"))); // NOI18N
        MenuItemCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuItemCliente.setLabel("  Cliente");
        MenuItemCliente.setOpaque(true);
        MenuItemCliente.setPreferredSize(new java.awt.Dimension(125, 38));
        jMenuCadastro.add(MenuItemCliente);
        MenuItemCliente.getAccessibleContext().setAccessibleName("Cliente");

        MenuItemServico.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuItemServico.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/tesoura32-icon.png"))); // NOI18N
        MenuItemServico.setText("  Serviço");
        MenuItemServico.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuItemServico.setOpaque(true);
        jMenuCadastro.add(MenuItemServico);

        MenuItemUsuario.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuItemUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/usuario32-icon.png"))); // NOI18N
        MenuItemUsuario.setText("  Usuário");
        MenuItemUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuItemUsuario.setOpaque(true);
        jMenuCadastro.add(MenuItemUsuario);

        jMenuBar1.add(jMenuCadastro);

        jMenuOperacao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/computer-monitor.png"))); // NOI18N
        jMenuOperacao.setText(" Operação");
        jMenuOperacao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuOperacao.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N

        MenuItemAgenda.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuItemAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/agenda32-icon.png"))); // NOI18N
        MenuItemAgenda.setText("  Agenda");
        MenuItemAgenda.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuItemAgenda.setOpaque(true);
        MenuItemAgenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuItemAgendaActionPerformed(evt);
            }
        });
        jMenuOperacao.add(MenuItemAgenda);

        jMenuBar1.add(jMenuOperacao);

        jMenuRelatorio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/chart.png"))); // NOI18N
        jMenuRelatorio.setText(" Relatório");
        jMenuRelatorio.setActionCommand("Relatório");
        jMenuRelatorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jMenuRelatorio.setFont(new java.awt.Font("Segoe UI", 3, 20)); // NOI18N

        MenuItemTrabalho.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuItemTrabalho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/icons/relatorioTrabalho32-icon.png"))); // NOI18N
        MenuItemTrabalho.setText("  Trabalho");
        MenuItemTrabalho.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        MenuItemTrabalho.setOpaque(true);
        jMenuRelatorio.add(MenuItemTrabalho);

        jMenuBar1.add(jMenuRelatorio);

        setJMenuBar(jMenuBar1);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuItemAgendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuItemAgendaActionPerformed
        this.controller.navegarParaAgenda();
    }//GEN-LAST:event_MenuItemAgendaActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.controller.navegarParaLogin();
    }//GEN-LAST:event_formWindowClosed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuItemAgenda;
    private javax.swing.JMenuItem MenuItemCliente;
    private javax.swing.JMenuItem MenuItemServico;
    private javax.swing.JMenuItem MenuItemTrabalho;
    private javax.swing.JMenuItem MenuItemUsuario;
    private javax.swing.JLabel jLabelFundoMenuPrincipal;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuCadastro;
    private javax.swing.JMenu jMenuOperacao;
    private javax.swing.JMenu jMenuRelatorio;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables

    public JLabel getjLabelUsuario() {
        return jLabelUsuario;
    }

    public void setjLabelUsuario(JLabel jLabelUsuario) {
        this.jLabelUsuario = jLabelUsuario;
    }

}

