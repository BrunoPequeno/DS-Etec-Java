package Heranca.JOptionPane;

import javax.swing.*;

public class Pessoa {
    private String nome;
    public void setNome(String nome){
        this.nome = nome;
    }
    public String getNome(){
        return (nome);
    }
    public void mostrarClasse(){
        JOptionPane.showMessageDialog(null,"Tipo Pessoa selecionada!");
    }
}
