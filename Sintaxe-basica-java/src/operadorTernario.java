public class operadorTernario {
    public static void main(String[] args) throws Exception {
        System.out.println("Operadores ternários!");
        System.out.println(" "); /* Pular espaço */
        int a, b;

        a = 5;
        b = 6;

        /* EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF/ELSE
        if(a==b)
        resultado = "verdadeiro";
        else
        resultado = "falso";
        */

        //MESMA CONDICIONAL, MAS DESSA VEZ, UTILIZANDO O OPERADOR CONDICIONAL TERNÁRIO
        String resultado = (a>b) ? "verdadeiro = é igual" : "false = é diferente";

        System.out.println(resultado);
    }
}
