import java.util.Scanner;
public class alomundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String nome, cidade;
		int idade;
		
		
	Scanner leitor = new Scanner(System.in);

	System.out.print("Digite seu nome:");
	nome = leitor.next();
	
	System.out.println("Boas vindas," +nome);
	
	System.out.print("Digite sua idade:");
	idade = leitor.nextInt();
	
	System.out.print("qual a sua cidade:");
	cidade = leitor.next();
	
    System.out.println("seu nome é "+nome);
    System.out.println("idade:"+idade);
	System.out.println("cidade: "+cidade);
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
