/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bebidasmetodofabrica;

/**
 *
 * @author 20161bsi0187
 */
public class DrinkFactory {
    public static Bebida getDrink(String escolhaBebida){
        Bebida bebida = null;
        Object classeReflection = null;
	try {
            classeReflection = Class.forName(escolhaBebida).newInstance();
	} catch (InstantiationException e) {
	    e.printStackTrace();
	} catch (IllegalAccessException e) {
            e.printStackTrace();
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}
        bebida = (Bebida) classeReflection;
        return bebida;
    }
}
