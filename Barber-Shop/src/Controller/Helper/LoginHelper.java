package Controller.Helper;

import View.Login;
import Model.Usuario;

//@author lucasMarcuzo
public class LoginHelper implements IHelper{
    
    private final Login view;

    public LoginHelper(Login view) {
        this.view = view;
    }
    
    @Override
    public Usuario obterModelo(){
        String nome = view.getTextUsuario().getText();
        String senha = new String(view.getTextSenha().getPassword());
        Usuario modelo = new Usuario(0, nome, senha);
        return modelo;
    }
    
    public void setarModelo(Usuario modelo){
        String nome = modelo.getNome();
        String senha = modelo.getSenha();
        
        view.getTextUsuario().setText(nome);
        view.getTextSenha().setText(senha);
    }
    
    @Override
    public void limparTela(){
        view.getTextUsuario().setText("");
        view.getTextSenha().setText("");
    }
    
}
