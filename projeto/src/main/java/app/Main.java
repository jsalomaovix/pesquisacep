package app;

import java.util.Scanner;
import java.io.IOException;

import model.Endereco;
import service.ViaCepService;

public class Main {

	public static void main(String[] args) {
		
		ViaCepService vcs = new ViaCepService();
		
		try {
			
			Scanner scan = new Scanner(System.in);
			String achacep;

			System.out.println("Digite um Cep valido.:");
			achacep = scan.nextLine();

			Endereco endereco = vcs.getEndereco(achacep);
				
			System.out.println(endereco.toString());
			

		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
