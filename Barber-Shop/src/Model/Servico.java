package Model;

//@author lucasMarcuzo

import lombok.Getter;
import lombok.Setter;


public class Servico {
    
    @Getter @Setter private int id;
    @Getter @Setter private float valor;
    private String descricao;

    public Servico(int id, String descricao, float valor) {
        this.id = id;
        this.descricao = descricao;
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

//    public void setDescricao(String descricao) {
//        this.descricao = descricao;
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
//    public int getId() {
//        return id;
//    }
//
//    public void setId(int id) {
//        this.id = id;
//    }
    
    @Override
    public String toString() {
        return getDescricao();
    }
}
