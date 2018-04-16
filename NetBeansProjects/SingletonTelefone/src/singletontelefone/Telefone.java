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
public class Telefone {
    //Instância
    private static Telefone instance = null;
    
    //Atributos da Classe
    private long num_telefone;
    
    //Construtor Privado
    private Telefone(){
        num_telefone = 999990101;
    }
    
    //Método que instancia ou retorna a instancia
    public synchronized static Telefone getInstance(){
         if(instance == null){
            instance = new Telefone();
        }
        return instance;
    }
    
    //Método que retorna um novo número
    public synchronized long getNextNumeroTelefone(){
        return num_telefone++;
    }
    
}
