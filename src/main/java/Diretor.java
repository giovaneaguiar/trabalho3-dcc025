public class Diretor extends Funcionario implements Autenticavel
{
    public Diretor(String nome, String numeroCpf, String cargo, float salario)
    {
        super(nome, numeroCpf, cargo, salario);
    }

    public float calculaBonificacao()
    {
        return this.getSalario() * 2;
    }

    public boolean funcionarioPodeAutenticar(String senha)
    {
        return senha.equals("1234");
    }
}
