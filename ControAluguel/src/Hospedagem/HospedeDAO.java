//nome, cpf, endereço, celular, telefone, emailContato.
package Hospedagem;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author daniel
 */
public class HospedeDAO {
    
    public void adicionarHospede(Hospede hospede){
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO CONTA(nome, cpf, endereco, celular, telefone, emailContato) VALUES(?,?,?,?,?,?)");
            stmt.setString(1, hospede.getNome());
            stmt.setString(2, hospede.getCpf());
            stmt.setString(3, hospede.getEndereco());
            stmt.setString(4, hospede.getCelular());
            stmt.setString(5, hospede.getTelefone());
            stmt.setString(6, hospede.getEmailContato());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(stmt, conexao);
        }
    }
    
    public List<Hospede> listarHospede() {
        List<Hospede> listaRetorno = new LinkedList<>();

        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM HOSPEDE ORDER BY NOME");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Hospede hospede = new Hospede(rs.getString("nome"), rs.getString("cpf"),rs.getString("endereco"),
                        rs.getString("celular"), rs.getString("telefone"),rs.getString("emailContato")); 
                        
                listaRetorno.add(hospede);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return listaRetorno;
    }
    
    public Hospede getHospedePeloNome(String nomeDoHospede) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM CONTA WHERE NOME=?");
            stmt.setString(1, nomeDoHospede);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Hospede hospede = new Hospede(rs.getString("nome"), rs.getString("cpf"),rs.getString("endereco"),
                        rs.getString("celular"), rs.getString("telefone"),rs.getString("emailContato")); 
                return hospede;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }
        return null;
    }
    
    public void updateHospede(Hospede hospede) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("UPDATE HOSPEDE SET nome=?, cpf=?, endereco=?, celular=?, telefone=?, emailContato=? WHERE NOME=?");
            stmt.setString(1, hospede.getNome());
            stmt.setString(2, hospede.getCpf());
            stmt.setString(3, hospede.getEndereco());
            stmt.setString(4, hospede.getCelular());
            stmt.setString(5, hospede.getTelefone());
            stmt.setString(6, hospede.getEmailContato());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(stmt, conexao);
        }
    }
    
    public void deletarHospede(String cpf) {

        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM HOSPEDE WHERE CPF=?");
            stmt.setString(1, cpf);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }

    void updateHospede(CadastroHospede hospede) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
