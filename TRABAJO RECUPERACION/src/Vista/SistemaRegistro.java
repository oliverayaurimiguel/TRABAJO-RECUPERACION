package Vista;

import Controlador.GestionLenguaje;
import java.util.Scanner;

public class SistemaRegistro {
    private GestionLenguaje gestionLenguaje;

    public SistemaRegistro() {
        gestionLenguaje = new GestionLenguaje();
    }

    public static void main(String[] args) {
        SistemaRegistro sistemaRegistro = new SistemaRegistro();
        sistemaRegistro.menu();
    }

    public void menu() {
        int opcion;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("\nMenu de Lenguajes de Programacion:");
            System.out.println("1. Agregar lenguaje");
            System.out.println("2. Buscar lenguaje");
            System.out.println("3. Eliminar lenguaje");
            System.out.println("4. Imprimir lenguajes");
            System.out.println("0. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir el salto de línea

            switch (opcion) {
                case 1:
                    gestionLenguaje.agregarLenguaje();
                    break;
                case 2:
                    gestionLenguaje.buscarLenguaje();
                    break;
                case 3:
                    gestionLenguaje.eliminarLenguaje();
                    break;
                case 4:
                    gestionLenguaje.imprimirLenguajes();
                    break;
                case 0:
                    System.out.println("Saliendo del sistema...");
                    break;
                default:
                    System.out.println("Opcion invalida.");
            }
        } while (opcion != 0);
        scanner.close();
    }
}