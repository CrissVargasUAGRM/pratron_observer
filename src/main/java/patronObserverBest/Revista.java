/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronObserverBest;

import java.util.ArrayList;


/**
 *
 * @author Christian Vargas
 */
public class Revista extends Subject{
    public String titulo;
    public String categoria;

    public Revista() {
        this.titulo = "sin titulo";
        this.categoria = "sin categoria";
    }

    public Revista(String categoria) {
        this.titulo = "sin titulo";
        this.categoria = categoria;
    }

    public Revista(String titulo, String categoria) {
        this.titulo = titulo;
        this.categoria = categoria;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
        this.notifica();
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Revista{" + "titulo=" + getTitulo() + ", categoria=" + getCategoria() + '}';
    }
    
    public void imprimir(){
        ArrayList<Observer> lista = this.listar();
        System.out.println(lista.size());
        for (int i = 0; i < lista.size(); i++) {
            System.out.println(lista.get(i).toString());
        }
    }
}
