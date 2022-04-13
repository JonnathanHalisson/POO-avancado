
import OperarCarro.OperateCar;

public class Main {
    public static void main(String[] args) {

        OperateCar op = new OperateCar(false,false,false,false);

        op.irParaFrente();
        op.irParaEsquerda();
        op.irParaTras();


        System.out.println(op.getDirection());

    }
}
