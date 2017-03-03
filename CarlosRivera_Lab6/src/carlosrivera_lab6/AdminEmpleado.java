/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab6;

import java.awt.Color;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario Dell
 */
public class AdminEmpleado {

    ArrayList<Empleado> listempleado = new ArrayList();
    File archivo = null;

    public AdminEmpleado(String path) {
        archivo = new File(path);
    }

    public ArrayList<Empleado> getListempleado() {
        return listempleado;
    }

    public void setListempleado(ArrayList<Empleado> listempleado) {
        this.listempleado = listempleado;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaEmpleados" + listempleado;
    }

    public void setEmpleado(Empleado e) {
        this.listempleado.add(e);
    }

    public void escribirArchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Empleado empleados : listempleado) {
                bw.write(empleados.getSeccion_trabajo() + ";");
                bw.write(empleados.getHora_entrado() + ";");
                bw.write(empleados.getHora_salida() + ";");
                bw.write(empleados.getSueldo() + ";");
                bw.write(empleados.getEstado() + ";");
                bw.write(empleados.getEdad() + ";");
                bw.write(empleados.getNacionalidad() + ";");
                bw.write(empleados.getLugar_nacimiento() + ";");
                bw.write(empleados.getNombre() + ";");
                bw.write(empleados.getColor_piel() + ";");
                bw.write(empleados.getArbol_genealogico() + ";");
                bw.write(empleados.getId() + ";");
                bw.write(empleados.getSeccion_trabajo() + ";");
            bw.write(";");
            }
            bw.flush();
        } catch (Exception e) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception e) {
            }
        }
    }

    public void cargarArchivo() {
        Scanner sc = null;
        listempleado = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                listempleado.add(new Empleado(sc.next(), sc.next(), sc.next(),
                        sc.nextInt(), sc.next(), sc.nextInt(), sc.nextInt(),
                        sc.next(), sc.next(), sc.next(), Color.BLACK, null));
            }
        } catch (Exception e) {
        } finally {
            sc.close();
        }
    }
}
