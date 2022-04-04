package pessoa;

import endereco.Endereco;

import java.util.Calendar;
import java.util.Date;

public class Pessoa extends Endereco {
    private String nome;
    private String profissao;
    private Date dataNascimento;


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }


    public Date getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public int obterIdade() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(getDataNascimento());

        return 2022 - calendar.get(Calendar.YEAR);
    }
}
