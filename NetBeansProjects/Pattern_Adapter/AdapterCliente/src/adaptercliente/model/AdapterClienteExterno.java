package adaptercliente.model;

import lib.ClienteExterno;

public class AdapterClienteExterno extends Cliente {
    private ClienteExterno ce;

    //Construtor
    public AdapterClienteExterno(ClienteExterno ce){
        this.ce = ce;
    }

    //Métodos
    @Override
    public String getNomeCompleto() {
        return ce.getNome();
    }

    @Override
    public String getCelular() {
        return ce.getCelular();
    }

    @Override
    public String getEmail() {
        return ce.getEmail();
    }

    @Override
    public String getTelefone() {
        return ce.getTelefone();
    }

}
