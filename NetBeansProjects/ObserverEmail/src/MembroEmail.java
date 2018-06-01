public class MembroEmail implements Observer {
    String email;

    @Override
    public void update(Observable obj) {
        if(obj instanceof CaixaEntradaGrupo) {
            System.out.println("Mensagem Recebida pelo Membro do Email:\n");
            System.out.println(((CaixaEntradaGrupo) obj).getMensagem());
            System.out.println("\n\n");
        }
    }
}
