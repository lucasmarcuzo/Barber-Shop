package View;

import Controller.LoginController;
import Model.DAO.Banco;
import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import lombok.Data;

//@author lucasMarcuzo
@Data
public class Login extends javax.swing.JFrame implements IIconePadrao{

    private final LoginController controller;

    //Creates new form Login
    public Login() {
        initComponents();
        controller = new LoginController(this);
        inserirIconePadrao(this);
        Banco.inicia();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        TextSenha = new javax.swing.JPasswordField();
        TextUsuario = new javax.swing.JTextField();
        ButtonEntrar = new javax.swing.JButton();
        jLabelSenha = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelLogin = new javax.swing.JLabel();
        jLabelPainel = new javax.swing.JLabel();
        jLabelFundo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(540, 960));
        setPreferredSize(new java.awt.Dimension(540, 960));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextSenha.setSelectionColor(new java.awt.Color(208, 146, 33));
        TextSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(TextSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 580, 340, 40));
        TextSenha.getAccessibleContext().setAccessibleDescription("Digite a sua Senha");

        TextUsuario.setToolTipText("");
        TextUsuario.setSelectionColor(new java.awt.Color(208, 146, 33));
        TextUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                TextUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(TextUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 340, 40));
        TextUsuario.getAccessibleContext().setAccessibleDescription("Digite seu Usuário");

        ButtonEntrar.setBackground(new java.awt.Color(51, 255, 0));
        ButtonEntrar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ButtonEntrar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonEntrar.setText("Entrar");
        ButtonEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        ButtonEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEntrarActionPerformed(evt);
            }
        });
        ButtonEntrar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ButtonEntrarKeyPressed(evt);
            }
        });
        getContentPane().add(ButtonEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 670, 220, 50));

        jLabelSenha.setBackground(new java.awt.Color(238, 238, 238));
        jLabelSenha.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelSenha.setForeground(new java.awt.Color(255, 255, 255));
        jLabelSenha.setText("Senha:");
        getContentPane().add(jLabelSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 540, -1, -1));

        jLabelUsuario.setBackground(new java.awt.Color(238, 238, 238));
        jLabelUsuario.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jLabelUsuario.setText("Usuário:");
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));

        jLabelLogin.setBackground(new java.awt.Color(238, 238, 238));
        jLabelLogin.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelLogin.setForeground(new java.awt.Color(208, 146, 33));
        jLabelLogin.setText("Login");
        getContentPane().add(jLabelLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 310, -1, -1));

        jLabelPainel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/painel-login.png"))); // NOI18N
        getContentPane().add(jLabelPainel, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, 240, 560, 530));

        jLabelFundo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/BarbeariaNavalhaLogin.jpg"))); // NOI18N
        getContentPane().add(jLabelFundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 540, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEntrarActionPerformed
        this.controller.entrarNoSistema();
    }//GEN-LAST:event_ButtonEntrarActionPerformed

    private void ButtonEntrarKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ButtonEntrarKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) this.controller.entrarNoSistema();  
    }//GEN-LAST:event_ButtonEntrarKeyPressed

    private void TextUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) this.controller.entrarNoSistema(); 
    }//GEN-LAST:event_TextUsuarioKeyPressed

    private void TextSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) this.controller.entrarNoSistema(); 
    }//GEN-LAST:event_TextSenhaKeyPressed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEntrar;
    private javax.swing.JPasswordField TextSenha;
    private javax.swing.JTextField TextUsuario;
    private javax.swing.JLabel jLabelFundo;
    private javax.swing.JLabel jLabelLogin;
    private javax.swing.JLabel jLabelPainel;
    private javax.swing.JLabel jLabelSenha;
    private javax.swing.JLabel jLabelUsuario;
    // End of variables declaration//GEN-END:variables

    public void exibeMensagem(String mensagem) {
        JOptionPane.showMessageDialog(null, mensagem, "ERRO!", JOptionPane.ERROR_MESSAGE);
    }

    public JPasswordField getTextSenha() {
        return TextSenha;
    }

    public void setTextSenha(JPasswordField TextSenha) {
        this.TextSenha = TextSenha;
    }

    public JTextField getTextUsuario() {
        return TextUsuario;
    }

    public void setTextUsuario(JTextField TextUsuario) {
        this.TextUsuario = TextUsuario;
    }
    
    
}
