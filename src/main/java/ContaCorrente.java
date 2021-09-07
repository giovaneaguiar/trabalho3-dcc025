    public class ContaCorrente extends Conta
{
    public ContaCorrente(Titular titular, float saldo, int numeroDeContas) {
        super(titular, saldo, numeroDeContas);
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

    protected float percentualTarifa(){

        return (float) 0.05;
    }

    public void transfere(float valorATransferir, Conta contaDestino){
        if (valorATransferir > this.getSaldo()){
            throw new IllegalArgumentException("Falha na transferência: Saldo indisponível!");
        }
        this.saca(valorATransferir);
        contaDestino.deposita(valorATransferir);
    }
}
