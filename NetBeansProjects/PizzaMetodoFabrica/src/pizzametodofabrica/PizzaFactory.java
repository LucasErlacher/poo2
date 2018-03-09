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
class PizzaFactory {
    public static Pizza createPizza(String tipoPizza){
        Pizza pizza;
        Object classeReflection = null;
	try {
            classeReflection = Class.forName(tipoPizza).newInstance();
	} catch (InstantiationException e) {
	    e.printStackTrace();
	} catch (IllegalAccessException e) {
            e.printStackTrace();
	} catch (ClassNotFoundException e) {
	    e.printStackTrace();
	}        
        
        pizza = (Pizza) classeReflection;
        
        try{
            pizza.prepare();
            pizza.bake();
            pizza.cut();
            pizza.box();
        }catch(NullPointerException e){
            e.printStackTrace();
        }
        
        return pizza;
    }
}
