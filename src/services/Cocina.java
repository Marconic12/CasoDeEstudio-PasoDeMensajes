package services;

import models.Pedido;

public class Cocina
{
    public Cocina()
    {

    }

    public void prepararPedido(Pedido pedido)
    {
        pedido.cambiarEstado("En preparacion");
        System.out.println(pedido.getEstado());
        for(int i = 10; i > 0; i--)
        {
            System.out.println("Preparandose en " + i + "!");
            try {
                Thread.sleep(1000); // espera 1 segundo
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        pedido.cambiarEstado("Listo");
        System.out.println(pedido.getEstado());
    }
}
