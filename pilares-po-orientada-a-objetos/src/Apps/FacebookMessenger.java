package Apps;
public class FacebookMessenger extends ServicoMensagemInstantanea{
    
    public void enviarMensagem(){
        ValidarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook");
    }

    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Facebook ");
    }
}