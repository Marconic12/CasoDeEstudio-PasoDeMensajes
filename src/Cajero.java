public class Cajero
{
    private String nombre;

    public Cajero()
    {

    }

    public Cajero(String nombre)
    {
        this.nombre = nombre;
    }

    public Pedido recibirPedido()
    {
        return new Pedido();
    }

    public void enviarACocina(Pedido pedido, Cocina cocina)
    {
        cocina.prepararPedido(pedido);

    }

    public void notificarCliente()
    {

    }
}

