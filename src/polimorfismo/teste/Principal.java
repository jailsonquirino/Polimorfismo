//package br.edu.iftm;

package polimorfismo.teste;

import br.edu.iftm.Cliente;
import br.edu.iftm.Funcionario;

public class Principal {
    public static void main(String[] args) {
        System.out.println("Hello, World!");  

        Funcionario funcionario1 = new Funcionario("Marcos", 35, "Masculino");
        Cliente cliente1 = new Cliente("João", 65, "Masculino");

        funcionario1.fazerAniversario();
        funcionario1.emitirBoleto();
        funcionario1.receberAumento(10,1);
        funcionario1.receberAumento(500);
        funcionario1.informacaoPessoal();

        System.out.println("");
        cliente1.compraAPrazo(750);
        cliente1.emitirBoleto();
        cliente1.compraAPrazo(500,5);
        cliente1.fazerAniversario();        
        cliente1.informacaoPessoal();
        


    }    
}