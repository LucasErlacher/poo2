import org.omg.CORBA.Object;

public class MembroWhatsapp implements Observer{
    int numero = 0;

    @Override
    public void update(Observable obj) {
        if(obj instanceof CaixaEntradaGrupo) {
            System.out.println("Mensagem Recebida pelo Membro do Whatsapp:\n");
            System.out.println(((CaixaEntradaGrupo) obj).getMensagem());
            System.out.println("\n\n");
        }
    }
}
