package main;

import views.ClienteView;
import views.VeterinarioView;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ClienteView clienteView = new ClienteView();
        VeterinarioView veterinarioView = new VeterinarioView();

        int opcion;
        do {
            System.out.println("\n== SISTEMA VETERINARIA ==");
            System.out.println("Desarrollado por: Andrea Carolina Quintero Narváez");
            System.out.println("1. Menú Clientes");
            System.out.println("2. Menú Veterinarios");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = entrada.nextInt();
            entrada.nextLine();

            switch (opcion) {
                case 1:
                    clienteView.mostrarMenu();
                    break;
                case 2:
                    veterinarioView.mostrarMenu();
                    break;
                case 3:
                    System.out.println("Gracias por usar el sistema.");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 3);
    }
}
