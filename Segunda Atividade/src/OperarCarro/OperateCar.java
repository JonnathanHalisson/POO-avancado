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
        return setIniciar(isIniciar());
    }

    @Override
    public boolean irParaTras() {
        return setRe(isRe());
    }

    @Override
    public boolean acelerar() {
        return setAcelerar(isAcelerar());
    }

    @Override
    public boolean parar() {
        return setParar(isParar());
    }

    @Override
    public boolean freiar() {
        return setFreiar(isFreiar());
    }

}
