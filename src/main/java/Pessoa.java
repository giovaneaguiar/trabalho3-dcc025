import javax.imageio.IIOException;

public class Pessoa {

    private String nome;
    private String numeroCpf;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumeroCpf() {
        return numeroCpf;
    }

    public void setNumeroCpf(String numeroCpf) {
        this.numeroCpf = numeroCpf;
    }

    public Pessoa(String nome, String numeroCpf) {
        super();
        if ( nome == null || nome.equals("")) {
            throw new IllegalArgumentException("Nome nulo!");
        }
        if (nome.length() < 3 ){
            throw new IllegalArgumentException("O nome precisa ter pelo menos 3 caracteres");
        }
        if (numeroCpf == null || numeroCpf.equals("")){
            throw new IllegalArgumentException("CPF nulo!");
        }
        this.nome = nome;
        this.numeroCpf = numeroCpf;
    }
}
