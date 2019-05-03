/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonmulti;
import singletonmulti.Singleton;
/**
 *
 * @author JOHN
 */
public class Ejemplo {
    Singleton objetoUno;
    Singleton objetoDos;
    
    //@Override
    public void operacion() {
        objetoUno = Singleton.getInstance();
        objetoDos = Singleton.getInstance();
        
        System.out.println(objetoDos.equals(objetoUno));
    }
}
