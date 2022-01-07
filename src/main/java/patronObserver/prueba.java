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
public class prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Revista re = new Revista();
        re.setTitle("Deportes");
        
        String nombre = "Cristhian Vargas";
        String prof = "Estudiante";
        Cliente1 cli = new Cliente1(nombre, prof, re);
        System.out.println(cli.retorna());
        
        /*Revista re2 = new Revista();
        re2.setTitle("Moda y belleza");
        
        Cliente2 cli2 = new Cliente2(re2);
        cli2.setNombre("Fiorrelaa");
        System.out.println(cli2.retorna());*/
    }
    
}
