public class Livro {
    //Atributo tipo nomeAtributo;
    String titulo;
    String autor;
    double preco;
    String editora;
    int paginas;
    String resumo;
    String tipoCapa;

    public void exibirLivro(){
        System.out.println("Livro:" + titulo);
        System.out.println("Autor:" + autor);
        System.out.println("Editora:" + editora.nome);
        System.out.println("Preço:" + preco);
        System.out.println("------------------------------\n");
    }
}
