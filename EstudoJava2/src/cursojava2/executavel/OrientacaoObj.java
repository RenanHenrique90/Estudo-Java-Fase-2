package cursojava2.executavel;

import cursojava2.classes.Aluno;

public class OrientacaoObj {
    
	public static void main(String[] args) {
		
		
		Aluno aluno1 = new Aluno();//Sem parametros definodos
		
		Aluno aluno2 = new Aluno();
		
		Aluno aluno3 = new Aluno("Maria");//Recebendo parametros padr�o (String)
		
		Aluno aluno4 = new Aluno("Jo�o", 45);//Recebendo parametros padr�o (String, int)
		
	}
	
}
