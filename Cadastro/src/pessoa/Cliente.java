package pessoa;

import java.util.Date;

public class Cliente extends Pessoa{
    private int codigo;

    public Cliente(int codigo, String endereco, int numeroTelefone, Date dataNascimento) {
        super();
        this.setCodigo(codigo);
        this.setDataNascimento(dataNascimento);
        this.setNumeroTelefone(numeroTelefone);
        this.setEndereco(endereco);
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Cliente" + "\n" +
                "Código: " + codigo + "\n" +
                "Número de telefone: " + getNumeroTelefone() + "\n" +
                "Endereço: " + getEndereco() + "\n" +
                "Idade: " + obterIdade() + "\n" +
                "Data de nascimento: " + getDataNascimento() + "\n"
                ;
    }
}


