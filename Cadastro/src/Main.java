import pessoa.Cliente;
import pessoa.Funcionario;

public class Main {

    public static void main(String[] args) {

        Funcionario f1 = new Funcionario(10, 1200, java.sql.Date.valueOf("1996-04-11"), "rua", 80808080, java.sql.Date.valueOf("1000-04-14"), "logista");


        System.out.println(f1);

        f1.reajustarSalario(10);

        f1.promover("programador");

        System.out.println(f1);

        Cliente c1 = new Cliente(11, "Ruazinha", 909090, java.sql.Date.valueOf("1996-04-11"));

        System.out.println(c1);

    }
}
