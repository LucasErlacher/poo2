package chainofresponsability;

import javax.swing.*;

public class DinheiroHandler extends AbstractPagamentoHandler {

    public static final int DINHEIRO = 3;

    @Override
    protected int getTipoPagamento() {
        return DINHEIRO;
    }

    @Override
    protected int handlePagamento(int valor) {
        int valorRestante = super.perguntaPagamento("Valor que será pago com dinheiro", valor);
        JOptionPane.showMessageDialog(null, "Pago com dinheiro. Valor restante:"
                + valorRestante);
        return valorRestante;
    }
}
