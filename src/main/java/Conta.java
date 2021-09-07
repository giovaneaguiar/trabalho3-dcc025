public abstract class Conta {

    private Titular titular;
    private float saldo;
    private int numeroDeContas;

    public Titular getTitular() {
        return titular;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public int getNumeroDeContas() {
        return numeroDeContas;
    }

    public void setNumeroDeContas(int numeroDeContas) {
        this.numeroDeContas = numeroDeContas;
    }

    public Conta(Titular titular, float saldo, int numeroDeContas) {
        this.titular = titular;
        this.saldo = saldo;
        this.numeroDeContas++;
    }

    public float saca(float valorASacar)
    {
        float tarifaSaque = valorASacar * this.percentualTarifa();
        float  valorSaque = valorASacar + tarifaSaque;
        if (valorSaque > this.saldo) {
             throw new NullPointerException("Saque indisponível!");
        }

         return this.saldo -= valorSaque;
    }

    public float deposita(float valorADepositar)
    {
        if (valorADepositar < 0) {
            throw new NullPointerException("O valor a depositar precisa ser positivo!");
        }
         return this.saldo += valorADepositar;
    }

    abstract protected float percentualTarifa();

}
