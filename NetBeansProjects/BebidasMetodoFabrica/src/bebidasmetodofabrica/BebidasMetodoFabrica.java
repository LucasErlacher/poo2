package bebidasmetodofabrica;

/**
 *
 * @author 20161bsi0187
 */
public class BebidasMetodoFabrica {
    public static void main(String[] args) {
        Bebida bebida = null;
        
        bebida = DrinkFactory.getDrink("bebidasmetodofabrica.Cafe");
        bebida = DrinkFactory.getDrink("bebidasmetodofabrica.Cha");
        bebida = DrinkFactory.getDrink("bebidasmetodofabrica.Refrigerante");
        bebida = DrinkFactory.getDrink("bebidasmetodofabrica.Suco");
        
        return;
    }
    
}
