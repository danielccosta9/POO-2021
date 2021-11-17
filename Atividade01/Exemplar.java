public class Exemplar{
    //Atributos
    private int codigo;
    private boolean cativa, emprestada;

    //Construtor

    public int getCodigo() {
        return this.codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public boolean getCativa() {
        return this.cativa;
    }

    public void setCativa(boolean cativa) {
        this.cativa = cativa;
    }

    public boolean getEmprestada() {
        return this.emprestada;
    }

    public void setEmprestada(boolean emprestada) {
        this.emprestada = emprestada;
    }


    @Override
    public String toString() {
        return "{" +
            " codigo='" + getCodigo() + "'" +
            ", cativa='" + getCativa() + "'" +
            ", emprestada='" + getEmprestada() + "'" +
            "}";
    }


}