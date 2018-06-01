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
public class Nota5 extends CaixaHandler {

    private int qntNotas = 0;

    @Override
    public int sacaNota(int valor) {
        int quantNotas = valor / 5;
        qntNotas = quantNotas;
        valor -= quantNotas * 5;
        return valor;
    }

    @Override
    public int getTipo() {
        return 5;
    }

    int getQnt() {
       return qntNotas;
    }
}
