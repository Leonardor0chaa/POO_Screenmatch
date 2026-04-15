package Desafios4;

public class Livro implements Calculavel {
    private String autor;

    public double calcularPrecoFinal() {
        double preco = 100;
        return preco * 0.9;
    }
}
