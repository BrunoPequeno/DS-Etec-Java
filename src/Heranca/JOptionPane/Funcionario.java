package Heranca.JOptionPane;

import javax.swing.*;

public class Funcionario extends PessoaFisica{
    private String cartao;
    public void setCartao(String cartao){
        this.cartao = cartao;
    }
    public String getCartao(){
        return(cartao);
    }
    public void mostrarClasse(){
        JOptionPane.showMessageDialog(null,"Tipo Funcionário selecionado!");
    }
}
