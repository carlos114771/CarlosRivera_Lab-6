/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab6;

import java.awt.Color;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Usuario Dell
 */
public class Empleado extends Persona {

    String seccion_trabajo;
    String hora_entrado;
    String hora_salida;
    double sueldo;
    String estado;

    public Empleado() {
        super();
    }

    public Empleado(String seccion_trabajo, String hora_entrado, String hora_salida,
            double sueldo, String estado, int edad, int id, String nacionalidad,
            String lugar_nacimiento, String nombre, Color color_piel, DefaultTreeModel arbol_genealogico) {
        super(edad, id, nacionalidad, lugar_nacimiento, nombre, color_piel, arbol_genealogico);
        this.seccion_trabajo = seccion_trabajo;
        this.hora_entrado = hora_entrado;
        this.hora_salida = hora_salida;
        this.sueldo = sueldo;
        this.estado = estado;
    }

    public String getSeccion_trabajo() {
        return seccion_trabajo;
    }

    public void setSeccion_trabajo(String seccion_trabajo) {
        this.seccion_trabajo = seccion_trabajo;
    }

    public String getHora_entrado() {
        return hora_entrado;
    }

    public void setHora_entrado(String hora_entrado) {
        this.hora_entrado = hora_entrado;
    }

    public String getHora_salida() {
        return hora_salida;
    }

    public void setHora_salida(String hora_salida) {
        this.hora_salida = hora_salida;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return super.toString();
//        return super.toString() + "Empleado{" + "seccion_trabajo="
//                + seccion_trabajo + ", hora_entrado=" + hora_entrado + ","
//                + " hora_salida=" + hora_salida + ", sueldo=" + sueldo + ", estado=" + estado + '}';
    }

}
