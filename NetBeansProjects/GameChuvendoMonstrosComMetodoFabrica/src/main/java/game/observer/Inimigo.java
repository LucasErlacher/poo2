
package game.observer;

import com.sun.org.glassfish.gmbal.ManagedObject;

import java.util.concurrent.ThreadLocalRandom;

/**
 * @author felipe
 */
    public class Inimigo extends PersonagemPadrao implements Observador, Cloneable{
        
    
    public Inimigo(String pathImage, int posX, int posY) {
        super(pathImage, posX, posY);
    }
    @Override
    public void update(Observavel ob) {
        moveInimigo((Heroi) ob);
    }
    private void moveInimigo(Heroi heroi){        
        
        if(this.posY >= 400){
            this.posY = -20;
            this.posX = ThreadLocalRandom.current().nextInt(0, 640);
        }
        else{
            this.posY = this.posY + 5;            
        }                        
    }

    public Object clone(){
        Object obj = null;
        try{
            obj = super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return obj;
    }
}
