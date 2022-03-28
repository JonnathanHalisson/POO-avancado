package aula02;

public class ContaApp {
    public static void main(String[] args) {
        Conta c /*referencia do objeto*/ = new Conta(); //criou um objeto, instanciou.

        c.saca(2.0);

        System.out.println(c);

    }
}
