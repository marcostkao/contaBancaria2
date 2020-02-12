public class ContaPoupanca extends Contas {
    private double limite;


    public ContaPoupanca( double saldo){

    }



    public void recolherJuros(double juros){
     juros = getSaldo() * 0.5;
        System.out.println("O valor com juros " + juros);
    }



}
