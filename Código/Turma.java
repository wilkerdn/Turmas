package numero1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Turma {
	public ArrayList<Modalidade> modalidades;
	public ArrayList<Aluno> alunos;
	
	public Turma() {
		modalidades = new ArrayList<>();
		alunos = new ArrayList<>();
	}
	
	public void insereModalidade(Modalidade modalidade) {
		modalidades.add(modalidade);
	}
	
	public void insereAluno(Aluno aluno) {
		alunos.add(aluno);
	}
	
	public void excluirAluno(int posicao) {
		alunos.remove(posicao);
	}
	
	public void imprimeTurma() {
		for(int i=0; i<modalidades.size();i++) {
			JOptionPane.showMessageDialog(null,modalidades.get(i).retornaModalidade());
		}
		for(int i=0; i<alunos.size();i++) {
			JOptionPane.showMessageDialog(null,alunos.get(i).retornaAluno());
		}
	}
}
