package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.Getter;
import lombok.Setter;

//@author lucasMarcuzo

public class Agendamento {
    
    @Getter @Setter private int id;
    @Getter @Setter private Cliente cliente;
    @Getter @Setter private Servico servico;
    @Getter @Setter private float valor;
    @Getter @Setter private Date data;
    @Getter @Setter private String observacao;

    public Agendamento(int id, Cliente cliente, Servico servico, float valor, String data) {
        this.id = id;
        this.cliente = cliente;
        this.servico = servico;
        this.valor = valor;
        try {
            this.data = new SimpleDateFormat("dd/MM/yyyy HH:mm").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Agendamento(int id, Cliente cliente, Servico servico, float valor, String data, String observacao) {
        this(id,cliente,servico,valor,data);
        this.observacao = observacao;
    }

//    public Agendamento() {
//        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public Cliente getCliente() {
//        return cliente;
//    }
//
//    public void setCliente(Cliente cliente) {
//        this.cliente = cliente;
//    }
//
//    public Servico getServico() {
//        return servico;
//    }
//
//    public void setServico(Servico servico) {
//        this.servico = servico;
//    }
//
//    public float getValor() {
//        return valor;
//    }
//
//    public void setValor(float valor) {
//        this.valor = valor;
//    }
//
//    public Date getData() {
//        return data;
//    }
    
    public String getDataFormatada(){
        return new SimpleDateFormat("dd/MM/yyyy").format(data);
    }
    
    public String getHoraFormatada(){
        return new SimpleDateFormat("HH:mm").format(data);
    }

//    public void setData(Date data) {
//        this.data = data;
//    }
//
//    public String getObservacao() {
//        return observacao;
//    }
//
//    public void setObservacao(String observacao) {
//        this.observacao = observacao;
//    }
    
    
    
}
