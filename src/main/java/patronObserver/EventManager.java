/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package patronObserver;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Christian Vargas
 */
public abstract class EventManager {
    public List<Observer> observadores = new ArrayList<Observer>();
    
    public void subscribe(Observer observador){
        observadores.add(observador);
    }
    
    public void unsubscribe(Observer observador){
        observadores.remove(observador);
    }
    
    public void notifica(){
        for (Observer observadore : observadores) {
            observadore.update();
        }
    }
}
