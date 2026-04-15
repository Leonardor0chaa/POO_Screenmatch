package Desafios4;

public class Servico implements Vendavel{
    private String nome;
    private double precoHora;

    // Construtor e outros métodos

    @Override
    public double calcularPrecoTotal(int quantidade) {
        return precoHora * quantidade;
    }

    @Override
    public void aplicarDesconto(double percentualDesconto) {
        precoHora -= precoHora * (percentualDesconto / 100.0);
    }
}
