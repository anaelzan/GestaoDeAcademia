package models;

abstract class clientes extends Pessoa {
    private String planoCliente;

    public clientes(String nome, int idade, String planoCliente) {
        super(nome, idade);
        this.planoCliente = planoCliente;

    }

    @Override
    public String getDescricao() {
        return "clientes{" +
                "nomePessoa='"+ nomePessoa +'\''+
                "idadePessoa='"+ idadePessoa +'\''+
                "planoCliente='" + planoCliente + '\'' +
                '}';
    }
}
