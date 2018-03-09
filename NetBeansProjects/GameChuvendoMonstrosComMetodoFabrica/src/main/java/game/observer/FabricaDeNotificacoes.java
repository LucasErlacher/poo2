package game.observer;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class FabricaDeNotificacoes {
    String filePath;
    FabricaDeNotificacoes() {
        try {
            File file = new File(".");
            filePath = file.getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(FabricaDeNotificacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Image criarImagensNotificacao(String tipo) {
        Image imagem = null; 
        try {
            imagem = new Image(tipo);
        } catch (SlickException ex) {
            Logger.getLogger(FabricaDeNotificacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
        return imagem;
    }

   

}
