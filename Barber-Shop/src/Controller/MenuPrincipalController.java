package Controller;

import View.Agenda;
import View.Login;
import View.MenuPrincipal;
//import static java.awt.Frame.MAXIMIZED_BOTH;

// @author lucasMarcuzo
public class MenuPrincipalController {
    
    private final MenuPrincipal view;

    public MenuPrincipalController(MenuPrincipal view) {
        this.view = view;
        //this.view.setExtendedState(MAXIMIZED_BOTH);
    }
    
    public void navegarParaAgenda(){
        this.view.setVisible(false);
        Agenda agenda = new Agenda();
        agenda.setjLabelUsuario(this.view.getjLabelUsuario());
        agenda.setVisible(true);
    }
    
    public void navegarParaLogin(){
        Login login = new Login();
        login.setVisible(true);
    }
   
    
    
    

    
    
    
    
}
