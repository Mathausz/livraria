package br.com.fiap.models;

public class Receita {
    private String nomeReceita;
    private String autorReceita;
    private String dificuldade;
    private int tempoPreparo;
    private int porcoes;
    private String descricao;
    private String ingredientes;
    private String modoPreparo;

    public String getNomeReceita() {
        return nomeReceita;
    }

    public void setNomeReceita(String nomeReceita) {
        this.nomeReceita = nomeReceita;
    }

    public String getAutorReceita() {
        return autorReceita;
    }

    public void setAutorReceita(String autorReceita) {
        this.autorReceita = autorReceita;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public int getTempoPreparo() {
        return tempoPreparo;
    }

    public void setTempoPreparo(int tempoPreparo) {
        this.tempoPreparo = tempoPreparo;
    }

    public int getPorcoes() {
        return porcoes;
    }

    public void setPorcoes(int porcoes) {
        this.porcoes = porcoes;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getModoPreparo() {
        return modoPreparo;
    }

    public void setModoPreparo(String modoPreparo) {
        this.modoPreparo = modoPreparo;
    }

    //Método sem retorno
    public void exibirReceita(){
        System.out.println("br.com.fiap.models.models.Receita de " + nomeReceita);
        System.out.println("===========================");
        System.out.println("Publicado por: " + autorReceita);
        System.out.println("Dificuldade\t\tTempo de preparo\tPorções");
        System.out.println(dificuldade + "\t\t\t\t" + tempoPreparo + "\t\t\t\t" + porcoes);
        System.out.println(descricao);
        System.out.println("Ingredientes\n" + ingredientes);
        System.out.println("Modo de Preparo\n" + modoPreparo);
    }

    //Método com retorno
    public String exibirReceita2(){
        String mensagem = "br.com.fiap.models.models.Receita de " + nomeReceita +
                "\n===========================" +
                "\nPublicado por: " + autorReceita +
                "\nDificuldade\t\tTempo de preparo\tPorções" +
                "\ndificuldade + \"\\t\\t\\t\\t\" + tempoPreparo + \"\\t\\t\\t\\t\" + porcoes" +
                descricao;
        return mensagem;
    }
}