package telefone;

public class Telefone {

    private int numeroTelefone;

    public Telefone(int numeroTelefone) {
        this.setNumeroTelefone(numeroTelefone);
    }

    public Telefone() {

    }


    public int getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(int numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }
}
