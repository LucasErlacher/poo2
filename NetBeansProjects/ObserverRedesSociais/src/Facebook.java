public class Facebook implements Observer {
    @Override
    public void update(Observable obs) {
        System.out.println("Enviando para o Facebook\n");
    }
}
