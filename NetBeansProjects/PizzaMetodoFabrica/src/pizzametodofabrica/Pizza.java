/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pizzametodofabrica;

/**
 *
 * @author 20161bsi0187
 */
public abstract class Pizza {
    public void bake(){
        System.out.println("Assando Pizza");
    }
    
    public void prepare(){
        System.out.println("Preparando Pizza");
    }
    
    public void cut(){
        System.out.println("Fatiando Pizza");
    }
    
    public void box(){
        System.out.println("Embalando Pizza");
    }
}
