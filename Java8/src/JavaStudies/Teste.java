package JavaStudies;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

//Classe teste onde os valores são recebidos

public class Teste {

    public static void main(String[] args) {
        Cliente c1 = new Cliente("Douglas",true,"123");
        Cliente c2 = new Cliente("Hermann", true,"321");
        c1.autenticaSenha("12");
        c2.autenticaSenha("31");


       List<Cliente> clientes = Arrays.asList(c1, c2); //método para listar clientes

        //Expressão lambda
       // clientes.forEach( c -> System.out.println(c.getNome()));


        //refencia ao metodo - Ultilizado quando já temos um método pronto e só precisamos chamar o metodo
        //Referencia ao método apenas é usado em interfaces funcionais
        clientes.forEach(Cliente::getNome);


        //Referencia nos metodos de instânica
        //accept método pronto
        Cliente c3 = new Cliente("Ana", false,"333");
        Consumer<Cliente> consumido1  = Cliente::getNome;
        consumido1.accept(c3);

        //Runnable, Interface funcional que o método não precisa de argumento
        Runnable r1 = c3::getNome;
        r1.run();



         //outro exemplo de expressão lambda quando não precisa passar argumento para o método
        Runnable r = () -> System.out.println("Olá mundo");
        new Thread(r).start();

        }
    }

//Expressão lambda só pode ser usada para implementar uma interface funcional
