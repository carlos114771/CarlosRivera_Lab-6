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
public class AdminJefe {

    ArrayList<Jefes> listajefe = new ArrayList();
    File archivo = null;

    public AdminJefe(String path) {
        archivo = new File(path);
    }

    public ArrayList<Jefes> getListaJefes() {
        return listajefe;
    }

    public void setLisaJefes(ArrayList<Jefes> listempleado) {
        this.listajefe = listempleado;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaJefes" + listajefe;
    }

    public void setJefes(Jefes e) {
        this.listajefe.add(e);
    }

    public void escribirArchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Jefes jefe : listajefe) {
                bw.write(jefe.getSeccion_trabajo() + ";");
                bw.write(jefe.getClientes_atendidos() + ";");
                bw.write(jefe.getGanacias() + ";");
                bw.write(jefe.getEdad() + ";");
                bw.write(jefe.getId() + ";");
                bw.write(jefe.getEdad() + ";");
                bw.write(jefe.getNacionalidad() + ";");
                bw.write(jefe.getLugar_nacimiento() + ";");
                bw.write(jefe.getColor_piel() + ";");
                bw.write(jefe.getArbol_genealogico() + ";");

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
        listajefe = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                listajefe.add(new Jefes(sc.next(), sc.nextInt(),
                        sc.nextDouble(), sc.nextInt(), sc.nextInt(),
                        sc.next(), sc.next(), sc.next(), Color.BLACK, null));
            }
        } catch (Exception e) {
        } finally {
            sc.close();
        }
    }
}
