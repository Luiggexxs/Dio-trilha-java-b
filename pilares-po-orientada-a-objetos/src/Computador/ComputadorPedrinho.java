package Computador;

import java.util.Scanner;

import Apps.FacebookMessenger;
import Apps.MSNMessenger;
import Apps.ServicoMensagemInstantanea;
import Apps.TelegramMessenger;

public class ComputadorPedrinho {
	public static void main(String[] args) {

        ServicoMensagemInstantanea smi = null;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Opções de app\n Msn\n Facebook\n Telegram:");
        String escolha = scanner.next();
        

        if (escolha.equals("Msn")){
            smi = new MSNMessenger();
        }
        else if (escolha.equals("Facebook")){
            smi = new FacebookMessenger();
        }
        else if (escolha.equals("Telegram")){
            smi = new TelegramMessenger();
        }
        else{
            System.out.println("não entendi");
        }

        smi.enviarMensagem();
        smi.receberMensagem();
        
	}
}