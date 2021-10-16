/*
 * 4- Construa uma classe para representar o aluguel de um quarto contendo informações sobre: 
   o hóspede, o quarto alugado, a data e hora de entrada e de saída. 
    Esta classe deve conter métodos para calcular o número de diárias e o valor a ser pago pelo locatário. 
    As diárias iniciam e terminam sempre às 12h.
 */
package Hospedagem;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;

/**
 *
 * @author daniel
 */
public class Aluguel{
    private Quarto quarto;
    private Hospede hospede;
    private LocalDateTime dataHoraEntrada;
    private LocalDateTime dataHoraSaida;

    public Aluguel(Quarto quarto, Hospede hospede, LocalDateTime dataHoraEntrada, LocalDateTime dataHoraSaida) {
        this.quarto = quarto;
        this.hospede = hospede;
        this.dataHoraEntrada = dataHoraEntrada;
        this.dataHoraSaida = dataHoraSaida;
    }

    
    public void calcularDiaria(){
        int diaria = 0;
        
    }
    
    public void valorDiaria(){
        
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

    public LocalDateTime getDataHoraEntrada() {
        return dataHoraEntrada;
    }

    public void setDataHoraEntrada(LocalDateTime dataHoraEntrada) {
        this.dataHoraEntrada = dataHoraEntrada;
    }

    public LocalDateTime getDataHoraSaida() {
        return dataHoraSaida;
    }

    public void setDataHoraSaida(LocalDateTime dataHoraSaida) {
        this.dataHoraSaida = dataHoraSaida;
    }

    @Override
    public String toString() {
        return "Informacoes sobre o Aluguel:" + "\nQuarto -> " + quarto + "\nHospede -> " + hospede + 
            "\nData e Hora da Entrada -> " + dataHoraEntrada + "\nData e Hora da Saida -> " + dataHoraSaida;
    }
    
    
}
