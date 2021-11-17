import java.util.Date;

public class Emprestimo{
    //Atributo
    private Date dataDeEmprestimo, dataPrevistaDeDevolucao, dataDeEntregaReal;
    private int situacao;

    //Construtor
    public Date getDataDeEmprestimo() {
        return this.dataDeEmprestimo;
    }

    public void setDataDeEmprestimo(Date dataDeEmprestimo) {
        this.dataDeEmprestimo = dataDeEmprestimo;
    }

    public Date getDataPrevistaDeDevolucao() {
        return this.dataPrevistaDeDevolucao;
    }

    public void setDataPrevistaDeDevolucao(Date dataPrevistaDeDevolucao) {
        this.dataPrevistaDeDevolucao = dataPrevistaDeDevolucao;
    }

    public Date getDataDeEntregaReal() {
        return this.dataDeEntregaReal;
    }

    public void setDataDeEntregaReal(Date dataDeEntregaReal) {
        this.dataDeEntregaReal = dataDeEntregaReal;
    }

    public int getSituacao() {
        return this.situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }


    @Override
    public String toString() {
        return "{" +
            " dataDeEmprestimo='" + getDataDeEmprestimo() + "'" +
            ", dataPrevistaDeDevolucao='" + getDataPrevistaDeDevolucao() + "'" +
            ", dataDeEntregaReal='" + getDataDeEntregaReal() + "'" +
            ", situacao='" + getSituacao() + "'" +
            "}";
    }
}