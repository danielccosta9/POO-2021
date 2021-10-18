/*
 * 4- Construa uma classe para representar o aluguel de um quarto contendo informações sobre: 
   o hóspede, o quarto alugado, a data e hora de entrada e de saída. 
    Esta classe deve conter métodos para calcular o número de diárias e o valor a ser pago pelo locatário. 
    As diárias iniciam e terminam sempre às 12h.
 */
package Hospedagem;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
/**
 *
 * @author daniel
 */
public class Aluguel{
    private Quarto quarto;
    private Hospede hospede;
    private String entradaDia;
    private String saidaDia;
    private String entradaHora;
    private String saidaHora;
    private long diaria;

    public Aluguel(Quarto quarto, Hospede hospede, String entradaDia, String saidaDia, String entradaHora, String saidaHora, long diaria) {
        this.quarto = quarto;
        this.hospede = hospede;
        this.entradaDia = entradaDia;
        this.saidaDia = saidaDia;
        this.entradaHora = entradaHora;
        this.saidaHora = saidaHora;
        this.diaria = 0;
    }

    public void calcularDiaria(){
        LocalDate entradaD = LocalDate.now();
        LocalTime entradaH = LocalTime.now();
        
        LocalDate saida = LocalDate.now();
        LocalTime saidaH = LocalTime.now();
        
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        
        entradaD = LocalDate.parse(entradaDia, dtf);
        entradaH = LocalTime.parse(entradaHora);
        
        saida = LocalDate.parse(saidaDia, dtf);
        saidaH = LocalTime.parse(saidaHora);
        
        System.out.println("Entrada: " + entradaD.format(dtf) + " as " + entradaH);
        System.out.println("Saida: " + saida.format(dtf) + " as " + saidaH);
        
        diaria = ChronoUnit.DAYS.between(entradaD, saida);
        
        String[] hora = saidaHora.split(":");
        
        if (Integer.parseInt(hora[0]) >= 12){
            diaria += 1;
        }
        System.out.println("Diaria: " + diaria);
    }
    
    public void valorDiarias(){     
        System.out.print("O valor total das diarias: R$ " + (diaria * quarto.getValorDiaria()));
    }

    public Quarto getQuarto() {
        return quarto;
    }

    public void setQuarto(Quarto quarto) {
        this.quarto = quarto;
    }

    public Hospede getHospede() {
        return hospede;
    }

    public void setHospede(Hospede hospede) {
        this.hospede = hospede;
    }

    public String getEntradaDia() {
        return entradaDia;
    }

    public void setEntradaDia(String entradaDia) {
        this.entradaDia = entradaDia;
    }

    public String getSaidaDia() {
        return saidaDia;
    }

    public void setSaidaDia(String saidaDia) {
        this.saidaDia = saidaDia;
    }

    public String getEntradaHora() {
        return entradaHora;
    }

    public void setEntradaHora(String entradaHora) {
        this.entradaHora = entradaHora;
    }

    public String getSaidaHora() {
        return saidaHora;
    }

    public void setSaidaHora(String saidaHora) {
        this.saidaHora = saidaHora;
    }

    public long getDiaria() {
        return diaria;
    }

    public void setDiaria(long diaria) {
        this.diaria = diaria;
    }
      
}
