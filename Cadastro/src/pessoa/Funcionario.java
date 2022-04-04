package pessoa;

import java.util.Date;

public class Funcionario extends Pessoa{
    private int matricula;
    private float salario;
    private Date dataAdmissao;
    private String cargo;


    public Funcionario(int matricula, float salario, Date dataAdmissao, String endereco, int numeroTelefone, Date dataNascimento, String cargo) {
        // usar o java.sql.Date.valueOf("ANO-MES-DIA") para a data
        super();
        this.setMatricula(matricula);
        this.setSalario(salario);
        this.setDataAdmissao(dataAdmissao);
        this.setEndereco(endereco);
        this.setNumeroTelefone(numeroTelefone);
        this.setDataNascimento(dataNascimento);
        this.setCargo(cargo);
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public Date getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(Date dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }


    public void reajustarSalario(int percentual){
        this.salario = (getSalario() * percentual / 100) + getSalario();
    }

    public void promover(String novoCargo){
        this.cargo = novoCargo;
    }

    @Override
    public String toString() {
        return "Matricula: " + matricula + "\n" +
                "Numero de telofone: " + getNumeroTelefone() + "\n" +
                "Endereço: " + getEndereco()  + "\n" +
                "Data de nascimento: " + getDataNascimento() + "\n" +
                "Data de Admissão: " + dataAdmissao + "\n" +
                "Salário: " + salario + "\n" +
                "Cargo: " + cargo  + "\n"
                ;
    }
}
