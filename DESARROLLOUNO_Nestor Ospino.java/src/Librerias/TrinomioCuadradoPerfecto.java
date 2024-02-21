package Librerias;

public class TrinomioCuadradoPerfecto {

    // Método para verificar si un trinomio es cuadrado perfecto
    public static boolean esCuadradoPerfecto(double a, double b, double c) {
        double discriminante = b * b - 4 * a * c;

        return discriminante == 0;
    }

    // Método para completar el cuadrado de un trinomio cuadrado perfecto
    public static void completarCuadrado(double a, double b, double c) {
        if (esCuadradoPerfecto(a, b, c)) {
            System.out.println("El trinomio es un cuadrado perfecto.");

            // Fórmula para completar el cuadrado y mostrar los resultados
            double terminoConstante = c - (b * b) / (4 * a);
            double valorDeC = (b / (2 * a)) * (b / (2 * a));

            System.out.println("Termino constante después de completar el cuadrado: " + terminoConstante);
            System.out.println("Valor de c después de completar el cuadrado: " + valorDeC);
        } else {
            System.out.println("El trinomio no es un cuadrado perfecto.");
        }
    }
}