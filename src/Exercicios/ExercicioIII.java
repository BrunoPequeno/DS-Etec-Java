package Exercicios;

import java.util.*;

public class ExercicioIII {
    public static void main(String[] args) {
        int area, altura, largura;
        Scanner sc;

        try{
            System.out.println("Digite a altura do local: ");
            sc = new Scanner (System.in);
            altura = sc.nextInt();

            System.out.println("Agora a largura do local: ");
            sc = new Scanner (System.in);
            largura = sc.nextInt();

            area = altura * largura;

            System.out.println("A área do local é de: " + area);

        }
        catch(NumberFormatException e){
            System.out.println("Dados incorretos!");
        }
    }
}
