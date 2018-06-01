public class Twitter implements Observer{
    @Override
    public void update(Observable obs) {
        System.out.println("Enviando para Twitter\n");
    }
}