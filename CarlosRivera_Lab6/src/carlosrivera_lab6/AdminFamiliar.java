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
public class AdminFamiliar {

    ArrayList<Familiares> listafamiliares = new ArrayList();
    File archivo = null;

    public AdminFamiliar(String path) {
        archivo = new File(path);
    }

    public ArrayList<Familiares> getListafamiliares() {
        return listafamiliares;
    }

    public void setListafamiliares(ArrayList<Familiares> listafamiliares) {
        this.listafamiliares = listafamiliares;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaCliente" + listafamiliares;
    }

    public void setFamiliares(Familiares f) {
        this.listafamiliares.add(f);
    }

    public void escribriArchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Familiares familiares : listafamiliares) {
                bw.write(familiares.getEdad() + ";");
                bw.write(familiares.getId() + ";");
                bw.write(familiares.getNacionalidad() + ";");
                bw.write(familiares.getLugar_nacimiento() + ";");
                bw.write(familiares.getNombre() + ";");
                bw.write(familiares.getColor_piel() + ";");
                bw.write(familiares.getPadre() + ";");
            }
            bw.write(";");
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
        listafamiliares = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                listafamiliares.add(new Familiares(sc.nextInt(), sc.nextInt(),
                        sc.next(), sc.next(), sc.next(), Color.black, null));
            }
        } catch (Exception e) {
        }finally{
            try {
                sc.close();
            } catch (Exception e) {
            }
        }

    }
}
