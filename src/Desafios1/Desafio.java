package Desafios1;

public class Desafio {
    public static void main(String[] args) {
        //Desafio: Hora da prática
        //1. Crie uma classe Desafios.Pessoa com um método que exibe "Olá, mundo!" no console.
        Pessoa pessoaComum = new Pessoa();
        pessoaComum.saudacao();

        System.out.println("");
        //2. Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
        Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(5);
        System.out.println(resultado);

        System.out.println("");
        //3. Crie uma classe Música com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
        Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Meet Me Halfway";
        minhaMusica.artista = "Black Eyed Peas";
        minhaMusica.anoLancamento = 2009;

        minhaMusica.exibeFichaTecnica();

        minhaMusica.avalia(7.5);
        minhaMusica.avalia(7.0);
        minhaMusica.avalia(5.0);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("Média das avaliações: "+ mediaAvaliacoes);

        System.out.println("");
        //4. Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
        Carro meuCarro = new Carro();
        meuCarro.modelo = "Civic G10";
        meuCarro.marca = "Honda";
        meuCarro.ano = 2022;
        meuCarro.cor = "All Black";

        meuCarro.ficheiro();

        System.out.println("Idade do carro: "+ meuCarro.idade() + " anos");

        System.out.println("");
        //5. Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
        Aluno meuAluno = new Aluno();
        meuAluno.nome = "Leonardo";
        meuAluno.idade = 20;

        meuAluno.exibeInformacoes();
    }
}
