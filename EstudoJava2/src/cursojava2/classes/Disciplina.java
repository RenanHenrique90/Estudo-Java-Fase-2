package cursojava2.classes;

import java.util.Objects;


//Este Objeto ? responsavel pela disciplina e nota do Aluno
public class Disciplina {
	
	String disciplina;
	double nota;
	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public double getNota() {
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
	}
	@Override
	public int hashCode() {
		return Objects.hash(disciplina, nota);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Disciplina other = (Disciplina) obj;
		return Objects.equals(disciplina, other.disciplina)
				&& Double.doubleToLongBits(nota) == Double.doubleToLongBits(other.nota);
	}
	@Override
	public String toString() {
		return "\nDisciplina: " + disciplina + " Nota - " + nota + "";
	}
	
	
	
	
	
}
