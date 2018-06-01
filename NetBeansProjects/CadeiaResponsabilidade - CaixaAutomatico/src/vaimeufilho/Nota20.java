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
public class Nota20 extends CaixaHandler {

    int qntNotas = 0;

    @Override
    public int sacaNota(int valor) {
        int quantNotas = valor / 20;
        
        qntNotas = quantNotas;
        
        valor -= quantNotas * 20;
        return valor;
    }

    @Override
    public int getTipo() {
        return 20;
    }

    int getQnt() {
        return qntNotas;
    }
}
