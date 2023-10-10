package Apps;

//a classe MSNMessenger é ou representa
public abstract class ServicoMensagemInstantanea {
	public abstract void enviarMensagem();
	public abstract void receberMensagem();
	
	/* SOMENTE AS CLASSES FILHAS CONHECEM */
	protected void ValidarConectadoInternet(){
	System.out.println("Validando conecxão com a internet");
}
}

