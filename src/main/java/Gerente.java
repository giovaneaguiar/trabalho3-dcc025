public class Gerente extends Funcionario implements Autenticavel {

    public Gerente(String nome, String numeroCpf, String cargo, float salario) {
        super(nome, numeroCpf, cargo, salario);
    }

    public float calculaBonificacao()
    {
        return this.getSalario();
    }

    public boolean funcionarioPodeAutenticar(String senha)
    {
        return senha.equals("4321");

    }
}
