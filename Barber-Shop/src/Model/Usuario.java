package Model;

import lombok.Getter;
import lombok.Setter;

//@author lucasMarcuzo
public class Usuario extends Pessoa{
    
    @Getter @Setter protected String senha;
    @Getter @Setter protected String nivelAcesso;

    public Usuario(int id, String nome, String senha) {
        super(id, nome);
        this.senha = senha;
    }

    public Usuario(int id, String nome, char sexo, String dataNascimento, String telefone, String email, String rg, String senha, String nivelAcesso) {
        super(id, nome, sexo, dataNascimento, telefone, email, rg);
        this.senha = senha;
        this.nivelAcesso = nivelAcesso;
    }

//    public String getSenha() {
//        return senha;
//    }
//
//    public void setSenha(String senha) {
//        this.senha = senha;
//    }
//
//    public String getNivelAcesso() {
//        return nivelAcesso;
//    }
//
//    public void setNivelAcesso(String nivelAcesso) {
//        this.nivelAcesso = nivelAcesso;
//    }
//
//    @Override
//    public String getNome() {
//        return nome;
//    }

    
    
}
