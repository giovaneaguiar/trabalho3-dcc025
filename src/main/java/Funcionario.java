public abstract class Funcionario extends Pessoa {
    private String cargo;

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

    private float salario;

    public Funcionario(String nome, String numeroCpf, String cargo, float salario) {
        super(nome, numeroCpf);
        this.cargo = cargo;
        this.salario = salario;

    }

    public void recebeAumento(double valorAumento){
        if (valorAumento <= 0 ){
            throw new IllegalArgumentException("O aumento deve ser positivo!");
        }
        this.salario += valorAumento;
    }

    abstract public float calculaBonificacao();

}
