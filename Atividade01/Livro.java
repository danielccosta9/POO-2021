import java.util.Date;

public class Livro {
    //Atributos
    private String titulo, autor, editora, ISBN;
    private Date ano;
    private int edicao;

    //Construtor
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }


    public String getEditora() {
        return this.editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getISBN() {
        return this.ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public Date getAno() {
        return this.ano;
    }

    public void setAno(Date ano) {
        this.ano = ano;
    }

    public int getEdicao() {
        return this.edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }



    @Override
    public String toString() {
        return "{" +
            " titulo='" + getTitulo() + "'" +
            ", autor='" + getAutor() + "'" +
            ", editora='" + getEditora() + "'" +
            ", ISBN='" + getISBN() + "'" +
            ", ano='" + getAno() + "'" +
            ", edicao='" + getEdicao() + "'" +
            "}";
    }  
}
