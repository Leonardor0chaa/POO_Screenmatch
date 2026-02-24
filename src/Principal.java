import Desafios.*;
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
            /*ContaBancaria conta = new ContaBancaria();

            conta.setNumeroConta(123);
            conta.setSaldo(1000);
            conta.titular = "Leonardo";

            System.out.println("Número da conta: " + conta.getNumeroConta());
            System.out.println("Saldo da conta: " + conta.getSaldo());
            System.out.println("Titular da conta: " + conta.titular);

            conta.setSaldo(1500);
            System.out.println("Novo saldo: " + conta.getSaldo());*/

            //2. Crie uma classe IdadePessoa com os atributos privados nome e idade. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método verificarIdade que imprime se a pessoa é maior de idade ou não.
            /*IdadePessoa pessoa1 = new IdadePessoa();
            pessoa1.setNome("Pedro");
            pessoa1.setIdade(30);

            IdadePessoa pessoa2 = new IdadePessoa();
            pessoa2.setNome("Maria");
            pessoa2.setIdade(15);

            pessoa1.verificarIdade();
            pessoa2.verificarIdade();*/

            //3. Desenvolva uma classe Produto com os atributos privados nome e preco. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método aplicarDesconto que recebe um valor percentual e reduz o preço do produto.
            /*Produto produto = new Produto("Celular", 2000.0);

            System.out.println("Nome do produto: " + produto.getNome());
            System.out.println("Preço do produto: " + produto.getPreco());

            produto.aplicarDesconto(10);
            System.out.println("Novo preço do produto após desconto: R$" + produto.getPreco());*/

            //4. Desenvolva uma classe Aluno com os atributos privados nome e notas. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método calcularMedia que retorna a média das notas do aluno.
            /*Aluno aluno1 = new Aluno("Leonardo", 10, 8.5, 7);
            Aluno aluno2 = new Aluno("Lucas", 8, 7, 9);

            System.out.println("Aluno 1:");
            System.out.println("Nome: " + aluno1.getNome());
            System.out.println("Nota 1: " + aluno1.getNota1());
            System.out.println("Nota 2: " + aluno1.getNota2());
            System.out.println("Nota 3: " + aluno1.getNota3());
            System.out.println("Média: " + aluno1.calcularMedia());
            System.out.println();

            System.out.println("Aluno 2:");
            System.out.println("Nome: " + aluno2.getNome());
            System.out.println("Nota 1: " + aluno2.getNota1());
            System.out.println("Nota 2: " + aluno2.getNota2());
            System.out.println("Nota 3: " + aluno2.getNota3());
            System.out.println("Media: " + aluno2.calcularMedia());*/

            //6. Desenvolva uma classe Livro com os atributos privados titulo e autor. Utilize métodos getters e setters para acessar e modificar esses atributos. Adicione um método exibirDetalhes que imprime o título e o autor do livro.
            Livro livro1 = new Livro();
            livro1.setTitulo("Lógica de Programação");
            livro1.setAutor("Leonardo Rocha");

            Livro livro2 = new Livro();
            livro2.setTitulo("Programação Orientada a Objetos");
            livro2.setAutor("Leo Rocha");

            livro1.exibirDetalhes();
            System.out.println();
            livro2.exibirDetalhes();
        }
}
