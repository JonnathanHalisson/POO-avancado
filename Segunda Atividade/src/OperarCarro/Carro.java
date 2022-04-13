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

    public void setFreiar(boolean freiar) {
        this.freiar = freiar;

    }

    public boolean isAcelerar() {
        return acelerar;
    }

    public void setAcelerar(boolean acelerar) {
        this.acelerar = acelerar;
    }

    public Direction getDirection() {
        return direction;
    }

    public void setDirection(Direction direction) {
        this.direction = direction;
    }

    public boolean isIniciar() {
        return iniciar;
    }

    public void setIniciar(boolean iniciar) {
        this.iniciar = iniciar;
    }

    public boolean isParar() {
        return parar;
    }

    public void setParar(boolean parar) {
        this.parar = parar;

    }

    public boolean isRe() {
        return re;
    }

    public void setRe(boolean re) {
        this.re = re;
    }
}
