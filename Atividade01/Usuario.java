public class Usuario{
    //Atributos
    private String nome;
    private String telefone;
    private String matricula;
    private int CPF;

    //Construtor
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return this.telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getCPF() {
        return this.CPF;
    }

    public void setCPF(int CPF) {
        this.CPF = CPF;
    }
   

    @Override
    public String toString() {
        return
            "Nome: " + getNome() +
            "\nTelefone: " + getTelefone() +
            "\nMatricula: " + getMatricula() +
            "\nCPF: " + getCPF();
    }
    
}