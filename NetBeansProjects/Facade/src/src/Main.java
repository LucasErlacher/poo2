public class Main {
    public static void main(String[] args){
        ControleRemoto cr = new ControleRemoto(new ControleSom(),
                new ControleVideo(),
                new ControleCanal());

        cr.ajustarTelevisao();
    }
}
