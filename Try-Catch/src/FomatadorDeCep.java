

public class FomatadorDeCep {

    public static void main(String[] args){
        try{
            String cepFormatado = formatarCep("12345678");
            System.out.println(cepFormatado);
        }catch(CepInvalidoException e){
            System.err.println("O cep não corresponde as regras do negócio!");
        }

    }
    static String formatarCep(String cep) throws CepInvalidoException{
        if(cep.length() != 8)
          throw new CepInvalidoException();
        
          //simulando um cep formatado
          return "23.765-064";
    }
    
}
