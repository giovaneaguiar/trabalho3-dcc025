
public class Titular extends Pessoa
{
    private Endereco endereco;

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Titular(String nome, String numeroCpf, Endereco endereco) {
        super(nome, numeroCpf);
        this.endereco = endereco;
    }

}