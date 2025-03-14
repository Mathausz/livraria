public class TesteReceita {
    public static void main(String[] args) {
        //intamciar um objeto = criar o objeto
        Receitas brownie = new Receitas();
        brownie.nomedaReceita = "brownie";
        brownie.dificuladedareceita = "facil";
        brownie.Ingredientes = "ovos acucar achocolatado farinha de trigo";
        brownie.porcoes = 1;
        brownie.Utensílios = 5;
        brownie.Categoria = "doces";
        brownie.autormathaus ="autor Receita";
        brownie.descrição = "descrição da Receita";
        brownie.Avaliaçãonotas = 4;
        brownie.Imagemdobrownie = "imagem";
        brownie.tempodepreparo = 30;
        System.out.println(brownie.tempodepreparo + "endereço" + brownie);
        Receitas browniemathaus = new Receitas();
        browniemathaus.tempodepreparo = 30;
        System.out.println(brownie.tempodepreparo + "" + browniemathaus.tempodepreparo + "endereço" + brownie);

        brownie.exibirReceitas();
        brownie.exibirReceita2();
    }
}
