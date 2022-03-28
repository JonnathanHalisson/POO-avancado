package aula02;

public class Conta {
    int numero;
    String nome;
    double saldo;
    double limite;

    void saca(double quantidade){
        double novoSaldo = this.saldo - quantidade;
        this.saldo = novoSaldo;
    }

//    void saca(double saldo, double quantidade){
//        double novoSaldo = this.saldo - quantidade;
//        this.saldo = novoSaldo;
//    }
}

