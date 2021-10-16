/**
 * 2 - Implemente uma classe para representar uma residência contendo as informações: 
 * rua, número, bairro, cep, telefone, email e uma lista de quartos que podem ser alugados. 
 */

package Hospedagem;

import java.util.ArrayList;

/**
 *
 * @author daniel
 */
public class Residencia{
    private String rua;
    private int numero;
    private String bairro;
    private String cep;
    private String telefone;
    private String email;
    private ArrayList<Quarto> quarto = new ArrayList();

    public Residencia(String rua, int numero, String bairro, String cep, String telefone, String email, ArrayList<Quarto> quarto){
    this.rua = rua;
    this.numero = numero;
    this.bairro = bairro;
    this.cep = cep;
    this.telefone = telefone;
    this.email = email;
    this.quarto = quarto;
  }

   

    

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public ArrayList<Quarto> getQuarto() {
        return quarto;
    }

    public void setQuarto(ArrayList<Quarto> quarto) {
        this.quarto = quarto;
    }

    

    @Override
    public String toString() {
        return "Informacoes sobre a Residencia:" + "\nNome da Rua -> " + rua + "\nNumero -> " + numero + 
            "\nBairro -> " + bairro + "\nCEP -> " + cep + "\nTelefone -> " + telefone + "\nEmail -> " + email + 
            "Quartos -> " + quarto;
    }

    
    
    
}
