// package Models; ← crea esta carpeta si no existe
package Models;

import Controllers.Producto;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class ProductosModel{

    private static ProductosModel instance;

    private Set<Producto> productos;

    private ProductosModel(){
        productos = new TreeSet<>(Comparator.comparing(Producto :: getCodigo));
        productos.add(new Producto(103, "Jabón Dove", 1800.0, "Perfumería", 100));
        productos.add(new Producto(101, "Arroz Gallo", 2500.0, "Comestible", 50));
        productos.add(new Producto(102, "Detergente Mágico", 3200.0, "Limpieza", 30));
    }

    public Producto buscarPorCodigo(int codigo){
        return productos.stream()
          .filter(p -> p.getCodigo() == codigo)
          .findFirst()
          .orElse(null);
    }

    public List<Producto> buscarPorDescripcion(String texto){
        if(texto == null || texto.trim().isEmpty()){
            return new ArrayList<>(productos); // Devuelve todos si está vacío
        }
        String busqueda = texto.toLowerCase().trim();
        return productos.stream()
          .filter(p -> p.getDescripcion().toLowerCase().contains(busqueda))
          .collect(Collectors.toList());
    }

    public List<Producto> buscarPorRangoPrecio(Double precioMin, Double precioMax){
        // Si ambos son null o inválidos, devolver todos
        if((precioMin == null || precioMin < 0) && (precioMax == null || precioMax < 0)){
            return new ArrayList<>(productos);
        }

        return productos.stream()
          .filter(p -> {
              boolean cumpleMin = precioMin == null || precioMin < 0 || p.getPrecio() >= precioMin;
              boolean cumpleMax = precioMax == null || precioMax < 0 || p.getPrecio() <= precioMax;
              return cumpleMin && cumpleMax;
          })
          .collect(Collectors.toList());
    }

    public static ProductosModel getInstance(){
        if(instance == null){
            instance = new ProductosModel();
        }
        return instance;
    }

    public Set<Producto> getProductos(){
        return productos;
    }

    public void agregarProducto(Producto p){
        productos.add(p);
    }

    public void eliminarProducto(Producto p){
        productos.remove(p);
    }

}
