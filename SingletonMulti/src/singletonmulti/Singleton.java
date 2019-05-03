/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletonmulti;

/**
 *
 * @author JOHN
 */
public class Singleton {

    /**
     * @param args the command line arguments
     */
    private static Singleton
            Instance;
  
    // Step 2: private constructor
    private Singleton() {
  
    }
  
    // Step 3: Provide public static getInstance() method 
    // returning INSTANCE after checking
    public static Singleton getInstance() {
    if (Instance == null) {
        synchronized(SingletonMulti.class) {      
            Singleton Inst = Instance;         
            if (Inst == null) {
                synchronized(SingletonMulti.class) {  
                    Instance = new Singleton();               
                }
            }
        }
    }
    return Instance;
}
    
}