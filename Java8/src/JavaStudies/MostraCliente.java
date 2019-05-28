package JavaStudies;

import java.util.function.Consumer;

    public class MostraCliente implements Consumer<Cliente> { //implementação da interface consumer

    public void accept(Cliente c){
        System.out.println(c.getNome());
        System.out.println(c.getSenha());
        System.out.println(c.getStatus());
    }

}
