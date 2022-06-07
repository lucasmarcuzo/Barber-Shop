package Controller;

import Controller.Helper.AgendaHelper;
import Model.Agendamento;
import Model.Cliente;
import Model.DAO.AgendamentoDAO;
import Model.DAO.ClienteDAO;
import Model.DAO.ServicoDAO;
import Model.Servico;
import View.Agenda;
import View.MenuPrincipal;
import java.util.ArrayList;
import lombok.Getter;
import lombok.Setter;

//@author lucasMarcuzo
public class AgendaController {
    
    private final Agenda view;
    private final AgendaHelper helper;
    @Getter @Setter private String usuario;

    public AgendaController(Agenda view) {
        this.view = view;
        this.helper = new AgendaHelper(view);
    }
    
    public void navegarParaMenuPrincipal(){
        this.view.setVisible(false);
        MenuPrincipal menu = new MenuPrincipal();
        menu.getjLabelUsuario().setText(this.view.getjLabelUsuario().getText());
        menu.setVisible(true);
    }
    
    public void atualizaTabela(){
        //Buscar Lista com agendamentos no BD.
        AgendamentoDAO agendamentoDAO = new AgendamentoDAO();
        ArrayList<Agendamento> agendamentos = agendamentoDAO.selectAll();
        
        //Exibir lista na View.
        helper.preencherTabela(agendamentos);   
    }
    
    public void atualizaCliente(){
        //Buscar clientes do BD.
        ClienteDAO clienteDAO = new ClienteDAO();
        ArrayList<Cliente> clientes = clienteDAO.selectAll();
        
        //Exibir Clientes no ComboBox Cliente
        helper.preencherClientes(clientes);  
    }
    
    public void atualizaServico(){
        //Buscar servico do BD.
        ServicoDAO servicoDAO = new ServicoDAO();
        ArrayList<Servico> servicos = servicoDAO.selectAll();
        
        //Exibir servicos no ComboBox servico
        helper.preencherServicos(servicos); 
    }
    
    public void atualizaValor(){
        Servico servico = helper.obterServico();
        helper.setarValor(servico.getValor());
    }
    
    public void agendar(){
        //Buscar Objeto Agendamento da Tela.
        Agendamento agendamento = helper.obterModelo();
        //Salvar Objeto no BD.
        new AgendamentoDAO().insert(agendamento);
        //Inserir elemento na tabela.
        this.atualizaTabela();
        helper.limparTela();
    }
    
//    public String getUsuario() {
//        return usuario;
//    }
//
//    public void setUsuario(String usuario) {
//        this.usuario = usuario;
//    }
    
}
