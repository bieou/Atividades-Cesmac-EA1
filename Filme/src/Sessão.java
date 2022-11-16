import java.util.ArrayList;
import java.util.Scanner;
public class Sessão {

	public static void main(String[] args) {
		ArrayList<String> filme = new ArrayList<String>();
		filme.add("Harry Potter e a pedra filosofal");
		filme.add("Harry Potter e a câmera secreta"); 
		
		ArrayList<String> sessao = new ArrayList<String>();
		sessao.add("14h versão dublada");
		sessao.add("18h versão legendada");
		
		int meia = 16;
		int inteira = 32;
		int total=0;
		int contador = 0;
		int opcao;
		int filmes;
		int soma;
		Scanner leitor = new Scanner(System.in);
		while(contador!= 4) {
			System.out.println("1- Harry Potter e a pedra filosofal\n2- Harry Potter e a câmera secreta");
			filmes = leitor.nextInt();
			filmes = filmes -1;
			
			System.out.println("1 sessão = 14h versão dublada\n2 Sessão = 18h versão legendada");
			opcao = leitor.nextInt();
			opcao = opcao -1;
			System.out.println("Inteira = 32");
			soma = leitor.nextInt();
			total += soma*inteira;
			
			System.out.println("Meia = 16");
			soma = leitor.nextInt();
			total += soma*meia;
			
			System.out.println(filme.get(filmes)+" "+sessao.get(opcao)+" "+total);
			total= 0;
			
			System.out.println("Quer continuar comprando ingresso? 1 = sim e 2 = não");
			contador = leitor.nextInt();
			
			if (contador==2) {
			System.out.println("Obrigado pela sua escolha e tenha um bom filme");
				break;
			
		}
	}

}}
