package funcionarioPOO;

public class TestaFuncionario {
	

	public static void main(String[] args) {

	Funcionario Funcionario1 = new Funcionario ("Jorge", 33 , "Financeiro", "Gestor", "(27)95637-3840");
	Funcionario Funcionario2 = new Funcionario ("Elise", 24, "T.I", "Product Owner", "(19)93488-9905");


	Funcionario1.visualizar();
	Funcionario2.visualizar();
}
}