package numero1;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		ArrayList<Curso> cursos = new ArrayList<>();
		ArrayList<Professor> professores = new ArrayList<>();
		ArrayList<Modalidade> modalidades = new ArrayList<>();
		String imp = "";
		int op,op1,i;
		do {
			op = Integer.parseInt(JOptionPane.showInputDialog("OPÇÕES\n1 - Cadastrar professor\n2 - Cadastrar modalidade\n3 - Cadastrar turma\n4 - Imprimir\n0 - Sair"));
			switch(op) {
			case 1:
				String prof = JOptionPane.showInputDialog("Digite o nome do professor");
				String tm = JOptionPane.showInputDialog("Digite a titulação máxima");
				String grad = JOptionPane.showInputDialog("Digite a gradução do professor:");
				Professor p = new Professor(prof, tm, grad);
				professores.add(p);
				break;
			case 2:
				imp = "";
				imp += "Escolha um professor\n";
				for(i=0; i<professores.size();i++) {
					imp += "Posição: "+i+" - "+professores.get(i).retornaProfessor()+"\n\n";
				}
				int pos = Integer.parseInt(JOptionPane.showInputDialog(imp));
				String mod = JOptionPane.showInputDialog("Digite a modalidade");
				int qv = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de vagas"));
				int hi = Integer.parseInt(JOptionPane.showInputDialog("Horário de inicio\n"));
				int hf = Integer.parseInt(JOptionPane.showInputDialog("Horário de término\n"));
				Modalidade m = new Modalidade(mod, hi, hf);
				m.quantVagas = qv;
				m.alteraProfessor(professores.get(pos));
				modalidades.add(m);
				break;
			case 3:
				String endereco = JOptionPane.showInputDialog("Digite o endereco do Curso dessa turma");
				Curso c = new Curso(endereco);
				int exit = 0;
				Turma t = new Turma();
				do {
				imp = "";
				imp += "Escolha uma modalidade\n";
				for(i=0;i<modalidades.size();i++) {
					imp += "Posicao: "+i+" - "+modalidades.get(i).retornaModalidade()+"\n\n";
				}
				int pos1 = Integer.parseInt(JOptionPane.showInputDialog(imp));
				t.insereModalidade(modalidades.get(pos1));
				exit = Integer.parseInt(JOptionPane.showInputDialog("Adicionar outra modalidade?\n1 - SIM\n2 - NÃO"));
				}while(exit != 2);
				JOptionPane.showMessageDialog(null, "Agora cadastre os alunos");
				do {
					int matricula = Integer.parseInt(JOptionPane.showInputDialog("Numero de matricula"));
					String nome = JOptionPane.showInputDialog("Nome do aluno");
					String cpf = JOptionPane.showInputDialog("CPF do aluno");
					Aluno a = new Aluno(matricula);
					a.alteraCpf(cpf);
					a.alteraNome(nome);
					t.insereAluno(a);
					exit = Integer.parseInt(JOptionPane.showInputDialog("Adicionar outro aluno?\n1 - SIM\n2 - NÃO"));
				}while(exit != 2);
					c.insereTurma(t);
					cursos.add(c);
				break;
			case 4:
				op1 = Integer.parseInt(JOptionPane.showInputDialog("OPCOES\n1 - Imprimir Professores\n2 - Imprimir Cursos\n3 - Imprimir Modalidades"));
				switch (op1) {
				case 1:
					imp = "";
					for(i=0; i<professores.size();i++) {
						imp +=i+" - "+professores.get(i).retornaProfessor()+"\n\n";
					}
					JOptionPane.showMessageDialog(null, imp, "Professores", JOptionPane.INFORMATION_MESSAGE);
					break;
				case 2:{
					for(i=0; i<cursos.size();i++) {
						cursos.get(i).imprimeCurso();
					}
					break;
				}
				case 3:
					imp = "";
					for(i=0;i<modalidades.size();i++) {
						imp +=i+" - "+modalidades.get(i).retornaModalidade()+"\n\n";
					}
					JOptionPane.showMessageDialog(null, imp, "Modalidades", JOptionPane.INFORMATION_MESSAGE);
					break;
				default:
					break;
				}
				break;
			default:
				JOptionPane.showMessageDialog(null,"Opção inválida");
				break;
			}
		}while(op!=0);
	}
}
