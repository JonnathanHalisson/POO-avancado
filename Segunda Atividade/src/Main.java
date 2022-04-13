
import OperarCarro.OperateCar;

public class Main {
    public static void main(String[] args) {

        OperateCar op = new OperateCar(false,false,false,false);

        op.irParaFrente();
        op.irParaDireita();
        op.irParaEsquerda();
        op.acelerar();
        op.irParaTras();
        op.parar();
        op.freiar();


    }
}
