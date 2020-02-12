public class Clientes {

    private String nome;
    private String rg;
    private String cpf;

    public Clientes(String nome, String RG, String CPF) {
        this.setNome(nome);
        this.setRg(getRg());
        this.setCpf(getCpf());
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}





