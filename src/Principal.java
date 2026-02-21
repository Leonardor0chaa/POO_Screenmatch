import Desafios.ContaBancaria;
import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        /*Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);
        meuFilme.setIncluidoNoPlano(true);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
        System.out.println("Média de avaliaçãoes do filme: " + meuFilme.pegaMedia());
        System.out.println(" ");*/


        /*br.com.alura.screenmatch.modelos.Filme favorito = new br.com.alura.screenmatch.modelos.Filme();
        favorito.nome = "Homem-Aranha: De Volta ao Lar";
        favorito.anoDeLancamento = 2017;
        favorito.duracaoEmMinutos = 133;
        favorito.incluidoNoPlano = true;

        favorito.exibeFichaTecnica();
        favorito.avalia(10);
        favorito.avalia(10);
        favorito.avalia(10);
        favorito.avalia(10);
        favorito.avalia(10);

        System.out.println("Média de avaliações do filme: "+ favorito.pegaMedia() + " esse filme foi avaliado por "+ favorito.totalDeAvaliacoes + " pessoas!");

        System.out.println(" ");*/


        //Desafio: Hora da prática
        //1. Crie uma classe Desafios.Pessoa com um método que exibe "Olá, mundo!" no console.
        /*Pessoa comumPessoa = new Desafios.Pessoa();

        comumPessoa.saudacao();*/

        //2. Crie uma classe Calculadora com um método que recebe um número como parâmetro e retorna o dobro desse número.
        /*Calculadora calculadora = new Calculadora();
        int resultado = calculadora.dobrarNumero(5);
        System.out.println(resultado);*/

        //3. Crie uma classe Música com atributos titulo, artista, anoLancamento, avaliacao e numAvaliacoes, e métodos para exibir a ficha técnica, avaliar a música e calcular a média de avaliações.
        /*Musica minhaMusica = new Musica();

        minhaMusica.titulo = "Meet Me Halfway";
        minhaMusica.artista = "Black Eyed Peas";
        minhaMusica.anoLancamento = 2009;

        minhaMusica.exibeFichaTecnica();

        minhaMusica.avalia(7.5);
        minhaMusica.avalia(7.0);
        minhaMusica.avalia(5.0);

        double mediaAvaliacoes = minhaMusica.pegaMedia();
        System.out.println("Média das avaliações: "+ mediaAvaliacoes);*/

        //4. Crie uma classe Carro com atributos modelo, ano, cor e métodos para exibir a ficha técnica e calcular a idade do carro.
        /*Carro meuCarro = new Carro();
        meuCarro.modelo = "Civic G10";
        meuCarro.marca = "Honda";
        meuCarro.ano = 2022;
        meuCarro.cor = "All Black";

        meuCarro.ficheiro();

        System.out.println("Idade do carro: "+ meuCarro.idade() + " anos");*/

        //5. Crie uma classe Aluno com atributos nome, idade, e um método para exibir informações. Crie uma instância da classe Aluno, atribua valores aos seus atributos e utilize o método para exibir as informações.
        /*Aluno meuAluno = new Aluno();
        meuAluno.nome = "Leonardo";
        meuAluno.idade = 19;

        meuAluno.exibirInformacoes();*/

        //Desafio: Hora da prática 2
        //1. Crie uma classe ContaBancaria com os seguintes atributos: numeroConta (privado), saldo (privado) e titular (publico). Implemente métodos getters e setters para os atributos privados.
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta(123);
        conta.setSaldo(1000);
        conta.titular = "Leonardo";

        System.out.println("Número da conta: " + conta.getNumeroConta());
        System.out.println("Saldo da conta: " + conta.getSaldo());
        System.out.println("Titular da conta: " + conta.titular);

        conta.setSaldo(1500);
        System.out.println("Novo saldo: " + conta.getSaldo());
    }
}
