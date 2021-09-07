public class ControladorDeBonificacoes {
    private float totalDeBonificacoes = 0;

    public void adicionaBonificacaoDe(Funcionario funcionario){
        this.totalDeBonificacoes += funcionario.calculaBonificacao();
    }

    public float recuperaTotalDeBonificacoes()
    {
        return this.totalDeBonificacoes;
    }
}
