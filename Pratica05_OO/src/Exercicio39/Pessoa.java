package Exercicio39;

public class Pessoa {
	private String nome;
    private float altura,peso;

    private int idade;

    public Pessoa(String nome, float altura, float peso,int idade) {
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
        this.idade = idade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }
    public String imprimir(){
        return " Nome: "+getNome()+"\n Altura: "+getAltura()+"\n Peso: "+getPeso()+"\n Idade: "+getIdade()+"\n ============";
    }
    public void aniversario(){
        idade++;
    }
	
}
