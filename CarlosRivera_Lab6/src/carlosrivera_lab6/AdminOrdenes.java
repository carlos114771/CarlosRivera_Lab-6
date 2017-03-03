/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab6;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario Dell
 */
public class AdminOrdenes {

    ArrayList<Ordenes> listaordenes = new ArrayList();
    File archivo = null;

    public AdminOrdenes(String path) {
        archivo = new File(path);

    }

    public ArrayList<Ordenes> getListaordenes() {
        return listaordenes;
    }

    public void setListaordenes(ArrayList<Ordenes> listaordenes) {
        this.listaordenes = listaordenes;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaordenes" + listaordenes;
    }

    public void setOrdenes(Ordenes o) {
        this.listaordenes.add(o);
    }

    public void escribirArchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Ordenes orden : listaordenes) {
                bw.write(orden.getCantidad() + ";");
                bw.write(orden.getEmpleado() + ";");
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
        listaordenes = new ArrayList();

        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                listaordenes.add(new Ordenes(sc.nextInt(), null));
            }
        } catch (Exception e) {
        } finally {
            sc.close();
        }
    }
}
