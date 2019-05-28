package JavaStudies;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TesteStream {
    public static void main(String[] args) {

        Cliente c1 = new Cliente("Hermann", true,"321", 5);
        Cliente c2 = new Cliente("Hermann", true,"321",10);
        Cliente c3 = new Cliente("Hermann", true,"321",20);

        List<Cliente> clientes = Arrays.asList(c1, c2, c3);
        //clientes.forEach(c -> System.out.println(c.getPontos()));

        Set<Cliente> stream = clientes.stream().filter(c -> c.getPontos()>5).collect(Collectors.toSet());

        //Stream<Integer> stream1 =  clientes.stream().map(c -> c.getPontos());

        //List<Cliente> pontosMaiorCinco = stream.collect(Collectors.toList());
        
        stream.forEach(c -> System.out.println(c.getPontos()));


    }
}
