package View;

import Controller.AgendaController;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;

//@author lucasMarcuzo
public class Agenda extends javax.swing.JFrame implements IIconePadrao{

    private final AgendaController controller;


    //Creates new form Agenda
    public Agenda() {
        initComponents();
        controller = new AgendaController(this);
        inserirIconePadrao(this);
        iniciar();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelAgenda = new javax.swing.JLabel();
        LabelId = new javax.swing.JLabel();
        LabelCliente = new javax.swing.JLabel();
        LabelServico = new javax.swing.JLabel();
        LabelValor = new javax.swing.JLabel();
        LabelData = new javax.swing.JLabel();
        LabelHora = new javax.swing.JLabel();
        LabelObservacao = new javax.swing.JLabel();
        TextId = new javax.swing.JTextField();
        jComboBoxCliente = new javax.swing.JComboBox<>();
        jComboBoxServico = new javax.swing.JComboBox<>();
        TextValor = new javax.swing.JTextField();
        TextFormatedData = new javax.swing.JFormattedTextField();
        TextFormatedHora = new javax.swing.JFormattedTextField();
        jScrollPaneObservacao = new javax.swing.JScrollPane();
        TextObservacao = new javax.swing.JTextArea();
        ButtonCancelar = new javax.swing.JButton();
        ButtonAgendar = new javax.swing.JButton();
        jScrollPaneTabelaAgendamentos = new javax.swing.JScrollPane();
        TabelaAgendamentos = new javax.swing.JTable();
        jLabelUsuario = new javax.swing.JLabel();
        jLabelPainelAgenda = new javax.swing.JLabel();
        jLabelFundoAgenda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Agenda");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        LabelAgenda.setBackground(new java.awt.Color(255, 255, 255));
        LabelAgenda.setFont(new java.awt.Font("Liberation Sans", 3, 48)); // NOI18N
        LabelAgenda.setForeground(new java.awt.Color(208, 146, 33));
        LabelAgenda.setText("Agenda");
        getContentPane().add(LabelAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 0, 180, 60));

