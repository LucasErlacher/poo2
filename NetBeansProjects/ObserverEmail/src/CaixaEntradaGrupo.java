public class CaixaEntradaGrupo extends Observable {
    String mensagem = "";

    public void setNovaMensagem(String mensagem){
        this.mensagem = mensagem;
        super.notifyObserver();
    }

    public String getMensagem(){
        return mensagem;
    }
}
