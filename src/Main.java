import javax.sql.rowset.JoinRowSet;

public class Main {

    public static void main(String[] args) {
        Clientes cliente1 = new Clientes("Marcos", "444444445", "05332233334");

        Contas conta1 = new ContaPoupanca(cliente1, 200, 5);
        ((ContaPoupanca) conta1).recolherJuros();

















    }

}