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
public class AdminBaleadas {

    ArrayList<Baleadas> listabaleadas = new ArrayList();
    File archivo = null;

    public AdminBaleadas(String path) {
        archivo = new File(path);
    }

    public ArrayList<Baleadas> getListabaleadas() {
        return listabaleadas;
    }

    public void setListabaleadas(ArrayList<Baleadas> listabaleadas) {
        this.listabaleadas = listabaleadas;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "AdminBaleadas{" + "listabaleadas=" + listabaleadas + '}';
    }

    public void setBaleada(Baleadas b) {
        this.listabaleadas.add(b);
    }

    public void escribirArchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Baleadas baleadas : listabaleadas) {
                bw.write(baleadas.getPrecio() + ";");
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
        listabaleadas = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(":");
            while (sc.hasNext()) {
                listabaleadas.add(new Baleadas(sc.nextInt()));
            }
        } catch (Exception e) {
        } finally {
            sc.close();
        }
    }
}
