package Exercicios;

import java.util.Scanner;

public class ExercicioIV {
    public static void main(String[] args) {
        long gCelsius, fahrenheit;
        Scanner sc;

        try {
            System.out.println("Digite a temperatura em graus celsius: ");
            sc = new Scanner(System.in);
            gCelsius = sc.nextLong();

            fahrenheit = gCelsius * 9 / 5 + 32;

            System.out.println("A temperatura convertida para fahrenheit é:  " + fahrenheit);


        } catch (NumberFormatException e) {
            System.out.println("Dados incorretos!");
        }
    }
}
