package views;

import controllers.ClienteController;
import java.util.List;
import java.util.Scanner;
import models.Cliente;

public class ClienteView {

    private ClienteController clienteController;
    private Scanner entrada;

    public ClienteView() {
        this.clienteController = new ClienteController();
        this.entrada = new Scanner(System.in);
    }

    public void mostraMenu() {
        int opcion;
        do {            
            System.out.println("\n == MENU CLIENTES ==");
            System.out.println("1. Agregar Cliente");
            System.out.println("2. Mostrar clientes");
            System.out.println("3. Ir al menu principal");
            System.out.println("Seleccione una opcion ");
            opcion = entrada.nextInt();

            entrada.nextLine();

            switch (opcion) {
                case 1:
                    agregarCliente();
                    break;

                case 2:
                    mostrarCliente();
                    break;

                case 3:
                    System.out.println("Bye");
                    break;

                default:
                    System.out.println("Opcion invalida");
            }
        } while (opcion != 3);
    }

    public void agregarCliente() {
        System.out.println("\n == Agregar Cliente ==");
        System.out.println("Nombre: ");
        String nombre = entrada.nextLine();
        System.out.println("Email: ");
        String email = entrada.nextLine();
        System.out.println("Telefono: ");
        String telefono = entrada.nextLine();
        System.out.println("Direccion: ");
        String direccion = entrada.nextLine();

        clienteController.agregarCliente(nombre, email, telefono, direccion);
        System.out.println("Cliente agregado con exito");
    }

    private void mostrarCliente() {
        System.out.println("\n == LISTA DE CLIENTES ==");
        List<Cliente> clientes = clienteController.obtenerCliente();
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes registrados");
        } else {
            for (Cliente cliente : clientes) {
                System.out.println(cliente);
            }
        }
    }

}
