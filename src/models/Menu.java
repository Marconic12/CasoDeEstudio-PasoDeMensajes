package models;

import java.util.HashMap;
import java.util.Map;

public class Menu {
    private Map<String, Producto> menu; 
    public Menu() {
        menu = new HashMap<>();
        menu.put("Hamburguesa", new Producto("Hamburguesa", 5.0));
        menu.put("Refresco", new Producto("Refresco", 1.5));
        menu.put("Pizza", new Producto("Pizza", 7.0));
        menu.put("Papas Fritas", new Producto("Papas Fritas", 2.0));
        menu.put("Helado", new Producto("Helado", 3.0));
    }

    public void mostrarMenu() {
        System.out.println("Menú disponible:");
        for (Map.Entry<String, Producto> entry : menu.entrySet()) {
            Producto valor = entry.getValue();
            System.out.println(entry.getKey() + " cuesta C$" + valor.getPrecio());
        }
    }

    
    public Producto obtenerProducto(String nombre) {
        return menu.get(nombre);
    }
}
