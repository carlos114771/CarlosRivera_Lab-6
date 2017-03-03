/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab6;

import java.util.ArrayList;

/**
 *
 * @author Usuario Dell
 */
public class Baleadas extends Articulos_venta {

    ArrayList lista_ingredientes = new ArrayList();

    public Baleadas() {
        super();
    }

    public Baleadas(double precio) {
        super(precio);
    }

    public ArrayList getLista_ingredientes() {
        return lista_ingredientes;
    }

    public void setLista_ingredientes(ArrayList lista_ingredientes) {
        this.lista_ingredientes = lista_ingredientes;
    }

    @Override
    public String toString() {
        return super.toString() + "Baleadas{" + "lista_ingredientes=" + lista_ingredientes + '}';
    }

}
