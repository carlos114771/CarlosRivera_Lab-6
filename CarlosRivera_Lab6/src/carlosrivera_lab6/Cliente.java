/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab6;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Usuario Dell
 */
public class Cliente extends Persona {

    int ticket;
    double dinero;
    ArrayList<Ordenes> lista_ordenes = new ArrayList();

    public Cliente() {
        super();
    }

    public Cliente(int ticket, double dinero, int edad, int id, String nacionalidad,
            String lugar_nacimiento, String nombre, Color color_piel, DefaultTreeModel arbol_genealogico) {
        super(edad, id, nacionalidad, lugar_nacimiento, nombre, color_piel, arbol_genealogico);
        this.ticket = ticket;
        this.dinero = dinero;
    }

   
   
    public int getTicket() {
        return ticket;
    }

    public void setTicket(int ticket) {
        this.ticket = ticket;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    public ArrayList<Ordenes> getLista_ordenes() {
        return lista_ordenes;
    }

    public void setLista_ordenes(ArrayList<Ordenes> lista_ordenes) {
        this.lista_ordenes = lista_ordenes;
    }

    @Override
    public String toString() {
        return super.toString();
//        return super.toString() + "Cliente{" + "ticket=" + ticket + ", dinero=" + dinero + ", lista_ordenes=" + lista_ordenes + '}';
    }

}
