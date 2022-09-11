public class Main {
    public static void main(String[] args) {

        // Ejercicio 1
        int resultadoSuma;
        resultadoSuma = sumaTresNumeros(10, 20, 30);
        System.out.println("Suma de los tres numeros: " + resultadoSuma);

        // Ejercicio 2
        Coche miCoche = new Coche();
        miCoche.AnadirPuerta();
        System.out.println("Número de puertas de mi coche: " + miCoche.puertas);
    }

    // Ejercicio 1. Función con tres parámetros.
    public static int sumaTresNumeros(int a, int b, int c) {
        return a + b + c;
    }
}

// Ejercicio 2. Crear clase coche
class Coche {
    public int puertas = 4;

    public void AnadirPuerta() {
        this.puertas++;
    }
}