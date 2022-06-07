package Model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import lombok.Getter;
import lombok.Setter;

//@author lucasMarcuzo
public abstract class Pessoa {
    
    @Getter @Setter protected int id;
    @Getter @Setter protected String nome;
    @Getter @Setter protected char sexo;
    @Getter @Setter protected Date dataNascimento;
    @Getter @Setter protected String telefone;
    @Getter @Setter protected String email;
    @Getter @Setter protected String rg;

    public Pessoa(int id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Pessoa(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg) {
        this.id = id;
        this.nome = nome;
        this.sexo = sexo;
        try {
            this.dataNascimento = new SimpleDateFormat("dd/MM/yyyy").parse(dataNascimento);
        } catch (ParseException ex) {
            Logger.getLogger(Agendamento.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.telefone = telefone;
        this.email = email;
        this.rg = rg;
    }

//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
//
//    public String getNome() {
//        return nome;
//    }
//
//    public void setNome(String nome) {
//        this.nome = nome;
//    }
//
//    public char getSexo() {
//        return sexo;
//    }
//
//    public void setSexo(char sexo) {
//        this.sexo = sexo;
//    }
//
//    public Date getDataNascimento() {
//        return dataNascimento;
//    }
//
//    public void setDataNascimento(Date dataNascimento) {
//        this.dataNascimento = dataNascimento;
//    }
//
//    public String getTelefone() {
//        return telefone;
//    }
//
//    public void setTelefone(String telefone) {
//        this.telefone = telefone;
//    }
//
//    public String getEmail() {
//        return email;
//    }
//
//    public void setEmail(String email) {
//        this.email = email;
//    }
//
//    public String getRg() {
//        return rg;
//    }
//
//    public void setRg(String rg) {
//        this.rg = rg;
//    }
    
    
    
}
