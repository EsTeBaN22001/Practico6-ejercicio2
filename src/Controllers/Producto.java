package Controllers;

public class Producto{

    private int codigo;
    private String descripcion;
    private double precio;
    private String categoria;
    private int stock;

    // Constructor
    public Producto(int codigo, String descripcion, double precio, String categoria, int stock){
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.categoria = categoria;
        this.stock = stock;
    }

    // Getters and Setters
    public int getCodigo(){
        return codigo;
    }

    public String getDescripcion(){
        return descripcion;
    }

    public double getPrecio(){
        return precio;
    }

    public String getCategoria(){
        return categoria;
    }

    public int getStock(){
        return stock;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public void setPrecio(double precio){
        this.precio = precio;
    }

    // toString (útil para debugging)
    @Override
    public String toString(){
        return "Producto{"
          + "codigo=" + codigo
          + ", descripcion='" + descripcion + '\''
          + ", precio=" + precio
          + ", categoria='" + categoria + '\''
          + ", stock=" + stock
          + '}';
    }
}
