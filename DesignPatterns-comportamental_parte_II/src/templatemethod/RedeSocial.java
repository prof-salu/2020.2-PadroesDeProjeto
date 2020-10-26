package templatemethod;

public abstract class RedeSocial {
	String user;
    String password;

    RedeSocial() {}

    public boolean postar(String message) {

        if (logIn(this.user, this.password)) {

            boolean resultado =  enviarDados(message.getBytes());
            logOut();
            return resultado;
        }
        return false;
    }

    abstract boolean logIn(String userName, String password);
    abstract boolean enviarDados(byte[] dados);
    abstract void logOut();
}
