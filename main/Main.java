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
            System.out.println("Desarrollado por:\nAndrea Carolina Quintero Narvaez \n1124851544");
            System.out.println("\n == MENU PRINCIPAL ==");
            System.out.println("1. Menu Clientes");
            System.out.println("2. Menu Veterinarios");
            System.out.println("3. Salir");
            System.out.println("Seleccione una opcion ");
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
                    System.out.println("Bye");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 3);
    }
}
