package cursojava2.executavel;

import cursojava2.classes.Aluno;

public class OrientacaoObj {
    
	public static void main(String[] args) {
		
		/* aluno1, aluno2, aluno3 e aluno4, são referencias do Objeto criado e,
		 * new Aluno(); é a instancia (criação do objeto da referencia) 
		 */
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
		
		System.out.println("Nome: " + aluno1.getNome());
		System.out.println("Idade: " + aluno1.getIdade());
		System.out.println("Data nascimento: " + aluno1.getDataNascimento());
		
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
		
		System.out.println("Nome: " + aluno2.getNome());
		System.out.println("Idade: " + aluno2.getIdade());
		System.out.println("Data nascimento: " + aluno2.getDataNascimento());
		
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
		
		System.out.println("Nome: " + aluno3.getNome());
		System.out.println("Idade: " + aluno3.getIdade());
		System.out.println("Data nascimento: " + aluno3.getDataNascimento());
		
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
		
		System.out.println("Nome: " + aluno4.getNome());
		System.out.println("Idade: " + aluno4.getIdade());
		System.out.println("Data nascimento: " + aluno4.getDataNascimento());
	
	}
	
}
