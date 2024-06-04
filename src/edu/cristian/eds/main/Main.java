package edu.cristian.eds.main;

import java.time.LocalDate;

import edu.cristian.eds.dominio.Curso;
import edu.cristian.eds.dominio.Mentoria;

public class Main {
	
	public static void main(String[] args) {
		
		Curso curso = new Curso();
		
		curso.setTitulo("Curso Java");
		curso.setDescricao("Descricao curso java");
		curso.setCargaHoraria(8);
		
		Mentoria mentoria = new Mentoria();		
		mentoria.setTitulo("Mentoria Java");
		mentoria.setDescricao("Descricao Mentoria Java");
		mentoria.setData(LocalDate.now());
	}

}
