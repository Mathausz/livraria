public class Receitas {
    public static void main(String[] args) {

    }
    String Titulodareceia;
    int Avaliaçãonotas;
    String Categoria;
    String nomedaReceita;
    String autormathaus;
    String Imagemdobrownie;
    int tempodepreparo;
    String dificuladedareceita;
    String descrição;
    String Ingredientes;
    int Utensílios;
    int porcoes;
    public  void exibirReceitas(){
        System.out.println("Receita de" + Titulodareceia);
        System.out.println("============================");
        System.out.println("Publicando por" + autormathaus);
        System.out.println(dificuladedareceita + "\t\t\t\t" + tempodepreparo + "\t\t\t\t" + porcoes);
        System.out.println(descrição);
        System.out.println("ingredientes\n" + Ingredientes);
    }
    public String exibirReceita2(){
        String mensagem = "Receitas de " + nomedaReceita +
                "\n Receita de" + Titulodareceia +
                "\n============================" +
                "\n Publicando por" + autormathaus +
                "\n dificuladedareceita + \"\\t\\t\\t\\t\" + tempodepreparo + \"\\t\\t\\t\\t\" + porcoes";
        return mensagem;
    }
}