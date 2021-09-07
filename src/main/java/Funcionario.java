public abstract class Funcionario extends Pessoa
{
    private String cargo;
    private float salario;

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Funcionario(String nome, String numeroCpf, String cargo, float salario)
    {
        super(nome, numeroCpf);
        if (cargo == null) {
            throw new IllegalArgumentException("Cargo nulo!");
        }
        if ( salario == 0) {
            throw new NullPointerException("Salário nulo!");
        }
        this.cargo = cargo;
        this.salario = salario;
    }

    public float recebeAumento(double valorAumento)
    {
        if (valorAumento <= 0 ) {
            throw new IllegalArgumentException("O aumento deve ser positivo!");
        }
        return this.salario += valorAumento;
    }

    abstract public float calculaBonificacao();
}
