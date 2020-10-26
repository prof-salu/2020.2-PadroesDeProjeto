package templatemethod;

public class Twitter extends RedeSocial{
	public Twitter(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public boolean logIn(String userName, String password) {
        System.out.println("\nVerificando par�metros do usu�rio");
        System.out.println("User: " + this.user);
        System.out.print("Password: ");
        for (int i = 0; i < this.password.length(); i++) {
            System.out.print("*");
        }
        simulateNetworkLatency();
        System.out.println("\n\nLogIn efetuado no Twitter");
        return true;
    }

    public boolean enviarDados(byte[] data) {
        boolean messagePosted = true;
        if (messagePosted) {
            System.out.println("Mensagem: '" + new String(data) + "' foi postada no Twitter");
            return true;
        } else {
            return false;
        }
    }

    public void logOut() {
        System.out.println("User: '" + user + "' desconectou do Twitter");
    }

    private void simulateNetworkLatency() {
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
