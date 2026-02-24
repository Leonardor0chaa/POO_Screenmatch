package Desafios;

public class Animal {
    private String nome;
    private String sexo;
    private String raca;
    private String cor;
    private int idade;

    public void emitirSom() {
        System.out.println("Som do Animal");
    }

    //Adicionei para ficar mais legal
    public void exibirInfos(String nome, int idade, String sexo, String raca, String cor) {
        System.out.println("Dados do animal:");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Sexo: " + sexo);
        System.out.println("Raca: " + raca);
        System.out.println("Cor: " + cor);
        System.out.println(" ");
    }
}
