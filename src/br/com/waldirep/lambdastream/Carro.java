package br.com.waldirep.lambdastream;

public class Carro {
	
	private String marca;
	private double preco;
	
	
	
	public Carro(String marca, double preco) {
		super();
		this.marca = marca;
		this.preco = preco;
	}


	public void adicionaTaxa() {
		preco = preco += preco * 0.1;
	}
	

	public String getMarca() {
		return marca;
	}



	public double getPreco() {
		return preco;
	}


	@Override
	public String toString() {
		return "Carro [marca=" + marca + ", preco=" + preco + "]";
	}
	
	
	

}
