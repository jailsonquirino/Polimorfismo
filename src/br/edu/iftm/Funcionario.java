package br.edu.iftm;

public class Funcionario extends Pessoa {
    // Atributos
    private float salario;
    private String setor;
    private String funcao;

    // Construtor
    public Funcionario(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.salario = 1045;
        this.setor = "Peças";
        this.funcao = "Estoquista";
    }

    @Override
    public void fazerAniversario() {
        System.out.format("Parabens %s.\n", getNome());
    }

    // Funcionario solicitou a emissão de boleto para cliente
    @Override
    public void emitirBoleto() {
        System.out.format("Solicitado a emissão do boleto, aguardando o financeiro.\n");
    }

    @Override
    public void informacaoPessoal() {
        System.out.format("Nome: %s\n", nome);
        System.out.format("Sexo: %s\n", sexo);
        System.out.format("Idade: %d anos\n", idade);
        System.out.format("Salario: %.2f reais\n", salario);
        System.out.format("Setor: %s\n",setor);
        System.out.format("Funcao: %s\n",funcao);
    }

    // Receber aumento pela porcentagem
    public void receberAumento(int porcentagem, int inteiro) {
        float valorPorcentual = (salario / 100) * porcentagem;
        salario = valorPorcentual + salario;
        System.out.println("Aumento de "+porcentagem+"%, salario atual é " +salario+ " reais" );
        //System.out.format("Aumento de %.2f porcento, salario atual é %.2f reais.\n", porcentagem, salario);
    }

    // Receber aumento pelo valor
    public void receberAumento(int aumento) {
        salario += aumento;
        System.out.format("Aumento de salario de %d reais, salario atual é %.2f rais.\n", aumento, salario);
    }

    // Get e Set
    public String getSetor() {
        return setor;
    }
    public void setSetor(String setor) {
        this.setor = setor;
    }
    public String getFuncao() {
        return funcao;
    }
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
  
}