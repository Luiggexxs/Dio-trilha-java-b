import java.util.Scanner;

public class MyName{

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome para cadastro: ");
        String name = scanner.next();
        scanner.close();

        try {
            verificar(name);
        } catch (ErrorNameException e) {
            System.err.println("Esse não é o nome do proprietario!");
        }
    }

    static void verificar(String nome)throws ErrorNameException{
        if(nome.equals("Luigge")){
            System.out.println("Seja-bem vindo senhor Luigge");

        }
        else{
            throw new ErrorNameException();
        }

    }
}