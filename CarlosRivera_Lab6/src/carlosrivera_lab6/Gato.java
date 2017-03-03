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
public class Gato extends Articulos_venta {

    double peso;
    double altura;

    public Gato() {
        super();
    }

    public Gato(double peso, double altura, double precio) {
        super(precio);
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public String toString() {
        return super.toString() + "Gato{" + "peso=" + peso + ", altura=" + altura + '}';
    }

}
