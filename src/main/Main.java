package main;

import java.util.Scanner;
import models.*;
import services.Cocina;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pedir nombre del cliente
        System.out.print("Ingrese su nombre: ");
        String nombreCliente = sc.nextLine();
        Cliente cliente = new Cliente(nombreCliente);

        Cajero cajero = new Cajero("Juan");
        Cocina cocina = new Cocina();
        Menu menu = new Menu();

        // Mostrar menú
        menu.mostrarMenu();

        // Crear pedido
        Pedido pedido = cajero.recibirPedido();

        String respuesta;
        do {
            System.out.print("\nIngrese el nombre del producto: ");
            String nombreProducto = sc.nextLine();

            Producto elegido = menu.obtenerProducto(nombreProducto);
            if (elegido != null) {
                pedido.agregarProducto(elegido);
                System.out.println("Producto agregado: " + elegido.getNombre());
            } else {
                System.out.println("Ese producto no existe en el menú.");
            }

            System.out.print("¿Desea agregar más productos? (Y/N): ");
            respuesta = sc.nextLine();
        } while (respuesta.equalsIgnoreCase("Y"));

        // Enviar pedido a cocina
        cajero.enviarACocina(pedido, cocina);
        cajero.notificarCliente();

        sc.close();
    }
}
