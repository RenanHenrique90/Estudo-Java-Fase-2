package cursojava2.executavel;

import javax.swing.JOptionPane;

import cursojava2.classes.Aluno;

public class OrientacaoObj {
    
	public static void main(String[] args) {
		
		/* aluno1, aluno2, aluno3 e aluno4, s�o referencias do Objeto criado e,
		 * new Aluno(); � a instancia (cria��o do objeto da referencia) 
		
		Aluno aluno1 = new Aluno();//Sem parametros definodos
		aluno1.setNome("Renan Henrique");
		aluno1.setIdade(31);
		aluno1.setDataNascimento("03/09/1990");
		aluno1.setRegistroGeral("4892384928");
		aluno1.setNumeroCpf("98392849");
		aluno1.setNomeMae("Guilhermina");
		aluno1.setNomePai("Jorge");
		aluno1.setDataMatricula("13/03/2022");
		aluno1.setNomeEscola("JDEV Treinamento");
		aluno1.setSerieMatriculado("Quinta Serie");
		aluno1.setNota1(85);
		aluno1.setNota2(85);
		aluno1.setNota3(90);
		aluno1.setNota4(95);
		
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Data nascimento: " + aluno1.getDataNascimento());
		
		if (aluno1.getMediaAluno() >= 50) {
			if (aluno1.getMediaAluno() > 80) {
				System.out.println("Parabens voce foi aprovado! Sua media foi excelente: " + aluno1.getMediaAluno());
			}else {
				System.out.println("Voce ficou em repescagem! Sua media foi: " + aluno1.getMediaAluno());
			}
		}else {
			System.out.println("Infelizmente voce n�o foi aprovado" + aluno1.getMediaAluno());
		}
		
		//==================================================================================
		
		System.out.println("-----------------------------------------------------");
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Julia");
		aluno2.setIdade(22);
		aluno2.setDataNascimento("27/04/1999");
		aluno2.setRegistroGeral("4892384928");
		aluno2.setNumeroCpf("98392849");
		aluno2.setNomeMae("Joana");
		aluno2.setNomePai("Jonas");
		aluno2.setDataMatricula("13/03/2022");
		aluno2.setNomeEscola("JDEV Treinamento");
		aluno2.setSerieMatriculado("Quinta Serie");
		aluno2.setNota1(80);
		aluno2.setNota2(75);
		aluno2.setNota3(90);
		aluno2.setNota4(95);
		
		System.out.println("Nome: " + aluno2.getNome());
		System.out.println("Idade: " + aluno2.getIdade());
		System.out.println("Data nascimento: " + aluno2.getDataNascimento());
		
		if (aluno2.getMediaAluno() >= 50) {
			if (aluno2.getMediaAluno() > 80) {
				System.out.println("Parabens voce foi aprovado! Sua media foi excelente: " + aluno2.getMediaAluno());
			}else {
				System.out.println("Voce ficou em repescagem! Sua media foi: " + aluno2.getMediaAluno());
			}
		}else {
			System.out.println("Infelizmente voce n�o foi aprovado" + aluno2.getMediaAluno());
		}
		
		
		//==================================================================================
		System.out.println("-----------------------------------------------------");
		Aluno aluno3 = new Aluno("Maria");//Recebendo parametros padr�o (String)
		aluno3.setIdade(30);
		aluno3.setDataNascimento("03/09/1992");
		aluno3.setRegistroGeral("4892384928");
		aluno3.setNumeroCpf("98392849");
		aluno3.setNomeMae("Guilhermina");
		aluno3.setNomePai("Jorge");
		aluno3.setDataMatricula("13/03/2022");
		aluno3.setNomeEscola("JDEV Treinamento");
		aluno3.setSerieMatriculado("Quinta Serie");
		aluno3.setNota1(50);
		aluno3.setNota2(60);
		aluno3.setNota3(75);
		aluno3.setNota4(95);
		
		System.out.println("Nome: " + aluno3.getNome());
		System.out.println("Idade: " + aluno3.getIdade());
		System.out.println("Data nascimento: " + aluno3.getDataNascimento());
		
		if (aluno3.getMediaAluno() >= 50) {
			if (aluno3.getMediaAluno() > 80) {
				System.out.println("Parabens voce foi aprovado! Sua media foi excelente: " + aluno3.getMediaAluno());
			}else {
				System.out.println("Voce ficou em repescagem! Sua media foi: " + aluno3.getMediaAluno());
			}
		}else {
			System.out.println("Infelizmente voce n�o foi aprovado" + aluno3.getMediaAluno());
		}
		
		//==================================================================================
		System.out.println("-----------------------------------------------------");
		Aluno aluno4 = new Aluno("Jo�o", 28);//Recebendo parametros padr�o (String, int)
		aluno4.setDataNascimento("17/05/1993");
		aluno4.setRegistroGeral("4892384928");
		aluno4.setNumeroCpf("98392849");
		aluno4.setNomeMae("Guilhermina");
		aluno4.setNomePai("Jorge");
		aluno4.setDataMatricula("13/03/2022");
		aluno4.setNomeEscola("JDEV Treinamento");
		aluno4.setSerieMatriculado("Quinta Serie");
		aluno4.setNota1(80);
		aluno4.setNota2(50);
		aluno4.setNota3(30);
		aluno4.setNota4(20);
		
		System.out.println("Nome: " + aluno4.getNome());
		System.out.println("Idade: " + aluno4.getIdade());
		System.out.println("Data nascimento: " + aluno4.getDataNascimento());
		
		if (aluno4.getMediaAluno() >= 50) {
			if (aluno4.getMediaAluno() > 80) {
				System.out.println("Parabens voce foi aprovado! Sua media foi excelente: " + aluno4.getMediaAluno());
			}else {
				System.out.println("Voce ficou em repescagem! Sua media foi: " + aluno4.getMediaAluno());
			}
		}else {
			System.out.println("Infelizmente voce n�o foi aprovado" + aluno4.getMediaAluno());
		}*/
		
		String nome = JOptionPane.showInputDialog("Digite o nome do Aluno1: ");
		String idade = JOptionPane.showInputDialog("Digite a idade do Aluno: ");
		String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento do Aluno: ");
		String rg = JOptionPane.showInputDialog("Digite o Registro Geral do Aluno: ");
		String numeroCpf = JOptionPane.showInputDialog("Digite o numero do CPF do Aluno: ");
		String nomeMae = JOptionPane.showInputDialog("Digite o nome da m�e do Aluno: ");
		String nomePai = JOptionPane.showInputDialog("Digite o nome do pai do Aluno: ");
		String dataMatricula = JOptionPane.showInputDialog("Digite a data de matricula do Aluno: ");
		String escola = JOptionPane.showInputDialog("Digite a escola do Aluno: ");
		String serieMatriculado = JOptionPane.showInputDialog("Digite a serie do Aluno: ");
		
		String disciplina1 = JOptionPane.showInputDialog("Digite a disciplina 1:");
		String nota1Aluno1 = JOptionPane.showInputDialog("Digite a primeira nota do aluno");
		
		String disciplina2 = JOptionPane.showInputDialog("Digite a disciplina 2:");
		String nota2Aluno1 = JOptionPane.showInputDialog("Digite a segunda nota do Aluno: ");
		
		String disciplina3 = JOptionPane.showInputDialog("Digite a disciplina 3:");
		String nota3Aluno1 = JOptionPane.showInputDialog("Digite a terceira do Aluno: ");
		
		String disciplina4 = JOptionPane.showInputDialog("Digite a disciplina 4:");
		String nota4Aluno1 = JOptionPane.showInputDialog("Digite a quarta do Aluno: ");
		
		
		
		Aluno aluno1 = new Aluno();//Sem parametros definodos
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(numeroCpf);
		aluno1.setNomeMae(nomeMae);
		aluno1.setNomePai(nomePai);
		aluno1.setDataMatricula(dataMatricula);
		aluno1.setNomeEscola(escola);
		aluno1.setSerieMatriculado(serieMatriculado);
		
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1Aluno1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2Aluno1));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3Aluno1));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4Aluno1));
		
		System.out.println(aluno1.toString());
		System.out.println("M�dia do aluno: " + aluno1.getMediaAluno() + "\nO Aluno foi " 
		+ (aluno1.getAlunoAprovado() ? "Aprovado!"  : "Reporvado"));
		
		System.out.println("============================================================================");
		
		String nome2 = JOptionPane.showInputDialog("Digite o nome do Aluno2: ");
		String idade2 = JOptionPane.showInputDialog("Digite a idade do Aluno: ");
		String dataNascimento2 = JOptionPane.showInputDialog("Data de Nascimento do Aluno: ");
		String rg2 = JOptionPane.showInputDialog("Digite o Registro Geral do Aluno: ");
		String numeroCpf2 = JOptionPane.showInputDialog("Digite o numero do CPF do Aluno: ");
		String nomeMae2 = JOptionPane.showInputDialog("Digite o nome da m�e do Aluno: ");
		String nomePai2 = JOptionPane.showInputDialog("Digite o nome do pai do Aluno: ");
		String dataMatricula2 = JOptionPane.showInputDialog("Digite a data de matricula do Aluno: ");
		String escola2 = JOptionPane.showInputDialog("Digite a escola do Aluno: ");
		String serieMatriculado2 = JOptionPane.showInputDialog("Digite a serie do Aluno: ");
		
		String disciplina1Aluno2 = JOptionPane.showInputDialog("Digite a disciplina 1:");
		String nota1Aluno2 = JOptionPane.showInputDialog("Digite a primeira nota do aluno");
		
		String disciplina2Aluno2 = JOptionPane.showInputDialog("Digite a disciplina 2:");
		String nota2Aluno2 = JOptionPane.showInputDialog("Digite a segunda nota do Aluno: ");
		
		String disciplina3Aluno2 = JOptionPane.showInputDialog("Digite a disciplina 3:");
		String nota3Aluno2 = JOptionPane.showInputDialog("Digite a terceira do Aluno: ");
		
		String disciplina4Aluno2 = JOptionPane.showInputDialog("Digite a disciplina 4:");
		String nota4Aluno2 = JOptionPane.showInputDialog("Digite a quarta do Aluno: ");
		
		
		
		Aluno aluno2 = new Aluno();//Sem parametros definodos
		aluno2.setNome(nome2);
		aluno2.setIdade(Integer.valueOf(idade2));
		aluno2.setDataNascimento(dataNascimento2);
		aluno2.setRegistroGeral(rg2);
		aluno2.setNumeroCpf(numeroCpf2);
		aluno2.setNomeMae(nomeMae2);
		aluno2.setNomePai(nomePai2);
		aluno2.setDataMatricula(dataMatricula2);
		aluno2.setNomeEscola(escola2);
		aluno2.setSerieMatriculado(serieMatriculado2);
		
		aluno2.getDisciplina().setDisciplina1(disciplina1Aluno2);
		aluno2.getDisciplina().setDisciplina2(disciplina2Aluno2);
		aluno2.getDisciplina().setDisciplina3(disciplina3Aluno2);
		aluno2.getDisciplina().setDisciplina4(disciplina4Aluno2);
		
		aluno2.getDisciplina().setNota1(Double.parseDouble(nota1Aluno2));
		aluno2.getDisciplina().setNota2(Double.parseDouble(nota2Aluno2));
		aluno2.getDisciplina().setNota3(Double.parseDouble(nota3Aluno2));
		aluno2.getDisciplina().setNota4(Double.parseDouble(nota4Aluno2));
		
		System.out.println(aluno2.toString());
		System.out.println("M�dia do aluno: " + aluno2.getMediaAluno() +"\nO Aluno foi " 
		+ (aluno2.getAlunoAprovado() ? "Aprovado!"  : "Reporvado"));
		
		if(aluno1.equals(aluno2)) {
			System.out.println("Alunos s�o iguais");
		}
		else {
			System.out.println("Alunos n�o s�o iguais");
		}
	}
}
