/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vaimeufilho;

/**
 *
 * @author lrodrigues
 */
public class Nota50 extends CaixaHandler {
    int qntNotas = 0;
    
    @Override
    public int sacaNota(int valor) {
        int quantNotas = valor / 50;
        
        qntNotas = quantNotas;
        
        valor -= quantNotas * 50;
        return valor;
    }

    @Override
    public int getTipo() {
        return 50;
    }

   int getQnt() {
        return qntNotas;
    }
}
