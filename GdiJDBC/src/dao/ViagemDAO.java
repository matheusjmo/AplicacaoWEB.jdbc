package dao;

import model.Viagem;
import util.Conexao;

import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ViagemDAO {
	
	public List<Viagem> listar() {
		List<Viagem> viagens = new ArrayList<>();
		try {
			Connection conn = Conexao.conexaoBD();
			Statement statement = conn.createStatement();
			String sql = "SELECT * FROM VIAGEM";
			ResultSet result = statement.executeQuery(sql);

			while (result.next()) {

				int codigo = result.getInt("codigo");
				String nome = result.getString("nome");
				int preco = result.getInt("preco");
				String lugar = result.getString("lugar");
				Blob fotos = result.getBlob("fotos");

				Viagem viagem = new Viagem(codigo, nome, preco, lugar, fotos);
				viagens.add(viagem);
			}
		} catch (Exception e) {
			// TODO: handle exception
		}
		return viagens;
	}
	
	
	public void inserir(Viagem viagem) {
		try {
			Connection conn = Conexao.conexaoBD();
			String sql= "INSERT INTO VIAGEM(codigo,nome,lugar,preco, fotos) VALUES (?, ?, ?, ?, ?)";
			
			PreparedStatement stm = conn.prepareStatement(sql);
			stm.setInt(1, viagem.getCodigo());
			stm.setString(2, viagem.getNome());
			stm.setString(3,viagem.getLugar());
			stm.setDouble(4,viagem.getPreco());
			stm.setBlob(5,viagem.getFotos());
			
			stm.executeUpdate();
			stm.close();
			
		} catch (Exception e) {
			System.out.println(e);
			e.getMessage();
		}
	}
}
