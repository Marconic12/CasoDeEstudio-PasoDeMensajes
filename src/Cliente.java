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


    public void hacerPedido(Cajero cajero, Cocina cocina,String nombre,double precio)
    {
        System.out.println(nombre + "hizo un pedido");
        Producto p = new Producto(nombre,precio);
        Pedido pedido = cajero.recibirPedido();
        pedido.agregarProducto(p);
    }
}

