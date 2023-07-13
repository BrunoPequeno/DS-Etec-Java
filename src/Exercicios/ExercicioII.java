package Exercicios;

import java.util.*;
public class ExercicioII {
    public static void main(String[] args) {
        String nome, musica, filme, esporte, lazer;
        int idade;
        Scanner sc;

        try{
            System.out.println("Digite seu nome: ");
            sc = new Scanner (System.in);
            nome = sc.nextLine();

            System.out.println("Digite sua idade: ");
            sc = new Scanner (System.in);
            idade = sc.nextInt();

            System.out.println("Digite sua música: ");
            sc = new Scanner (System.in);
            musica = sc.nextLine();

            System.out.println("Digite seu filme: ");
            sc = new Scanner (System.in);
            filme = sc.nextLine();

            System.out.println("Digite seu esporte: ");
            sc = new Scanner (System.in);
            esporte = sc.nextLine();

            System.out.println("Digite seu lazer favorito: ");
            sc = new Scanner (System.in);
            lazer = sc.nextLine();

            System.out.println("Seu nome: " + nome);
            System.out.println("Sua idade nome: " + idade);
            System.out.println("Música do momento: " + musica);
            System.out.println("Esporte preferido: " + esporte);
            System.out.println("Lazer favorito: " + lazer);
            System.out.println("Filme favorito: " + filme);

        }
        catch(NumberFormatException e){
            System.out.println("Dados incorretos!");
        }
    }
}
