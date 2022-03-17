package cursojava2.classes;

//Esta é nossa classe/objeto que representa o Aluno
public class Aluno {
	
	String nome;
	int idade;
	String dataNascimento;
	String registroGeral;
	String numeroCpf;
	String nomeMae;
	String nomePai;
	String dataMatricula;
	String nomeEscola;
	String serieMatriculado;
	
	//objeto que não retorna parametros padrão definido
	public Aluno() {
		
	}
	
	//objeto que recebe parametros padrão definido (String)
	public Aluno(String nomePadrao) {
		nome =  nomePadrao;
	}
	
	//objeto que recebe dois parametros padrão (String, int)
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}
}


