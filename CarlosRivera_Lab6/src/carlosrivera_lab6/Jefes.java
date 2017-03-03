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
public class Jefes extends Persona {

    String seccion_trabajo;
    ArrayList<Empleado> lista_empleados = new ArrayList();
    int clientes_atendidos;
    double ganacias;

    public Jefes() {
        super();
    }

    public Jefes(String seccion_trabajo, int clientes_atendidos, double ganacias,
            int edad, int id, String nacionalidad, String lugar_nacimiento,
            String nombre, Color color_piel, DefaultTreeModel arbol_genealogico) {
        super(edad, id, nacionalidad, lugar_nacimiento, nombre, color_piel, arbol_genealogico);
        this.seccion_trabajo = seccion_trabajo;
        this.clientes_atendidos = clientes_atendidos;
        this.ganacias = ganacias;
    }

 
   

    public String getSeccion_trabajo() {
        return seccion_trabajo;
    }

    public void setSeccion_trabajo(String seccion_trabajo) {
        this.seccion_trabajo = seccion_trabajo;
    }

    public ArrayList<Empleado> getLista_empleados() {
        return lista_empleados;
    }

    public void setLista_empleados(ArrayList<Empleado> lista_empleados) {
        this.lista_empleados = lista_empleados;
    }

    public int getClientes_atendidos() {
        return clientes_atendidos;
    }

    public void setClientes_atendidos(int clientes_atendidos) {
        this.clientes_atendidos = clientes_atendidos;
    }

    public double getGanacias() {
        return ganacias;
    }

    public void setGanacias(double ganacias) {
        this.ganacias = ganacias;
    }

    @Override
    public String toString() {
        return super.toString() + "Jefes{" + "seccion_trabajo=" + seccion_trabajo + ", lista_empleados=" + lista_empleados + ", clientes_atendidos=" + clientes_atendidos + ", ganacias=" + ganacias + '}';
    }

}
