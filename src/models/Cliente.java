package models;

import services.Cocina;

import java.util.Scanner;

public class Cliente
{
    private String nombre;


    public Cliente()
    {

    }

    public Cliente(String nombre)
    {
        this.nombre = nombre;
    }


    public void hacerPedido(Cajero cajero, Cocina cocina) {

        System.out.println(nombre + " esta haciendo un pedido");
        System.out.println("Que producto desea: ");
        Pedido pedido = cajero.recibirPedido();
        String respuesta;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Ingrese el nombre del producto: ");
            String nombreProducto = input.nextLine();
            System.out.println("Ingrese la cantidad a pagar: ");
            double precio = input.nextDouble();
            input.nextLine();
            Producto p = new Producto(nombreProducto, precio);
            pedido.agregarProducto(p);

            System.out.println("Desea agregar mas productos? (Y/N)");
            respuesta = input.nextLine();
        }
        while (respuesta.equalsIgnoreCase("Y"));
    }
}

