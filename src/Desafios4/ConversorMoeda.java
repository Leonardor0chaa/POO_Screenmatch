package Desafios4;

public class ConversorMoeda implements ConversaoFinanceira {
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 5.16; //Conversão atual do dia 01/04/2026
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println("O valor em reais é: R$" + valorReal);
    }
}
