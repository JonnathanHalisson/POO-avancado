package OperarCarro;

import direção.Direction;

public class OperateCar extends Carro implements Interface.OperateCar {

    public OperateCar(boolean acelerar, boolean iniciar, boolean parar, boolean re) {
        super(acelerar, iniciar, parar, re);
    }

    @Override
    public Direction irParaDireita() {
        return setDirection(Direction.RIGHT);
    }

    @Override
    public Direction irParaEsquerda() {
        return setDirection(Direction.LEFT);
    }

    @Override
    public boolean irParaFrente() {
        return setIniciar(true);
    }

    @Override
    public boolean irParaTras() {
        return setRe(true);
    }

    @Override
    public boolean acelerar() {
        return setAcelerar(true);
    }

    @Override
    public boolean parar() {
        return setParar(true);
    }

    @Override
    public boolean freiar() {
        return setFreiar(true);
    }

}
