public class ContaPoupanca extends Conta
{
    public ContaPoupanca(Titular titular, float saldo, int numeroDeContas) {
        super(titular, saldo);

        if (titular == null) {
            throw new IllegalArgumentException("Conta sem titular!");
        }
        if (saldo == 0) {
            throw new NullPointerException("Conta sem saldo!");
        }
        if (numeroDeContas == 0) {
            throw new NullPointerException("Sem contas cadastradas!");
        }
    }

    protected float percentualTarifa()
    {
        return (float) 0.03;
    }
}

