import java.util.Scanner;

public class Calificacion {

    static String Nombre;
    static int[] array_calificaciones = new int[5];
    static Scanner input = new Scanner(System.in);


    public static double calcular_promedio(int[] array_calificaciones) {
        double suma = 0;

        for (int i = 0; i < array_calificaciones.length; i++) {
            array_calificaciones[i] = input.nextInt();

        }
        for (int i = 0; i < array_calificaciones.length; i++) {
            suma = suma + array_calificaciones[i];

        }
        double promedio = suma / array_calificaciones.length;

        return promedio;
    }

    public static char calificacion_final(double promedio) {
        char char_letra;

        if (promedio >= 91) {
            char_letra = 'A';
        } else if (promedio >= 81) {
            char_letra = 'B';
        } else if (promedio >= 71) {
            char_letra = 'C';
        } else if (promedio >= 61) {
            char_letra = 'D';
        } else if (promedio >= 51) {
            char_letra = 'E';
        } else {
            char_letra = 'F';
        }
        return char_letra;
    }

    public static void imprimir_resultados(String nombre, double promedio, char calificacion) {

        System.out.println("Nombre del estudiante: " + nombre);
        for (int i = 0; i < array_calificaciones.length; i++) {
            System.out.println("Calificacion " + (i + 1) + ": " + array_calificaciones[i]);

        }
        System.out.println("Promedio: " + promedio);
        System.out.print("Calificacion: " + calificacion);

    }

    public static void main(String[] args) {

        System.out.println("Introduce las calificaciones del alumno:");
        double promedio = calcular_promedio(array_calificaciones);
        imprimir_resultados("Melissa", promedio, calificacion_final(promedio));

    }
}
