package br.com.alura.screenmatch.modelos;

// Encapsulamento
public class Serie extends Titulo{
    private int temporadas;
    private int episodiosPorTemporada;
    private boolean ativa;
    private int minutosPorEpisodio;

    //Getters and Setters

    // Getters - Obter os valores

    public int getTemporadas() {
        return temporadas;
    }

    public int getEpisodiosPorTemporada() {
        return episodiosPorTemporada;
    }

    public int getMinutosPorEpisodio() {
        return minutosPorEpisodio;
    }

    // Setters - Atribuição de valores

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public void setEpisodiosPorTemporada(int episodiosPorTemporada) {
        this.episodiosPorTemporada = episodiosPorTemporada;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public void setMinutosPorEpisodio(int minutosPorEpisodio) {
        this.minutosPorEpisodio = minutosPorEpisodio;
    }


    // Anotação @Override serve para que indica que um método está sobrescrevendo o mesmo método definido na sua classe mãe.
    @Override
    public int getDuracaoEmMinutos() {
        return temporadas * episodiosPorTemporada * minutosPorEpisodio;
    }
}
