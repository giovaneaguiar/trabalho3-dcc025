public class Desenvolvedor extends Funcionario {

    public Desenvolvedor(String nome, String numeroCpf, String cargo, float salario) {
        super(nome, numeroCpf, cargo, salario);
    }

    public void sobeDeNivel()
    {
        this.recebeAumento(this.getSalario() * 0.75);
    }

    public float calculaBonificacao(){
        return 500.0F;
    }
}
