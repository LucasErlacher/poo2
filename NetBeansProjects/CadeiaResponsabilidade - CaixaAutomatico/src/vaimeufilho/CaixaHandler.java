/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaimeufilho;

import javax.swing.JOptionPane;

/**
 *
 * @author lrodrigues
 */
public abstract class CaixaHandler implements ICaixaHandler{
    CaixaHandler nextCaixaHandler;
    
    public void setNextHandler(CaixaHandler cx) {
        nextCaixaHandler = cx;
    }

    public void processHandler(int valor) {
        int restante = sacaNota(valor);
        
        if(restante == 0){
            return;
        }
        
        if(nextCaixaHandler != null){
            nextCaixaHandler.processHandler(restante);
        }
    }
    
    public abstract int sacaNota(int valor);
    public abstract int getTipo();
    
}
