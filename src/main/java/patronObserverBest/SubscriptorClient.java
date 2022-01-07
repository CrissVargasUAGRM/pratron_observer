/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronObserverBest;

/**
 *
 * @author Christian Vargas
 */
public class SubscriptorClient implements Observer{
    
    public String nombre;
    public Revista revista;
    public String mensaje = "";

    public SubscriptorClient() {
        this.nombre = "sin nombre";
        this.revista = new Revista();
    }

    public SubscriptorClient(String nombre, Revista revista) {
        this.nombre = nombre;
        this.revista = revista;
        this.revista.subscribe(this);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Revista getRevista() {
        return revista;
    }

    public void setRevista(Revista revista) {
        this.revista = revista;
    }
    
    public void actualizarRevista(){
        mensaje = this.getNombre() + " te informo que " + revista.getTitulo() + " que es de tu interes " + revista.getCategoria() + " esta disponible";
    }

    @Override
    public String toString() {
        return "SubscriptorClient{" + "nombre=" + getNombre() + ", revista=" + this.revista.toString() + '}';
    }

    @Override
    public void update() {
        actualizarRevista();
        this.respuesta();
    }
    
    public String respuesta(){
        return mensaje;
    }
    
}
