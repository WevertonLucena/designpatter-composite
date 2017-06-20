package br.com.lucenasistemas.composite;

import br.com.lucenasistemas.composite.model.Departamento;
import br.com.lucenasistemas.composite.model.Funcionario;

public class App {

	public static void main(String[] args) {
		
		Departamento dep1 = new Departamento("Presidencia");
		Funcionario f1 = new Funcionario("Pedro");
		dep1.adicionar(f1);
		
		Departamento dep2 = new Departamento("Diretoria comercial");
		Funcionario f2 = new Funcionario("João");
		dep2.adicionar(f2);
		dep1.adicionar(dep2);
		
		Departamento dep3 = new Departamento("Diretoria financeira");
		Funcionario f3 = new Funcionario("Maria");
		dep3.adicionar(f3);
		dep1.adicionar(dep3);
		
		Departamento dep4 = new Departamento("Vendas");
		Funcionario f4 = new Funcionario("Roberto");
		Funcionario f5 = new Funcionario("Diana");
		dep4.adicionar(f4);
		dep4.adicionar(f5);
		dep2.adicionar(dep4);
		
		Departamento dep5 = new Departamento("Contabilidade");
		Funcionario f6 = new Funcionario("Catarina");
		dep5.adicionar(f6);
		dep3.adicionar(dep5);
		
		dep1.exibir();
		
	}
}
