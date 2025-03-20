import java.util.Scanner;

public class TesteLivro {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorNumerico = new Scanner(System.in);
        Editora novatec = new Editora();
        novatec.nome = "Novatec";
        novatec.site = "www.novatec.com";
        novatec.telefone ="11568958995";

        //Criar um objeto -> Instanciar um objeto
    //  Tipo  nomeObjeto = new Tipo();
        Livro meuLivro = new Livro();
        meuLivro.titulo = "UML 2";
        meuLivro.autor = "Gilleanes Guedes";
        meuLivro.editora = "novatec";
        meuLivro.preco = 50;
        meuLivro.paginas = 484;
        meuLivro.tipoCapa = tipoCapaEnun.DURA;
        meuLivro.resumo = "UML abordagem prática....";

        Livro livroDaGiovanna = new Livro();
        livroDaGiovanna.titulo = "Harry Potter e a pedra filosofal";
        livroDaGiovanna.autor = "J K ";

        Livro livro = new Livro();
        System.out.println("Informe o titulo do livro");
        livro.titulo = leitor.nexLine();
        System.out.println("Tipo de capa: \n1 - comum\n2 - Dura\n3 - Personalizada\nDigit");
        int opcao = leitorNumero.nextInt();
        if (opcao ==1)
            livro.tipoCapa = tipoCapaEnun.COMUM;
        else if (opcao == 2)
            livro.tipoCapa = tipoCapaEnun.DURA;
        else
            livro.tipoCapa = tipoCapaEnun.PERSONALIZA;

    }
}
