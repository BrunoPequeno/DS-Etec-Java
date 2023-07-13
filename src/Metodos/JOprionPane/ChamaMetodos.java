package Metodos.JOprionPane;

import javax.swing.*;

public class ChamaMetodos {
    public static void main(String[] args) {
        //Solicitação de Dados
        String nomePessoa = EntradaDeDadosComMetodos.lerString("Forneca seu nome: ");
        int idadeUsuario = EntradaDeDadosComMetodos.LerNumeroInt(0, 120, "Forneca sua idade: ");
        double pesoUsuario = EntradaDeDadosComMetodos.LerNumeroDouble(0, 300, "Forneca seu peso: ");
        char opicao = EntradaDeDadosComMetodos.selecionarOpcao("Voce gosta de Java");

        //Exibição dos dados
        JOptionPane.showMessageDialog(null, "Nome: " + nomePessoa + "\nIdade: " + idadeUsuario + "\nAltura: " + "\nPeso: " + pesoUsuario + "\nOpcao Selecionada: " + opicao);
    }
}
