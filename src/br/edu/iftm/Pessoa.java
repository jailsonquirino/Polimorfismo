package br.edu.iftm;

//Classe tipo ABSTRACT
public abstract class Pessoa {
    // Atributos
    protected String nome;
    protected int idade;
    protected String sexo;

    // Construtor
    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    // Métodos da classe
    public abstract void fazerAniversario();
    public abstract void emitirBoleto();
    public abstract void informacaoPessoal();

    // Get e Set
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }
    public String getSexo() {
        return sexo;
    }
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }
}