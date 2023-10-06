public class ExemploFor {
public static void main(String[] args) {
	String alunos[] = { "FELIPE", "JONAS", "JULIA", "MARCOS" };

	/*for(int x = 0; x <alunos.length; x++){
		System.out.println("O aluno no indice x=" + x + " É " + alunos[x]);
	}*/

	/* Usando FOR EACH especifico para listas */
	for(String aluno : alunos){
		System.out.println("O nome do do aluno é " + aluno);
	}

}
}