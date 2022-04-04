package endereco;

import telefone.Telefone;


public class Endereco  extends Telefone {
    private String endereco;

    public Endereco(String endereco) {
        this.setEndereco(endereco);
    }

    public Endereco() {
        super();
    }


    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}
