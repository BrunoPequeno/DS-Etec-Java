package Heranca.JOptionPane;

import javax.swing.*;

public class PessoaPolimorfa {
    public static void main(String[] args) {
        Pessoa pessoa = null;

        int tipo = Integer.parseInt(JOptionPane.showInputDialog("Forneca um numero de 1 a 4: "));
        switch(tipo){
            case 1:
                pessoa = new Pessoa(); break;

            case 2:
                pessoa = new PessoaFisica(); break;

            case 3:
                pessoa = new PessoaJuridica(); break;

            case 4:
                pessoa = new Funcionario(); break;

            default:{
                System.out.println("tipo desconhecido");
                System.exit(0);
            }
        }
        pessoa.mostrarClasse();
    }
}
