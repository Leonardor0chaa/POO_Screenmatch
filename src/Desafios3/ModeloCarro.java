package Desafios3;

public class ModeloCarro extends Car {
    private String marca;
    private int anoFabricacao;
    private String combustivel;

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCombustivel() {
        return combustivel;
    }

    public void setCombustivel(String combustivel) {
        this.combustivel = combustivel;
    }

    public void definirDetalhes(String marca, int anoFabricacao, String combustivel) {
        this.marca = marca;
        this.anoFabricacao = anoFabricacao;
        this.combustivel = combustivel;
    }

    public void exibirDetalhes(){
        System.out.println("Marca: " + this.marca);
        System.out.println("Ano de fabricação: " + this.anoFabricacao);
        System.out.println("Combustivel: " + this.combustivel);
    }

    @Override
    public void exibirInfo(){
        super.exibirInfo();
        System.out.println("");
        System.out.println("Mais Detalhes:");
        exibirDetalhes();
    }
}
