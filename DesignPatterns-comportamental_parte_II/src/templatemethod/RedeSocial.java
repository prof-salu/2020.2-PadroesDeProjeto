package templatemethod;

public abstract class RedeSocial {
	protected String user;
	protected String password;

	public RedeSocial(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public boolean postar(String message) {

        if (logIn()) {

            boolean resultado =  enviarDados(message.getBytes());
            logOut();
            return resultado;
        }
        return false;
    }

    public abstract boolean logIn();
    public abstract boolean enviarDados(byte[] dados);
    public abstract void logOut();
}
