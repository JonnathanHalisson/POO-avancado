package Interface;

import direção.Direction;

public interface OperateCar {

    public Direction irParaDireita();
    public Direction irParaEsquerda();
    public boolean irParaFrente();
    public boolean irParaTras();
    public boolean acelerar();
    public boolean parar();
    public boolean freiar();

}
