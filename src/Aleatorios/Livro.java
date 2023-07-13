package Aleatorios;

import javax.swing.JOptionPane;
public class Livro {

    public static void main(String[] args){


        char letra = 'B';//Coisas pqeuenas
        byte anos = 19;

        short codPasse = 007 ;/* Fazer comentario
		em duas linhas*/

        float notaRendimento = 9.9f;
        int missoesFeitas = 500;
        long totalMissoes = 10000;
        double taxaGeral = 9.70;
        boolean confianca = true;

        JOptionPane.showMessageDialog(null, "Letra: " + letra + "\n Nota de rendimento: " + notaRendimento + "\n Total de missoes da agencia:  " + totalMissoes + "\n Idade: " + anos + "\n Numero do passe: " + codPasse + "\n Missoes cumpridas do agente: " + missoesFeitas +  "\n Taxa geral: " + taxaGeral + "\n Confiavel: " + confianca);
    }
}