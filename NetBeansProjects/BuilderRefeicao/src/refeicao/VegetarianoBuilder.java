

package refeicao;

/**
 *
 * @author felipe
 */
public class VegetarianoBuilder extends RefeicaoBuilder{
    
    public VegetarianoBuilder(Refeicao refeicao){
        this.refeicao = refeicao;
    }        
    public void preparaHamburgerVegetariano(){
        System.out.println("cria hamburger vegetariano e batata");
        this.refeicao.setHamburger(new HamburgerVegetariano());
        this.refeicao.setBatata(new Batata());
    }        
}


