package Sobrecarga;

public class AreaComSobrecarga {
    public static int main(String[] args) {
        try {
        System.out.println("Area de um quadrado..." + CalcularArea(10));
        System.out.println("Area de um quadrado..." + CalcularArea(7, 8));
        System.out.println("Area de um quadrado..." + CalcularArea(5, 6, 2));
        System.out.println("Area de um quadrado..." + CalcularArea(5, 6, 2, 8));

        }catch (Exception e){
            System.out.println("Dados incorretos!");
        }
        return 0;
    }
        private static double CalcularArea( ){
            return 0;
        }
        private static double CalcularArea(int a){
            return a * a;
        }
        public static double CalcularArea(int a, int b){
            return a * b;
        }
        public static double CalcularArea(int a, int b, int c){
            return a * b * c;
        }
        public static double CalcularArea(int a, int b, int c, int d){
            return a * b * c - d;
        }
    }
