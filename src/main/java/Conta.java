public abstract class Conta
{
    private Titular titular;
    private float saldo;

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

    public Conta(Titular titular, float saldo) {
        this.titular = titular;
        this.saldo = saldo;
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
