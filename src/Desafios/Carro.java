package Desafios;

public class Carro {
    public String modelo;
    public String marca;
    public int ano;
    public String cor;

    public void ficheiro(){
        System.out.println("Modelo: "+modelo);
        System.out.println("Marca: "+marca);
        System.out.println("Ano: "+ano);
        System.out.println("Cor: "+cor);
    }

    public int idade(){
        return 2026 - ano;
    }
}
