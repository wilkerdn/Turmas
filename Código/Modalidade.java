package numero1;

public class Modalidade {
	public String descricao;
	public Professor professor;
	public int quantVagas;
	public int horarioInicio;
	public int horarioFim;
	
	public Modalidade() {
		descricao = "";
		professor = new Professor();
		quantVagas = 0;
		horarioInicio = 0;
		horarioFim = 0;
	}
	
	public Modalidade(String descricao, int horarioInicio, int horarioFim) {
		this.descricao = descricao;
		this.horarioInicio = horarioInicio;
		this.horarioFim = horarioFim;
		professor = new Professor();
		quantVagas = 0;
	}
	
	public void alteraProfessor(Professor professor) {
		this.professor = professor;
	}
	
	public String retornaModalidade() {
		return "Descrição: "+descricao+"\nProfessor: "+professor+"\nQuantidade de vagas: "+quantVagas+"\nHorário início: "
				+horarioInicio+"\nHorário fim: "+horarioFim;
	}
	
	
}
