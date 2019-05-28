package JavaStudies;

public class Cliente  implements Autentica{

    private String nome;
    private Boolean status;
    private String senha;
    private int pontos;

    public Cliente(String nome, Boolean status, String senha, int pontos) {
        this.nome = nome;
        this.status = status;
        this.senha = senha;
        this.pontos = pontos;
    }

    public Cliente(String ana, boolean b, String s) {
    }

    public String getNome() {
        System.out.println(this.nome);
        return nome;
    }

    public Boolean getStatus() {
        return status;
    }

    public String getSenha() {
        return senha;
    }
    public int getPontos() {
        return this.pontos;
    }


    @Override
    public boolean autenticaSenha(String senha) {
        if (this.senha != senha){
            System.out.println("Não autenticado");
            return false;
        }
        System.out.println("Autenticado");
        return true;
    }
}
