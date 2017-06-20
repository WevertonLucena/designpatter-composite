package br.com.lucenasistemas.composite.model;

import java.util.ArrayList;
import java.util.List;

import br.com.lucenasistemas.composite.interfaces.AreaEmpresa;

public class Departamento implements AreaEmpresa{
	
	private List<AreaEmpresa> areas = new ArrayList<>();
	
	private String nome;

	public Departamento(String nome) {
		this.nome = nome;
	}
	
	public void adicionar(AreaEmpresa area){
		areas.add(area);
	}
	
	public void remover(AreaEmpresa area){
		areas.remove(area);
	}

	@Override
	public void exibir() {
		System.out.println("Departamento: " + nome);
		areas.forEach(a -> a.exibir());
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	
	
}
