package br.com.waldirep.lambdastream;

import java.util.stream.Collectors;

public class MainConcatenacaoDeStrings {

	public static void main(String[] args) {
		
		String str = "ACBA";
		
		String resultado = str.chars()
		.map(i -> i - 64)
		//.mapToObj(i -> String.valueOf(i)) // Convertendo int para String
		.mapToObj(String::valueOf) // SIMPLIFICANDO COM REFERENCE METHOD
		.collect(Collectors.joining("-", "<<==","==>>")); // Collectors.joining() - Junta, concatena tudo que esta na stream
		
		//.forEach(System.out::println);
		System.out.println(resultado);
	}
	
}
