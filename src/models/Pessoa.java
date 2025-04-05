package models;

public abstract class Pessoa {
    protected String nomePessoa;
    protected int idadePessoa;

    public Pessoa(String nome, int idade) {
        this.nomePessoa = nome;
        this.idadePessoa = idade;


    }

    public int getIdade() {
        return idadePessoa;
    }

    public String getNome() {
        return nomePessoa;

    }

    public abstract String getDescricao();{


}
}
