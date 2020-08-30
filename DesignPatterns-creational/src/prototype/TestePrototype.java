package prototype;

public class TestePrototype {
	public static void main(String[] args) {
		Documento ascii = new ASCII();
		Documento pdf = new PDF();
		System.out.println(ascii.clone());
		System.out.println(pdf.clone());
	}
}
