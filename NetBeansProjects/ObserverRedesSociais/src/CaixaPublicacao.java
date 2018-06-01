public class CaixaPublicacao extends Observable {
    String mensagem;

    public void enviaMensagem(String mensagem){
        this.mensagem = mensagem;
        super.notifyObservers();
    }
}
