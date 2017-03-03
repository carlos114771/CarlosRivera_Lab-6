/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab6;

/**
 *
 * @author Usuario Dell
 */
public class Articulos_venta {
    double precio;

    public Articulos_venta() {
    }

    public Articulos_venta(double precio) {
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Articulos_venta{" + "precio=" + precio + '}';
    }
    
}
