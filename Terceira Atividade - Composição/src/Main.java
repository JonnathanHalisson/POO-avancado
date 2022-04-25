import Horario.Horario;
import Produto.Produto;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner entrada = new Scanner(System.in);
        int hora, minuto, segundo;
        float preco;
        String dia;
        Horario horario;
        Produto produto;

        System.out.print("Digite a hora: ");
        hora = entrada.nextInt();

        System.out.print("Digite o minuto: ");
        minuto = entrada.nextInt();

        System.out.print("Digite o segundo: ");
        segundo = entrada.nextInt();

        System.out.print("Digite o dia: ");
        dia = entrada.next();

        System.out.print("Preco do produto: ");
        preco = entrada.nextFloat();

        horario = new Horario(dia, hora, minuto, segundo);
        produto = new Produto(preco);

        produto.calculaPreco(horario, horario);

        System.out.println("Preço do produto: "+produto.getPreco());

    }
}
