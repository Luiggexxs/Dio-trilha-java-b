package Apps;
public class MSNMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem(){
        ValidarConectadoInternet();
        System.out.println("Enviando mensagem pelo Msn");
    }
    public void receberMensagem(){
        System.out.println("Receber mensagem pelo messenger");
    }
}