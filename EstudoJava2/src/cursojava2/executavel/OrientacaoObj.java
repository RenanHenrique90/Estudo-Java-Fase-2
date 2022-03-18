package cursojava2.executavel;

import javax.swing.JOptionPane;

import cursojava2.classes.Aluno;

public class OrientacaoObj {
    
	public static void main(String[] args) {
		
		/* aluno1, aluno2, aluno3 e aluno4, são referencias do Objeto criado e,
		 * new Aluno(); é a instancia (criação do objeto da referencia) 
		
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
			System.out.println("Infelizmente voce não foi aprovado" + aluno1.getMediaAluno());
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
			System.out.println("Infelizmente voce não foi aprovado" + aluno2.getMediaAluno());
		}
		
		
		//==================================================================================
		System.out.println("-----------------------------------------------------");
		Aluno aluno3 = new Aluno("Maria");//Recebendo parametros padrão (String)
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
			System.out.println("Infelizmente voce não foi aprovado" + aluno3.getMediaAluno());
		}
		
		//==================================================================================
		System.out.println("-----------------------------------------------------");
		Aluno aluno4 = new Aluno("João", 28);//Recebendo parametros padrão (String, int)
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
			System.out.println("Infelizmente voce não foi aprovado" + aluno4.getMediaAluno());
		}*/
		
		String nome = JOptionPane.showInputDialog("Digite o nome do Aluno: ");
		String idade = JOptionPane.showInputDialog("Digite a idade do Aluno: ");
		String dataNascimento = JOptionPane.showInputDialog("Data de Nascimento do Aluno: ");
		String rg = JOptionPane.showInputDialog("Digite o Registro Geral do Aluno: ");
		String numeroCpf = JOptionPane.showInputDialog("Digite o numero do CPF do Aluno: ");
		String nomeMae = JOptionPane.showInputDialog("Digite o nome da mãe do Aluno: ");
		String nomePai = JOptionPane.showInputDialog("Digite o nome do pai do Aluno: ");
		String dataMatricula = JOptionPane.showInputDialog("Digite a data de matricula do Aluno: ");
		String escola = JOptionPane.showInputDialog("Digite a escola do Aluno: ");
		String serieMatriculado = JOptionPane.showInputDialog("Digite a serie do Aluno: ");
		String nota1 = JOptionPane.showInputDialog("Digite a primeira nota do aluno");
		String nota2 = JOptionPane.showInputDialog("Digite a segunda nota do Aluno: ");
		String nota3 = JOptionPane.showInputDialog("Digite a terceira do Aluno: ");
		String nota4 = JOptionPane.showInputDialog("Digite a quarta do Aluno: ");
		
		
		
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
		aluno1.setNota1(Double.parseDouble(nota1));
		aluno1.setNota2(Double.parseDouble(nota2));
		aluno1.setNota3(Double.parseDouble(nota3));
		aluno1.setNota4(Double.parseDouble(nota4));
		
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Data nascimento: " + aluno1.getDataNascimento());
		System.out.println("Parabens voce foi " + (aluno1.getAlunoAprovado() ? "Aprovado!"  : "Reporvado"));
	}
}
