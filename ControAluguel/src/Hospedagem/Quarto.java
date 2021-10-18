/**
 * 1 - Crie uma classe para representar um quarto. 
 * O quarto possui valor da diária, número máximo de pessoas que podem ser hospedadas, 
 * indicador se possui ar condicionado  e indicador se possui banheira de hidromassagem.
 */

package Hospedagem;

/**
 *
 * @author daniel
 */
public class Quarto {
    private float valorDiaria;
    private int numeroMaximo;
    private boolean possuiAr;
    private boolean possuiBanheiraHidro;

    public Quarto(float valorDiaria, int numeroMaximo, boolean possuiAr, boolean possuiBanheiraHidro) {
        this.valorDiaria = valorDiaria;
        this.numeroMaximo = numeroMaximo;
        this.possuiAr = possuiAr;
        this.possuiBanheiraHidro = possuiBanheiraHidro;
    }

    public float getValorDiaria() {
        return valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public int getNumeroMaximo() {
        return numeroMaximo;
    }

    public void setNumeroMaximo(int numeroMaximo) {
        this.numeroMaximo = numeroMaximo;
    }

    public boolean isPossuiAr() {
        return possuiAr;
    }

    public void setPossuiAr(boolean possuiAr) {
        this.possuiAr = possuiAr;
    }

    public boolean isPossuiBanheiraHidro() {
        return possuiBanheiraHidro;
    }

    public void setPossuiBanheiraHidro(boolean possuiBanheiraHidro) {
        this.possuiBanheiraHidro = possuiBanheiraHidro;
    }

    @Override
    public String toString() {
        return "Informacoes sobre o Quarto:" + "\nValor da Diaria -> " + valorDiaria + "\nNumero Maximo de Hospedes -> " 
            + numeroMaximo + "\nPossui Ar-condicionado -> " + possuiAr + "\nPossui Banheira de Hidromassagem -> " 
            + possuiBanheiraHidro;
    }
    
    
}
