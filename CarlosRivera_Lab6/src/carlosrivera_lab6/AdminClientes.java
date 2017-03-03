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
public class AdminClientes {

    ArrayList<Cliente> listacliente = new ArrayList();
    File archivo = null;

    public AdminClientes(String path) {
        archivo = new File(path);
    }

    public ArrayList<Cliente> getListaCliente() {
        return listacliente;
    }

    public void setListaCleinte(ArrayList<Cliente> listacliente) {
        this.listacliente = listacliente;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    @Override
    public String toString() {
        return "listaCleinte" + listacliente;
    }

    public void setClientes(Cliente e) {
        this.listacliente.add(e);
    }

    public void escribirArchivo() {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (Cliente cliente : listacliente) {
                bw.write(cliente.getTicket() + ";");
                bw.write(cliente.getDinero() + ";");
                bw.write(cliente.getEdad() + ";");
                bw.write(cliente.getId() + ";");
                bw.write(cliente.getNacionalidad() + ";");
                bw.write(cliente.getLugar_nacimiento() + ";");
                bw.write(cliente.getNombre() + ";");
                bw.write(cliente.getColor_piel() + ";");
                bw.write(cliente.getArbol_genealogico() + ";");

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
        listacliente = new ArrayList();
        try {
            sc = new Scanner(archivo);
            sc.useDelimiter(";");
            while (sc.hasNext()) {
                listacliente.add(new Cliente(sc.nextInt(), 
                        sc.nextDouble(), sc.nextInt(), sc.nextInt(), 
                        sc.next(), sc.next(), sc.next(), Color.BLACK, null));

            }
        } catch (Exception e) {
        } finally {
            sc.close();
        }
    }

}
