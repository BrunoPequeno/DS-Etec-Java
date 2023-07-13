package Aleatorios;

public class Contas{

    public static void main(String[] args) {
        // Declaracao e inicializacao de variaveis
        float contas  = 54f;
        double boletos = -4.5;

        // Várias operacoes com variaveis
        System.out.println("Resto de contas por boletos = " + (contas % boletos));
        System.out.println("Contas dividida pelos boletos =" + (contas/boletos));
        System.out.println("Inteiro de contas por boletos = " + (int) (contas/boletos));
        System.out.println("X + 1 = " + (++ boletos));
    }
}