/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carlosrivera_lab6;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.tree.DefaultTreeModel;

/**
 *
 * @author Usuario Dell
 */
public class Persona {

    int edad;
    int id;
    String nacionalidad;
    String lugar_nacimiento;
    String nombre;
    Color color_piel;
    DefaultTreeModel arbol_genealogico;
    ArrayList<Familiares> lista_familiar = new ArrayList();

    public Persona() {
    }

    public Persona(int edad, int id, String nacionalidad, String lugar_nacimiento, 
            String nombre, Color color_piel, DefaultTreeModel arbol_genealogico) {
        this.edad = edad;
        this.id = id;
        this.nacionalidad = nacionalidad;
        this.lugar_nacimiento = lugar_nacimiento;
        this.nombre = nombre;
        this.color_piel = color_piel;
        this.arbol_genealogico=this.arbol_genealogico;
    }

   

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getLugar_nacimiento() {
        return lugar_nacimiento;
    }

    public void setLugar_nacimiento(String lugar_nacimiento) {
        this.lugar_nacimiento = lugar_nacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Color getColor_piel() {
        return color_piel;
    }

    public void setColor_piel(Color color_piel) {
        this.color_piel = color_piel;
    }

    public DefaultTreeModel getArbol_genealogico() {
        return arbol_genealogico;
    }

    public void setArbol_genealogico(DefaultTreeModel arbol_genealogico) {
        this.arbol_genealogico = arbol_genealogico;
    }

    public ArrayList<Familiares> getLista_familiar() {
        return lista_familiar;
    }

    public void setLista_familiar(ArrayList<Familiares> lista_familiar) {
        this.lista_familiar = lista_familiar;
    }

    
    @Override
    public String toString() {
        return nombre;
    }

}
