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
        }
        pedido.cambiarEstado("Listo");
        System.out.println(pedido.getEstado());
    }
}
