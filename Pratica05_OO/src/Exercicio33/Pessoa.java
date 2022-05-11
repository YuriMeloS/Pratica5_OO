package Exercicio33;

public class Pessoa {
	double altura, peso;
	String nome;
	
	public Pessoa(double altura, double peso, String nome) {
		this.altura = altura;
		this.peso = peso;
		this.nome = nome;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String imprimir() {
		return "Nome" + nome + "\n Peso " + peso + "\n Altura " + altura;
	}
	
}
