
public class Main {
	public static void main(String[] args) {
		Autor autor1 = new Autor("Stephen Hawking", "Reino Unido");
		Autor autor2 = new Autor("Stephen Covey", "Estados Unidos");
		Aluno aluno1 = new Aluno("Rafael", "001");
		Professor professor1 = new Professor("Efrain", "002");
		Livro livro1 = new Livro("Os 7 hábitos das pessoa altamente eficazes", autor2);
		livro1.setEmprestadoPor(aluno1);
		System.out.println(autor1);
		System.out.println(autor2);
		System.out.println(aluno1);
		System.out.println(professor1);
		System.out.println(livro1);
	}

}
