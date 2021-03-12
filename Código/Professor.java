package numero1;

public class Professor {
	public String nome;
	public String titulacaoMaxima;
	public String graduacao;
	
	public Professor(String nome, String titulacaoMaxima, String graduacao) {
		this.nome = nome;
		this.titulacaoMaxima = titulacaoMaxima;
		this.graduacao = graduacao;
	}
	
	public Professor() {
		nome = "";
		titulacaoMaxima = "";
		graduacao = "";
	}
	
	public void alteraTitulacao(String titulacao) {
		this.titulacaoMaxima = titulacao;
	}
	
	public String retornaProfessor() {
		return "Nome: "+nome+"\nTitulação máxima: "+titulacaoMaxima+"\nGraduação: "+graduacao;
	}
}
