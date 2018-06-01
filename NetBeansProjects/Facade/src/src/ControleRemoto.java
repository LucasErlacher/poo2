public class ControleRemoto {
    ControleSom cs = null;
    ControleVideo cv = null;
    ControleCanal cc = null;

    public ControleRemoto(ControleSom cs, ControleVideo cv, ControleCanal cc){
        this.cs = cs;
        this.cv = cv;
        this.cc = cc;
    }

    public void ajustarTelevisao(){
        System.out.println("Ajustando para a forma como é melhor...");
        cs.aumentar();
        cs.aumentar();
        cv.aumentarContraste();
        cv.diminuirBrilho();
        cv.diminuirBrilho();
        cv.diminuirBrilho();
        cc.avancarCanal();
        System.out.println("Ajustado da forma como gosta!");
    }
}
