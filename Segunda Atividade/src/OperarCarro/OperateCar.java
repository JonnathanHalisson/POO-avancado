package OperarCarro;

import direção.Direction;

public class OperateCar extends Carro implements Interface.OperateCar {

    public OperateCar(boolean acelerar, boolean iniciar, boolean parar, boolean re) {
        super(acelerar, iniciar, parar, re);
    }

    @Override
    public void irParaDireita() {
        setDirection(Direction.RIGHT);
    }

    @Override
    public void irParaEsquerda() {
        setDirection(Direction.LEFT);
    }

    @Override
    public void irParaFrente() {
        setIniciar(true);
    }

    @Override
    public void irParaTras() {
        setRe(true);
    }

    @Override
    public void acelerar() {
        setAcelerar(true);
    }

    @Override
    public void parar() {
        setParar(true);
    }

    @Override
    public void freiar() {
        setFreiar(true);
    }

}
