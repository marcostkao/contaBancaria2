import javax.sql.rowset.JoinRowSet;

public class Main {

    public static void main(String[] args) {
        Clientes cliente1 = new Clientes("Marcos", "444444445", "05332233334");
        Clientes cliente2 = new Clientes("José", "123345678", "45666678788");
        Clientes cliente3 = new Clientes("Maria", "83784728347", "783837328323");


        Contas conta1 = new Contas(cliente1, 1000);

        conta1.deposito( 10);
        conta1.saque( 900);

        ContaPoupanca conta2 = new ContaPoupanca(5000);

        conta2.deposito(20);
        conta2.saque(700);




    }

}