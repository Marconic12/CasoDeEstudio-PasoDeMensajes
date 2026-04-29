package main;

import models.Cajero;
import models.Cliente;
import models.Menu;
import services.Cocina;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese su nombre: ");
        String nombreCliente = sc.nextLine();
        Cliente cliente = new Cliente(nombreCliente);

        Cajero cajero = new Cajero("Juan");
        Cocina cocina = new Cocina();
        Menu menu = new Menu();


        menu.mostrarMenu();


        cliente.hacerPedido(cajero, cocina, menu);


        sc.close();
    }
}
