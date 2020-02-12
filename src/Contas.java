public class Contas  {

    private Clientes clientes;
    private double saldo;

    public Contas(){

    }

    public Contas(Clientes clientes, double saldo){
        this.saldo = saldo;
        this.clientes = clientes;

    }


    public void saque( double valor){
        if( saldo >= valor){
        this.saldo -= valor;
            System.out.println("seu saldo atual é: "  + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }


    public void deposito(double valor){
        if(valor > 0){
        this.saldo += valor;
            System.out.println("Deposito realizaado com sucesso!");
        } else {
            System.out.println("Valor invalido para Depósito!");
        }
    }



    public Clientes getClientes() {
        return clientes;
    }

    public void setClientes(Clientes clientes) {
        this.clientes = clientes;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

}
