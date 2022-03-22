package cursojava2.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/*Esta é nossa classe/objeto que representa o Aluno
 *Ela contem os atribudos dos Objetos instanciados/referenciados */
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
	
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}

	// objeto que não retorna parametros padrão definido
	public Aluno() {

	}

	// objeto que recebe parametros padrão definido (String)
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}

	// objeto que recebe dois parametros padrão (String, int)
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	public double getMediaAluno() {
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		
		return somaNotas / disciplinas.size();
	}

	// getAlunoAprovado() retorna true para "Aprovado" e false para "Reprovado"
	public boolean getAlunoAprovado() {
		double media = this.getMediaAluno();

		if (media >= 50) {
			return true;
		} else {
			return false;
		}
	}

	
	

	@Override
	public String toString() {
		return "Aluno Nome: " + nome + "\nIdade: " + idade + "\nData de Nascimento: " + dataNascimento + "\nRG: "
				+ registroGeral + "\nCPF: " + numeroCpf + "\nNome da Mae: " + nomeMae + "\nNome do Pai: " + nomePai
				+ "\nData da Matricula: " + dataMatricula + "\nNome da Escola: " + nomeEscola + "\nSérie: "
				+ serieMatriculado  + disciplinas +"";
	}

	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroCpf, registroGeral);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf)
				&& Objects.equals(registroGeral, other.registroGeral);
	}
	
	
}
