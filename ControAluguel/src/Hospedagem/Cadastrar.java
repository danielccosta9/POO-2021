/*
 * 5 -  Implemente uma classe chamada CadastroResidencia para cadastrar as residências, uma chamada 
   CadastroHospede para cadastrar os hóspedes e uma chamada CadastroAluguel para cadastrar os aluguéis
 */
package Hospedagem;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

/**
 *
 * @author daniel
 */
public class Cadastrar {
    private List<Residencia> residencia;
    private List<Hospede> hospede;
    private List<Aluguel> aluguel;
    private String arquivoCSV;

    public Cadastrar(List<Residencia> residencia, List<Hospede> hospede, List<Aluguel> aluguel) {
        this.residencia = residencia;
        this.hospede = hospede;
        this.aluguel = aluguel;
        arquivoCSV = "Hospedagem.csv";
    }
  
  
  
    public void CadastroResidencia(Residencia r){
        residencia.add(r);
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(arquivoCSV, true);
            bw = new BufferedWriter(fw);
            bw.write(r.getRua() + ";" + r.getNumero() + ";" + r.getBairro() + ";" + r.getCep() + ";" 
                    + r.getTelefone() + ";" + r.getEmail() + ";" + r.getQuarto());
            bw.newLine();            
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally{
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if (fw != null){
                try {
                    fw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        System.out.println("Residencia Cadastrada Com Sucesso!");
    }
    
    public void CadastroHospede(Hospede h){
        hospede.add(h);
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(arquivoCSV, true);
            bw = new BufferedWriter(fw);
            bw.write(h.getNome() + ";" + h.getCpf() + ";" + h.getEndereco() + ";" + h.getCelular()
                    + ";" + h.getTelefone() + ";" + h.getEmailContato());
            bw.newLine();            
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally{
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if (fw != null){
                try {
                    fw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        System.out.println("Hospede Cadastrato Com Sucesso!");
    }
    
    public void CadastroAluguel(Aluguel a){
        aluguel.add(a);
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(arquivoCSV, true);
            bw = new BufferedWriter(fw);
            bw.write(a.getQuarto() + ";" + a.getHospede() + ";" + a.getDataHoraEntrada() + ";" + a.getDataHoraSaida());
            bw.newLine();            
        } catch (IOException ex) {
            ex.printStackTrace();
        }finally{
            if (bw != null){
                try {
                    bw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
            if (fw != null){
                try {
                    fw.close();
                } catch (IOException ex) {
                    ex.printStackTrace();
                }
            }
        }
        System.out.println("Aluguel Cadastrato Com Sucesso!");
    }
}
