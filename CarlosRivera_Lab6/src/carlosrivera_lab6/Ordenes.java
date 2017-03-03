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
public class Ordenes {
    int cantidad;

    public Ordenes() {
    }

    public Ordenes(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return "Ordenes{" + "cantidad=" + cantidad + '}';
    }
    
}
