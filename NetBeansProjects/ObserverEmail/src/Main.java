public class Main {
    public static void main(String[] args){
        Observer o1 = new MembroEmail();
        Observer o2 = new MembroWhatsapp();

        CaixaEntradaGrupo cx = new CaixaEntradaGrupo();
        cx.addObserver(o1);
        cx.addObserver(o2);

        cx.setNovaMensagem("Aqui o membro email e membro whatsapp são observers");

        cx.deleteObserver(o1);

        cx.setNovaMensagem("Aqui o membro whatsapp é observer");
    }
}
