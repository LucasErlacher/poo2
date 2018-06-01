public class Blog implements Observer {
    @Override
    public void update(Observable obs) {
        System.out.println("Enviando para o Blog\n");
    }
}
