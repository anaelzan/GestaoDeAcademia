package models;

 public class Cliente extends Pessoa {
    public String planoCliente;

    public Cliente(String nome, int idade, String planoCliente) {
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
