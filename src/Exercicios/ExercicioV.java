package Exercicios;

import java.util.Scanner;

public class ExercicioV {
    public static void main(String[] args) {

        long idade;
        Scanner sc;
        float dias;

        try {
            System.out.println("Digite sua idade: ");
            sc = new Scanner(System.in);
            idade = sc.nextLong();

            dias = idade * 365;

            System.out.println("Está aqui quantos dias você já viveu: " + dias);

        } catch (NumberFormatException e) {

        }
    }
}
