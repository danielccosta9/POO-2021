//rua, número, bairro, cep, telefone, email 
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
public class ResidenciaDAO {
    
    public void adicionarResidencia(Residencia residencia){
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO CONTA(rua, numero, bairro, cep, telefone, email) VALUES(?,?,?,?,?,?)");
            stmt.setString(1, residencia.getRua());
            stmt.setInt(2, residencia.getNumero());
            stmt.setString(3, residencia.getBairro());
            stmt.setString(4, residencia.getCep());
            stmt.setString(5, residencia.getTelefone());
            stmt.setString(6, residencia.getEmail());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(stmt, conexao);
        }
    }
    
    public List<Residencia> listarResidencias() {
        List<Residencia> listaRetorno = new LinkedList<>();

        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM HOSPEDE ORDER BY BAIRRO");
            rs = stmt.executeQuery();

            while (rs.next()) {
                Residencia residencia = new Residencia(rs.getString("rua"), rs.getInt("numero"),rs.getString("bairro"),
                        rs.getString("cep"), rs.getString("telefone"),rs.getString("email")); 
                        
                listaRetorno.add(residencia);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }

        return listaRetorno;
    }
    
    public Hospede getResidenciaPeloBairro(String nomeDoBairro) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        ResultSet rs = null;
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("SELECT * FROM CONTA WHERE BAIRRO=?");
            stmt.setString(1, nomeDoBairro);
            rs = stmt.executeQuery();

            if (rs.next()) {
               Residencia residencia = new Residencia(rs.getString("rua"), rs.getInt("numero"),rs.getString("bairro"),
                        rs.getString("cep"), rs.getString("telefone"),rs.getString("email")); 
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(rs, stmt, conexao);
        }
        return null;
    }
    
    public void updateResidencia(Residencia residencia) {
        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("INSERT INTO CONTA(rua, numero, bairro, cep, telefone, email) VALUES(?,?,?,?,?,?)");
            stmt.setString(1, residencia.getRua());
            stmt.setInt(2, residencia.getNumero());
            stmt.setString(3, residencia.getBairro());
            stmt.setString(4, residencia.getCep());
            stmt.setString(5, residencia.getTelefone());
            stmt.setString(6, residencia.getEmail());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(stmt, conexao);
        }
    }
    
    public void deletarResidencia(int numero) {

        ConnectionPostgreSQL postgres = new ConnectionPostgreSQL();
        PreparedStatement stmt = null;
        Connection conexao = null;
        try {
            conexao = postgres.getConection();
            stmt = conexao.prepareStatement("DELETE FROM RESIDENCIA WHERE NUMERO=?");
            stmt.setInt(1, numero);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            postgres.close(null, stmt, conexao);
        }
    }
}
