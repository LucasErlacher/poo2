/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletontelefone;

/**
 *
 * @author 20161bsi0187
 */
public class SingletonTelefone {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Telefone tel = Telefone.getInstance();
        
        for(int i = 0; i < 15; i++){
            System.out.println(tel.getNextNumeroTelefone());
        }
    }
    
}
