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
public class AdminGatos {

    ArrayList<Gato> listagato = new ArrayList();
    File archivo = null;

    public AdminGatos(String path) {
        archivo = new File(path);
    }

    public ArrayList<Gato> getListagato() {
        return listagato;
    }

    public void setListagato(ArrayList<Gato> listagato) {
        this.listagato = listagato;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaGato" + listagato;
    }

    public void escribirArchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
//        double peso, double altura, double precio
        try {
            fw = new FileWriter(archivo);
            bw = new BufferedWriter(fw);
            for (Gato gato : listagato) {
                bw.write(gato.getPeso() + ";");
                bw.write(gato.getAltura() + ";");
                bw.write(gato.getPrecio() + ";");
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
        listagato = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                listagato.add(new Gato(sc.nextDouble(), sc.nextDouble(), sc.nextDouble()));
            }
        } catch (Exception e) {
        } finally {
            sc.close();
        }
    }

}
