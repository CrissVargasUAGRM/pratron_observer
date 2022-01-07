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
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Revista rev = new Revista();
        rev.setTitulo("Deportes 1");
        rev.setCategoria("Deportes");
        System.out.println("titulo: "+rev.getTitulo()+" categoria: "+rev.getCategoria());
        
        System.out.println("-------------------------Observadores----------------------------");
        SubscriptorClient cliente1 = new SubscriptorClient("cristhian", rev);
        SubscriptorClient cliente2 = new SubscriptorClient("juan", rev);
        SubscriptorClient cliente3 = new SubscriptorClient("tomas", rev);
        System.out.println(cliente1.getNombre());
        System.out.println(cliente1.revista.toString());
        
        System.out.println("-----------------------------Arreglo------------------------");
        rev.imprimir();
        
        System.out.println("--------------------------------llamada---------------");
        rev.setTitulo("Deportes lo nuevo");
    }
    
}
