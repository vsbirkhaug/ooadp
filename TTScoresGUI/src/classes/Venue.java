/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author VSB
 */
public class Venue {
   String name;

   public void setName(String name) {
     this.name = name;
   }

   public String getName() {
     return this.name;
   }
   
    public Venue(String name) {
        setName(name);
    }
}
