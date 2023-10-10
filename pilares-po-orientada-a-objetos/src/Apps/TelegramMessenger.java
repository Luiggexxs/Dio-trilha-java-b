package Apps;
public class TelegramMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem(){
        ValidarConectadoInternet();
        System.out.println("Enviar mensagem pelo Telegram");
    }
    public void receberMensagem(){
        System.out.println("Recebendo mensagem pelo Telegram");
    }
}