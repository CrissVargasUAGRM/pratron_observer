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
public class Revista extends EventManager{
    public String title;

    public Revista() {
        this.title = "Revista";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
        this.notifica();
    }
}
