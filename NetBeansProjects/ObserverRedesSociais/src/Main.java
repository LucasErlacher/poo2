public class Main {
    public static void main(String[] args){
        Observer o1 = new Blog();
        Observer o2 = new Twitter();
        Observer o3 = new Facebook();

        CaixaPublicacao cx = new CaixaPublicacao();
        cx.addObserver(o1);
        cx.addObserver(o2);
        cx.addObserver(o3);

        System.out.println("\nPrimeira mensagem...\n");
        cx.enviaMensagem("Primeira mensagem");

        System.out.println("\n\nSegunda mensagem...\n");
        cx.enviaMensagem("Segunda mensagem");
    }
}
