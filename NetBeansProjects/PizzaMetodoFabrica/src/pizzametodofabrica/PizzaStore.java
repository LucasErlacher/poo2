package pizzametodofabrica;

/**
 *
 * @author 20161bsi0187
 */
public class PizzaStore {

    public static void main(String[] args) {
        orderPizza();
    }
    
    public static Pizza orderPizza(){        
        System.out.println("Pepperoni:");
        PizzaFactory.createPizza("pizzametodofabrica.PepperoniPizza");
        System.out.println();
        
        System.out.println("Clam:");
        PizzaFactory.createPizza("pizzametodofabrica.ClamPizza");
        System.out.println();
        
        System.out.println("Chesse:");
        PizzaFactory.createPizza("pizzametodofabrica.ChessePizza");
        System.out.println();
        
        System.out.println("Veggie:");
        PizzaFactory.createPizza("pizzametodofabrica.VeggiePizza");
        System.out.println();
        
        return null;
    }
    
}
