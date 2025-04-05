package models;

import java.util.ArrayList;

public class Academia {
    private String nomeAcademia;
    private ArrayList<Pessoa> pessoas;

    public Academia(String nomeAcademia) {
        this.nomeAcademia = nomeAcademia;
        this.pessoas = new ArrayList<>();
    }

    public void adicionarPessoa(Pessoa pessoa) {
        pessoas.add(pessoa);
    }


    public void listarPessoas (){
                System.out.println("lista de pessoas da academia");
            for (Pessoa pessoaDaLista: pessoas){
                System.out.println(pessoaDaLista.getDescricao());
            }
    }

}

