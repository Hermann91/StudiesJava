package JavaStudies;



@FunctionalInterface
public interface Autentica {

    public abstract boolean autenticaSenha(String senha);

}

//É considera se uma interface funcional quando apresenta apenas um método abstrato
//métodos abstratos possuem uma implementação default
