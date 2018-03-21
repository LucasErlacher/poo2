package fabrica.abstrata.botoes;

import javax.swing.*;

public class FabricaBotaoImg extends FabricaAbstrataBotoes {

    public JButton criaBotaoOK(){
        return new ButtonOK();
    }

    public JButton criaBotaoCancel(){
        return new ButtonCancel();
    }
}
