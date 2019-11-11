package model;

import java.sql.Blob;

public class Viagem {
	
	private int codigo;
	private String nome;
	private double preco;
	private String lugar;
	private Blob fotos;
	
	public Viagem(int codigo, String nome, int preco, String lugar, Blob fotos) {
		this.codigo=codigo;
		this.nome=nome;
		this.preco=preco;
		this.lugar=lugar;
		this.fotos=fotos;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getLugar() {
		return lugar;
	}

	public void setLugar(String lugar) {
		this.lugar = lugar;
	}

	public Blob getFotos() {
		return fotos;
	}

	public void setFotos(Blob fotos) {
		this.fotos = fotos;
	}
}
