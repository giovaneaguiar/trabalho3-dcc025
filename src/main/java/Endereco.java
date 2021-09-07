public class Endereco {

    private String cidade;
    private String bairro;
    private String rua;
    private String numero;

    public Endereco(String cidade, String bairro, String rua, String numero) {
        if (cidade == null) {
            throw new IllegalArgumentException("Cidade nula!");
        }
        if (bairro == null) {
            throw new IllegalArgumentException("Bairro nulo!");
        }
        if (rua == null) {
            throw new IllegalArgumentException("Rua nula!");
        }
        if (numero == null) {
            throw new IllegalArgumentException("Número nulo!");
        }

        this.cidade = cidade;
        this.bairro = bairro;
        this.rua = rua;
        this.numero = numero;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

}