package View;

// @author LucasMarcuzo

import java.awt.Toolkit;
import javax.swing.JFrame;


public interface IIconePadrao {
    
    //Insere icone Padrão no Fomulário passado.
    default public void inserirIconePadrao(JFrame frm){
        frm.setIconImage(Toolkit.getDefaultToolkit().getImage("src//View//imagens//icons//navalha.jpg"));
    }
}