        LabelId.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelId.setForeground(new java.awt.Color(255, 255, 255));
        LabelId.setText("ID:");
        getContentPane().add(LabelId, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 150, -1, -1));

        LabelCliente.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelCliente.setForeground(new java.awt.Color(255, 255, 255));
        LabelCliente.setText("Cliente:");
        getContentPane().add(LabelCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 210, -1, -1));

        LabelServico.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelServico.setForeground(new java.awt.Color(255, 255, 255));
        LabelServico.setText("Serviço:");
        getContentPane().add(LabelServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 270, -1, -1));

        LabelValor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelValor.setForeground(new java.awt.Color(255, 255, 255));
        LabelValor.setText("Valor (R$):");
        getContentPane().add(LabelValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 330, -1, -1));

        LabelData.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelData.setForeground(new java.awt.Color(255, 255, 255));
        LabelData.setText("Data:");
        getContentPane().add(LabelData, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 390, -1, -1));

        LabelHora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelHora.setForeground(new java.awt.Color(255, 255, 255));
        LabelHora.setText("Hora:");
        getContentPane().add(LabelHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 490, -1, -1));

        LabelObservacao.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        LabelObservacao.setForeground(new java.awt.Color(255, 255, 255));
        LabelObservacao.setText("Observação:");
        getContentPane().add(LabelObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 150, -1, -1));

        TextId.setEditable(false);
        TextId.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TextId.setText("0");
        TextId.setToolTipText("");
        getContentPane().add(TextId, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 280, 40));

        jComboBoxCliente.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jComboBoxCliente.setBorder(new javax.swing.border.MatteBorder(null));
        getContentPane().add(jComboBoxCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 280, 40));

        jComboBoxServico.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jComboBoxServico.setBorder(new javax.swing.border.MatteBorder(null));
        jComboBoxServico.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxServicoItemStateChanged(evt);
            }
        });
        getContentPane().add(jComboBoxServico, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 280, 40));

        TextValor.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        TextValor.setText("0");
        TextValor.setToolTipText("");
        getContentPane().add(TextValor, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 320, 280, 40));

        TextFormatedData.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter()));
        TextFormatedData.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(TextFormatedData, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 380, 280, 40));

        TextFormatedHora.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance(java.text.DateFormat.SHORT))));
        TextFormatedHora.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        getContentPane().add(TextFormatedHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, 280, 40));

        TextObservacao.setColumns(20);
        TextObservacao.setFont(new java.awt.Font("Monospaced", 0, 15)); // NOI18N
        TextObservacao.setRows(5);
        jScrollPaneObservacao.setViewportView(TextObservacao);

        getContentPane().add(jScrollPaneObservacao, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 140, 590, 310));

        ButtonCancelar.setBackground(new java.awt.Color(255, 0, 51));
        ButtonCancelar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ButtonCancelar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonCancelar.setText("Cancelar");
        ButtonCancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 460, 280, 50));

        ButtonAgendar.setBackground(new java.awt.Color(51, 255, 0));
        ButtonAgendar.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        ButtonAgendar.setForeground(new java.awt.Color(255, 255, 255));
        ButtonAgendar.setText("Agendar");
        ButtonAgendar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ButtonAgendar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonAgendarActionPerformed(evt);
            }
        });
        getContentPane().add(ButtonAgendar, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 460, 280, 50));

        jScrollPaneTabelaAgendamentos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        TabelaAgendamentos.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        TabelaAgendamentos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Cliente", "Serviço", "Valor", "Data", "Hora", "Observação"
            }
        ));
        TabelaAgendamentos.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
        TabelaAgendamentos.setSelectionBackground(new java.awt.Color(208, 146, 33));
        TabelaAgendamentos.getTableHeader().setReorderingAllowed(false);
        jScrollPaneTabelaAgendamentos.setViewportView(TabelaAgendamentos);

        getContentPane().add(jScrollPaneTabelaAgendamentos, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 560, 1160, 340));

        jLabelUsuario.setEnabled(false);
        getContentPane().add(jLabelUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 130, 30));

        jLabelPainelAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/Agenda-PainelFundo.png"))); // NOI18N
        jLabelPainelAgenda.setMaximumSize(null);
        getContentPane().add(jLabelPainelAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1258, 950));

        jLabelFundoAgenda.setIcon(new javax.swing.ImageIcon(getClass().getResource("/View/imagens/AgendaFundo.png"))); // NOI18N
        jLabelFundoAgenda.setMaximumSize(null);
        getContentPane().add(jLabelFundoAgenda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1258, 950));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed
        this.controller.navegarParaMenuPrincipal();
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void ButtonAgendarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonAgendarActionPerformed
        this.controller.agendar();
    }//GEN-LAST:event_ButtonAgendarActionPerformed

    private void jComboBoxServicoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxServicoItemStateChanged
        this.controller.atualizaValor();
    }//GEN-LAST:event_jComboBoxServicoItemStateChanged

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        this.controller.navegarParaMenuPrincipal();
    }//GEN-LAST:event_formWindowClosed

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
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Agenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Agenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonAgendar;
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JLabel LabelAgenda;
    private javax.swing.JLabel LabelCliente;
    private javax.swing.JLabel LabelData;
    private javax.swing.JLabel LabelHora;
    private javax.swing.JLabel LabelId;
    private javax.swing.JLabel LabelObservacao;
    private javax.swing.JLabel LabelServico;
    private javax.swing.JLabel LabelValor;
    private javax.swing.JTable TabelaAgendamentos;
    private javax.swing.JFormattedTextField TextFormatedData;
    private javax.swing.JFormattedTextField TextFormatedHora;
    private javax.swing.JTextField TextId;
    private javax.swing.JTextArea TextObservacao;
    private javax.swing.JTextField TextValor;
    private javax.swing.JComboBox<String> jComboBoxCliente;
    private javax.swing.JComboBox<String> jComboBoxServico;
    private javax.swing.JLabel jLabelFundoAgenda;
    private javax.swing.JLabel jLabelPainelAgenda;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JScrollPane jScrollPaneObservacao;
    private javax.swing.JScrollPane jScrollPaneTabelaAgendamentos;
    // End of variables declaration//GEN-END:variables

    private void iniciar() {
        this.controller.atualizaTabela();
        this.controller.atualizaCliente();
        this.controller.atualizaServico();
    }

    public JTable getTabelaAgendamentos() {
        this.TabelaAgendamentos.getColumnModel().getColumn(0).setPreferredWidth(60);
        this.TabelaAgendamentos.getColumnModel().getColumn(1).setPreferredWidth(250);
        this.TabelaAgendamentos.getColumnModel().getColumn(2).setPreferredWidth(250);
        this.TabelaAgendamentos.getColumnModel().getColumn(3).setPreferredWidth(60);
        this.TabelaAgendamentos.getColumnModel().getColumn(4).setPreferredWidth(120);
        this.TabelaAgendamentos.getColumnModel().getColumn(5).setPreferredWidth(80);
        this.TabelaAgendamentos.getColumnModel().getColumn(6).setPreferredWidth(325);
        return TabelaAgendamentos;
    }

    public void setTabelaAgendamentos(JTable TabelaAgendamentos) {
        this.TabelaAgendamentos = TabelaAgendamentos;
    }

    public JComboBox<String> getjComboBoxCliente() {
        return jComboBoxCliente;
    }

    public void setjComboBoxCliente(JComboBox<String> jComboBoxCliente) {
        this.jComboBoxCliente = jComboBoxCliente;
    }

    public JComboBox<String> getjComboBoxServico() {
        return jComboBoxServico;
    }

    public void setjComboBoxServico(JComboBox<String> jComboBoxServico) {
        this.jComboBoxServico = jComboBoxServico;
    }

    public JTextField getTextValor() {
        return TextValor;
    }

    public void setTextValor(JTextField TextValor) {
        this.TextValor = TextValor;
    }

    public JLabel getLabelData() {
        return LabelData;
    }

    public void setLabelData(JLabel LabelData) {
        this.LabelData = LabelData;
    }

    public JLabel getLabelHora() {
        return LabelHora;
    }

    public void setLabelHora(JLabel LabelHora) {
        this.LabelHora = LabelHora;
    }

    public JLabel getLabelObservacao() {
        return LabelObservacao;
    }

    public void setLabelObservacao(JLabel LabelObservacao) {
        this.LabelObservacao = LabelObservacao;
    }

    public JTextField getTextId() {
        return TextId;
    }

    public void setTextId(JTextField TextId) {
        this.TextId = TextId;
    }

    public JFormattedTextField getTextFormatedData() {
        return TextFormatedData;
    }

    public void setTextFormatedData(JFormattedTextField TextFormatedData) {
        this.TextFormatedData = TextFormatedData;
    }

    public JFormattedTextField getTextFormatedHora() {
        return TextFormatedHora;
    }

    public void setTextFormatedHora(JFormattedTextField TextFormatedHora) {
        this.TextFormatedHora = TextFormatedHora;
    }

    public JTextArea getTextObservacao() {
        return TextObservacao;
    }

    public void setTextObservacao(JTextArea TextObservacao) {
        this.TextObservacao = TextObservacao;
    }

    public JLabel getjLabelUsuario() {
        return jLabelUsuario;
    }

    public void setjLabelUsuario(JLabel jLabelUsuario) {
        this.jLabelUsuario = jLabelUsuario;
    }  
}
