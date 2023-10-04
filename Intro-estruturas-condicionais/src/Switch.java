public class Switch{

    public static void main(String [] agrs){

        String sigla = "F";

        switch(sigla){
            case "P":{
                System.out.println("PEQUENO");
                break;
            } 
            case "M":{
                System.out.println("MÉDIO");
                break;
            }
            case "G":{
                System.out.println("GRANDE");
                break;
            }
            default:{
                System.out.println("INDEFINIDO");
            }
        }

    }

}