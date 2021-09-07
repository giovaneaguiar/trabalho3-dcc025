public class ControladorDeBonificacoes
{
    private float totalDeBonificacoes = 0;

    public float adicionaBonificacaoDe(Funcionario funcionario)
    {
        return this.totalDeBonificacoes += funcionario.calculaBonificacao();
    }

    public float recuperaTotalDeBonificacoes()
    {
        return this.totalDeBonificacoes;
    }
}
