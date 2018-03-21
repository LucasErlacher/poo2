package fabrica.abstrata.botoes;

import javax.swing.*;

public class FabricaBotaoSemImg extends FabricaAbstrataBotoes{

    @Override
    public JButton criaBotaoOK() {
        return new JButton("Confirmar");
    }

    @Override
    public JButton criaBotaoCancel() {
        return new JButton("Cancel");
    }
}
