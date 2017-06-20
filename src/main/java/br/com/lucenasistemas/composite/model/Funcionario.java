package br.com.lucenasistemas.composite.model;

import br.com.lucenasistemas.composite.interfaces.AreaEmpresa;

public class Funcionario  implements AreaEmpresa{

	private String nome;

	public Funcionario(String nome) {
		this.nome = nome;
	}

	@Override
	public void exibir() {
		System.out.println("funcionário: " + nome );
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
