package models;

public class instrutor extends Pessoa {
    public String especialidadeInstrutor;

    public instrutor(String nome, int idade, String especialidadeInstrutor) {
        super(nome, idade);
        this.especialidadeInstrutor = especialidadeInstrutor;
    }

    public String getEspecialidadeInstrutor() {
        return especialidadeInstrutor;
    }

    @Override
    public String toString() {
        return "instrutor{" +
                "especialidadeInstrutor='" + especialidadeInstrutor + '\'' +
                ", nomePessoa='" + nomePessoa + '\'' +
                ", idadePessoa=" + idadePessoa +
                '}';
    }

    @Override
    public String getDescricao() {
        return "";
    }
}

