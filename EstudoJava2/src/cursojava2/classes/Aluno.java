package cursojava2.classes;

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
	
	String disciplina1;
	double nota1;
	
	String disciplina2;
	double nota2;
	
	String disciplina3;
	double nota3;
	
	String disciplina4;
	double nota4;
	
	
	public String getDisciplina1() {
		return disciplina1;
	}
	public void setDisciplina1 (String disciplina1) {
		this.disciplina1 = disciplina1;
	}
	public String getDisciplica2() {
		return disciplina2;
	}
	public void setDisciplina2(String disciplina2) {
		this.disciplina2 = disciplina2;
	}
	public String getDisciplina3() {
		return disciplina3;
	}
	public void setDisciplina3(String disciplina3) {
		this.disciplina3 = disciplina3;
	}
	public String setDisciplina4() {
		return disciplina4;
	}
	public void setDisciplina4(String disciplina4) {
		this.disciplina4 = disciplina4;
	}
	
	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
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
		return (nota1 + nota2 + nota3 + nota4) / 4;
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

	
	public String toString() {
		return "Aluno [\nnome = " + nome + "\nIdade = " + idade + "\nData de Nascimento = " + dataNascimento + "\nRegistro Geral = "
				+ registroGeral + "\nNumero do CPF = " + numeroCpf + "\nNome da Mãe = " + nomeMae + "\nNome do Pai = " + nomePai
				+ "Data da Matricula = " + dataMatricula + "\nNome da Escola = " + nomeEscola + "\nSerie do Aluno = " + serieMatriculado
				+ " \nDisciplina 1: " + disciplina1 + " Nota  " + nota1 + " \nDisciplina 2: "+ disciplina2 + " Nota   " + nota2 
				+ " \nDisciplina 3: " + disciplina3 + " Nota  " + nota3 + " \nDisciplina 4:  " + disciplina4 +" Nota   " + nota4 + "]";
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
