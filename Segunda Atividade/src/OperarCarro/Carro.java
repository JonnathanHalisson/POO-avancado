package OperarCarro;

import direção.Direction;

public class Carro {

    private boolean acelerar;
    private Direction direction;
    private boolean iniciar;
    private boolean parar;
    private boolean re;
    private boolean freiar;

    public Carro(boolean acelerar, boolean iniciar, boolean parar, boolean re) {
    }


    public boolean isFreiar() {
        return freiar;
    }

    public boolean setFreiar(boolean freiar) {
        this.freiar = freiar;
        return freiar;
    }

    public boolean isAcelerar() {
        return acelerar;
    }

    public boolean setAcelerar(boolean acelerar) {
        this.acelerar = acelerar;
        return acelerar;
    }


    public Direction setDirection(Direction direction) {
        this.direction = direction;
        return direction;
    }

    public boolean isIniciar() {
        return iniciar;
    }

    public boolean setIniciar(boolean iniciar) {
        this.iniciar = iniciar;
        return iniciar;
    }

    public boolean isParar() {
        return parar;
    }

    public boolean setParar(boolean parar) {
        this.parar = parar;
        return parar;
    }

    public boolean isRe() {
        return re;
    }

    public boolean setRe(boolean re) {
        this.re = re;
        return re;
    }
}
