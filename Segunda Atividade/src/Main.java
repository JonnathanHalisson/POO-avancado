
import OperarCarro.OperateCar;

public class Main {
    public static void main(String[] args) {

        OperateCar op = new OperateCar(false,false,false,false);

        op.irParaFrente();


        System.out.println(op.isIniciar());

    }
}
