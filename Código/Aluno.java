package numero1;

public class Aluno {
	public int matricula;
	public String nome;
	public String cpf;
	
	public Aluno(int matricula) {
		this.matricula = matricula;
		nome = "";
		cpf = "";
	}
	
	public void alteraNome(String nome) {
		this.nome = nome;
	}
	
	public void alteraCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String retornaAluno() {
		return "Nome: "+ nome + "\nMatricula: "+ matricula +"\nCPF: "+ cpf;
	}

}
