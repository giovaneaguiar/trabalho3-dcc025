public class EditorDeVideo extends Funcionario
{
    public EditorDeVideo(String nome, String numeroCpf, String cargo, float salario)
    {
        super(nome, numeroCpf, cargo, salario);
    }

    public float calculaBonificacao()
    {
        return (float) 600;
    }
}
