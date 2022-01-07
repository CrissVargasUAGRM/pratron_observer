/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronObserver;

/**
 *
 * @author Christian Vargas
 */
public class Cliente2 implements Observer{
    
    public String nombre;
    public String profesion;
    public Revista revista;
    public String mensaje = "";

    public Cliente2(String nombre, String profesion, Revista revista) {
        this.nombre = nombre;
        this.profesion = profesion;
        this.revista = revista;
        revista.subscribe(this);
        actualizaRevista();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }
    
    public void actualizaRevista(){
        mensaje = this.getNombre() + " su revista " + revista.getTitle() + " esta disponible";
    }

    @Override
    public void update() {
        actualizaRevista();
        this.retorna();
    }
    
    public String retorna(){
        return mensaje;
    }
    
}
