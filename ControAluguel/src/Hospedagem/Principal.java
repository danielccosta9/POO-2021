package Hospedagem;

/**
 *
 * @author daniel
 */
public class Principal {
    public static void main(String[] args) throws Exception{
        HospedeDAO h = new HospedeDAO();
        //nome, cpf, endereço, celular, telefone, email de contato.
        Hospede hospede1 = new Hospede("Daniel", "000.000.000-00", "Araçagi", "(83) 000000-0000", "(83) 000000-0000", "Eumesmo@gmail.com");
        h.adicionarHospede(hospede1);
        System.out.println(h.listarHospede());
        Hospede hospede2 = new Hospede("Amorim", "111.111.111-11", "Guarabira", "(83) 000000-0000", "(83) 000000-0000", "Amorim@gmail.com");
        h.adicionarHospede(hospede2);
        System.out.println(h.listarHospede());
        System.out.println(h.getHospedePeloNome("Daniel"));
        h.deletarHospede("111.111.111-11");
        System.out.println(h.listarHospede());
        
    }
    
}
