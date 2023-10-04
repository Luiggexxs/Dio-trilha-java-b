public class OperadorTernario {
    public static void main(String[] args) throws Exception {
        System.out.println("Operador Ternário!");

        double nota = 3;

        String resultado = (nota > 7) ? "Aluno aprovado com a nota " + nota : (nota >=5 && nota <7) ? "Recuperação" : "Reprovado";
        System.out.println(resultado);


    }
}
