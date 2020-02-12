public class ContaPoupanca extends Contas {
    private  double juros;

    public ContaPoupanca(Clientes clientes, double saldo, double juros) {
        super(clientes, saldo);
        this.juros = juros;
    }

    public void recolherJuros(){
     this.juros = getSaldo() * (juros / 100);
        setSaldo(getSaldo()+ juros);
        System.out.println("O valor com juros " + getSaldo());
    }



}
