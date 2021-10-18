/*
 * 3 - Faça uma classe para representar o hóspede que aluga um quarto contendo as informações: 
    nome, cpf, endereço, celular, telefone, email de contato.
 */
package Hospedagem;

/**
 *
 * @author daniel
 */
public class Hospede {
    private String nome;
    private String cpf;
    private String endereco;
    private String celular;
    private String telefone;
    private String emailContato;

    public Hospede(String nome, String cpf, String endereco, String celular, String telefone, String emailContato) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.celular = celular;
        this.telefone = telefone;
        this.emailContato = emailContato;
    }

    Hospede(String string, String string0, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmailContato() {
        return emailContato;
    }

    public void setEmailContato(String emailContato) {
        this.emailContato = emailContato;
    }

    @Override
    public String toString() {
        return "Informacoes sobre o Hospede:" + "\nNome -> " + nome + "\nCPF" + cpf + "\nEndereco -> " + endereco + 
            "\nNumero de Celular -> " + celular + "\nNumero de Telefone -> " + telefone + "\nEmail para Contato ->" 
            + emailContato;
    }
    
    
}
