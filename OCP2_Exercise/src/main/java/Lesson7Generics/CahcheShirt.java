/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lesson7Generics;

/**
 *
 * @author rosso
 */
public class CahcheShirt {
    private Shirt shirt;
  
    public void add(Shirt shirt){
       this.shirt = shirt;
    }
  
    public Shirt get(){
        return this.shirt;
    }  
}
