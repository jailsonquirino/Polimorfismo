package br.edu.iftm;

public class Cliente extends Pessoa {
    // Atributos
    private int id;
    private float saldoDevedor;
    private float saldoCredito;

    public Cliente(String nome, int idade, String sexo) {
        super(nome, idade, sexo);
        this.id += 1;
        this.saldoDevedor = 0;
    }

    // Compra vai para saldor devedor (SOBRECARGA)
    public void compraAPrazo(float valor) {
        saldoDevedor += valor;
        System.out.format("Compra de %.2f aprovada. Saldo devedor de %.2f reais.\n", valor, saldoDevedor);
    }

    // Compra parcelada (SOBRECARGA)
    public void compraAPrazo(float valor, int parcelas) {
        float valorparcela = valor / parcelas;
        System.out.format("Compra de %.2f em %d vezes de %.2f reais foi aprovada\n", valor, parcelas, valorparcela);
    }

    @Override // SOBREPOSICAO
    public void fazerAniversario() {
        System.out.format("Parabéns %s\n", getNome());
    }

    // Emitir boleto com saldo devedor (SOBREPOSICAO)
    @Override
    public void emitirBoleto() {
        System.out.format("Boleto impresso no valor de %.2f reais\n", saldoDevedor);
    }

    @Override // SOBREPOSICAO
    public void informacaoPessoal() {
        System.out.format("Nome: %s\n", nome);
        System.out.format("Sexo: %s\n", sexo);
        System.out.format("Idade: %d anos\n", idade);
        System.out.format("ID: %d\n",id);
        System.out.format("Saldo devedor: %.2f\n",saldoDevedor);
        System.out.format("Saldo credito: %.2f\n",saldoCredito);
    }

    // Get e Set
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public float getSaldoDevedor() {
        return saldoDevedor;
    }
    public void setSaldoDevedor(float saldoDevedor) {
        this.saldoDevedor = saldoDevedor;
    }
    public float getSaldoCredito() {
        return saldoCredito;
    }
    public void setSaldoCredito(float saldoCredito) {
        this.saldoCredito = saldoCredito;
    }
    
}