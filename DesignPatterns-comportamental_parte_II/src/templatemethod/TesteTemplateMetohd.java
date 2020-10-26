package templatemethod;

import java.io.IOException;
import java.util.Scanner;

public class TesteTemplateMetohd {
	 public static void main(String[] args) throws IOException {
	        Scanner sc = new Scanner(System.in);
	        RedeSocial redeSocial = null;
	        System.out.print("Usuário: ");
	        String user = sc.nextLine();
	        System.out.print("Senha: ");
	        String password = sc.nextLine();

	        System.out.print("Mensagem: ");
	        String mensagem = sc.nextLine();

	        System.out.println("\nEm qual rede social você vai postar a mensagem?\n" +
	                "1 - Facebook\n" +
	                "2 - Twitter");
	        int opcao = Integer.parseInt(sc.nextLine());

	        if (opcao == 1) {
	            redeSocial = new Facebook(user, password);
	        } else if (opcao == 2) {
	            redeSocial = new Twitter(user, password);
	        }
	        redeSocial.postar(mensagem);
	        
	        sc.close();
	    }
}
