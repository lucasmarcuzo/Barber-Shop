package Controller;

import Controller.Helper.LoginHelper;
import Model.DAO.UsuarioDAO;
import View.Login;
import Model.Usuario;
import View.MenuPrincipal;

//@author lucasMarcuzo

public class LoginController {

    private final Login view;
    private LoginHelper helper;

    public LoginController(Login view) {
        this.view = view;
        this.helper = new LoginHelper(view);
    }
    
    public void entrarNoSistema(){
        //Pegar um Usuário da View
        Usuario usuario = helper.obterModelo();

        //Pesquisa Usuario no BD
        UsuarioDAO usuarioDAO = new UsuarioDAO();
        Usuario usuarioAutenticado = usuarioDAO.selectPorNomeESenha(usuario);
        
        //Se o usuario da view tiver o mesmo usuario e senha que o usuario vindo do banco direcionar para o menu
        //Senão mostrar uma mensagem ao usuario "Usuario ou Senha inválidos".
        if(usuarioAutenticado != null)
        {
            MenuPrincipal menu = new MenuPrincipal();
            menu.getjLabelUsuario().setText("💈 " + menu.getjLabelUsuario().getText() + usuario.getNome() + "! 💈");
            menu.setVisible(true);
            this.view.dispose();
        }
        else
        {
            view.exibeMensagem("Usuário ou Senha Inválidos!");
        }  
    } 
}
