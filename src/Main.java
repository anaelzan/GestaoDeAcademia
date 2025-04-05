import models.Academia;
import models.Cliente;
import models.instrutor;



//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Academia academiaSenai = new Academia("Java Senai Fitness");


        Cliente cliente1 = new Cliente("Carlos Silva", 30, "Premium");
        Cliente cliente2 = new Cliente("Mariana Souza", 25, "Básico");


        instrutor instrutor1 = new instrutor("João Pereira", 40, "Musculação");

        instrutor instrutor2 = new instrutor("Ana Costa", 35, "Pilates");

        Academia.adicionarPessoa(cliente1);
        Academia.adicionarPessoa(cliente2);
        Academia.adicionarPessoa(instrutor1);
        Academia.adicionarPessoa(instrutor2);

        academiaSenai.listarPessoas();



        }
    }
