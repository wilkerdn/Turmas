package numero1;

import java.util.ArrayList;

public class Curso {
	public String endereco;
	public ArrayList<Turma> turmas;
	
	public Curso(String endereco) {
		this.endereco = endereco;
		turmas = new ArrayList<>();
	}
	
	public void insereTurma(Turma turma) {
		turmas.add(turma);
	}
	
	public void excluiTurma(int posicao) {
		turmas.remove(posicao);
	}
	
	public void imprimeCurso() {
		for(int i=0;i<turmas.size();i++) {
			turmas.get(i).imprimeTurma();
		}
	}
}
