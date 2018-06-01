package chainofresponsability;

import javax.swing.*;

public class ChequeHandler extends AbstractPagamentoHandler {
    public static final int CHEQUE = 4;

    @Override
    protected int getTipoPagamento() {
        return CHEQUE;
    }

    @Override
    protected int handlePagamento(int valor) {
        int valorRestante = super.perguntaPagamento("Valor que será pago com cheque?", valor);
        JOptionPane.showMessageDialog(null, "Pago com cheque. Valor restante:"
                + valorRestante);
        return valorRestante;
    }
}
