package Desafios3;

public class ContaCorrente extends ContaBanc {
    private double tarifaMensal;

    public void cobrarTarifaMensal() {
        saldo -= tarifaMensal;
        System.out.println("Tarifa mensal de R$" + tarifaMensal + " cobrada. Saldo atual: " + saldo);
    }
}
