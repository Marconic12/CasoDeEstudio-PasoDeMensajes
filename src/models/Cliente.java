package models;

import services.Cocina;
import java.util.Scanner;

public class Cliente {
    private String nombre;

    public Cliente(String nombre) {
        this.nombre = nombre;
    }

    public void hacerPedido(Cajero cajero, Cocina cocina, Menu menu) {
        System.out.println(nombre + " está haciendo un pedido");

        Pedido pedido = cajero.recibirPedido();
        Scanner input = new Scanner(System.in);
        String respuesta;

        do {
            System.out.print("Ingrese el nombre del producto: ");
            String nombreProducto = input.nextLine();


            Producto elegido = menu.obtenerProducto(nombreProducto);
            if (elegido != null) {
                pedido.agregarProducto(elegido);
                System.out.println("Producto agregado: " + elegido.getNombre());
            } else {
                System.out.println("Ese producto no existe en el menú.");
            }

            System.out.print("¿Desea agregar más productos? (Y/N): ");
            respuesta = input.nextLine();

            while (!respuesta.equalsIgnoreCase("Y") && !respuesta.equalsIgnoreCase("N"))
            {
                System.out.print("Entrada inválida. Escriba Y o N: ");
                respuesta = input.nextLine();
            }
        } while (respuesta.equalsIgnoreCase("Y"));

        // Enviar pedido a cocina
        cajero.enviarACocina(pedido, cocina);
        cajero.notificarCliente();
        System.out.println("El total de su pedido es: C$" + pedido.calcularTotal());
    }
}
