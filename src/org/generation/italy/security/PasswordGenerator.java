package org.generation.italy.security;

public class PasswordGenerator {
	
	public static void main(String[] args) {
		
		String nome = "Luca";
		String surname = "Vigentini";
		String favouriteColor = "rosso";
		int compleGiorno = 9;
		int compleMese = 6;
		int compleAnno = 1997;
		int numeroPassword = compleAnno + compleGiorno + compleMese;
		
		System.out.print("La sua password sarà ");
		System.out.print(nome + "-" + surname + "-" + favouriteColor + "-" + numeroPassword);
		
	}

}
