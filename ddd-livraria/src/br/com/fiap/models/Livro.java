package br.com.fiap.models;

import br.com.fiap.enums.TipoCapaEnum;

public class Livro {
    //Atributo tipo nomeAtributo;
    private String titulo;
    private String autor;
    private  double preco;
    private String editora;
    private int paginas;
    private String resumo;
    private TipoCapaEnum tipoCapa; //COMUM, DURA, PERSONALIZADA

    public TipoCapaEnum getTipoCapa() {
        return tipoCapa;
    }

    public void setTipoCapa(TipoCapaEnum tipoCapa) {
        this.tipoCapa = tipoCapa;
    }

    public String getResumo() {
        return resumo;
    }

    public void setResumo(String resumo) {
        this.resumo = resumo;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    //Construtor
    //Sobrecarga de métodos -> Métodos com mesmo nome porém assinatura diferente
    public Livro(){
        tipoCapa = TipoCapaEnum.COMUM;
    }

    public Livro(String editora){
        this.editora = editora;
        tipoCapa = TipoCapaEnum.COMUM;
    }

    public Livro(String titulo, String autor, double preco,
                 String editora, int paginas, String resumo,
                 TipoCapaEnum tipoCapa) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
        this.editora = editora;
        this.paginas = paginas;
        this.resumo = resumo;
        this.tipoCapa = tipoCapa;
    }

    public Livro(String titulo, String editora, TipoCapaEnum tipoCapa) {
        this.titulo = titulo;
        this.editora = editora;
        this.tipoCapa = tipoCapa;
    }

    //Método para exibir o livro
    public void exibirLivro(){
        System.out.println("br.com.fiap.models.models.Livro: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("br.com.fiap.models.models.Editora: " + editora);
        System.out.println("Preço: " + preco);
        System.out.println("Tipo de capa: " + tipoCapa);
        System.out.println("-------------------------------------\n");
    }

    public String exibirTipoCapa(){
        return "";

    }
}