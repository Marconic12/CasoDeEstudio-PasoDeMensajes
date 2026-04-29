package models;

import java.util.ArrayList;

public class Pedido
{
    private ArrayList<Producto> productos;
    private String estado;

    public Pedido()
    {
        estado = "";
        productos = new ArrayList<Producto>();

    }

    public Pedido(String estado)
    {
        this.estado = estado;
        productos = new ArrayList<Producto>();
    }


    public double calcularTotal() {
        double total = 0;
        for (Producto p : productos) {
            total += p.getPrecio();
        }
        return total;
    }

    public void agregarProducto(Producto p)
    {
        productos.add(p);
    }

    public void cambiarEstado(String e)
    {
        this.estado = e;
    }

    public String getEstado() {
        return estado;
    }
}
