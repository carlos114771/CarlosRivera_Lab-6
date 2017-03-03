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
    Empleado empleado;

    public Ordenes() {
    }

    public Ordenes(int cantidad, Empleado empleado) {
        this.cantidad = cantidad;
        this.empleado = empleado;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Empleado getEmpleado() {
        return empleado;
    }

    public void setEmpleado(Empleado empleado) {
        this.empleado = empleado;
    }

    @Override
    public String toString() {
        return "Ordenes{" + "cantidad=" + cantidad + ", empleado=" + empleado + '}';
    }

}
