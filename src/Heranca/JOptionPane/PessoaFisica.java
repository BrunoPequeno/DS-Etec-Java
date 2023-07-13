package Heranca.JOptionPane;

import javax.swing.*;

public class PessoaFisica extends Pessoa {
    private String rg;
    public void setRg(String rg){
        this.rg = rg;
    }
    public String getRg(){
        return(rg);
    }
    public void mostrarClasse(){
        JOptionPane.showMessageDialog(null,"Pessoa Fisica selecionada!");
    }
}
