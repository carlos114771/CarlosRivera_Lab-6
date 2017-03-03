/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab6;

import java.util.Date;

/**
 *
 * @author Usuario Dell
 */
public class Ventas {

    Cliente nombre_cliente;
    Empleado empleado_cliente;
    int cantidad_objetivos;
    double total;
    Date fecha;

    public Ventas() {
    }

    public Ventas(Cliente nombre_cliente, Empleado empleado_cliente, int cantidad_objetivos, double total, Date fecha) {
        this.nombre_cliente = nombre_cliente;
        this.empleado_cliente = empleado_cliente;
        this.cantidad_objetivos = cantidad_objetivos;
        this.total = total;
        this.fecha = fecha;
    }

    public Cliente getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(Cliente nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public Empleado getEmpleado_cliente() {
        return empleado_cliente;
    }

    public void setEmpleado_cliente(Empleado empleado_cliente) {
        this.empleado_cliente = empleado_cliente;
    }

    public int getCantidad_objetivos() {
        return cantidad_objetivos;
    }

    public void setCantidad_objetivos(int cantidad_objetivos) {
        this.cantidad_objetivos = cantidad_objetivos;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Ventas{" + "nombre_cliente=" + nombre_cliente + ", "
                + "empleado_cliente=" + empleado_cliente + ","
                + " cantidad_objetivos=" + cantidad_objetivos + ","
                + " total=" + total + ", fecha=" + fecha + '}';
    }

}
