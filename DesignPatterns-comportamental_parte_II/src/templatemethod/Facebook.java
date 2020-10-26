package templatemethod;

public class Facebook extends RedeSocial{
	public Facebook(String user, String password) {
        super(user, password);
    }
	
    public boolean logIn() {
        System.out.println("\nVerificando parâmetros do usuário");
        System.out.println("User: " + this.user);
        System.out.print("Password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        simuladorDeLatencia();
        System.out.println("\n\nLogIn efetuado no Facebook");
        return true;
    }

    public boolean enviarDados(byte[] data) {
        boolean mensagemPostada = true;
        if (mensagemPostada) {
            System.out.println("Mensagem: '" + new String(data) + "' foi postada no Facebook");
            return true;
        } else {
            return false;
        }
    }

    public void logOut() {
        System.out.println("User: '" + user + "' desconectou do Facebook");
    }

    private void simuladorDeLatencia() {
        try {
            int i = 0;
            System.out.println();
            while (i < 10) {
                System.out.print(".");
                Thread.sleep(500);
                i++;
            }
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }
}
