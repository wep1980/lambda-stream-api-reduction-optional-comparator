package br.com.waldirep.lambdastream;

import java.util.Arrays;
import java.util.List;

/**
 * Reduction - operação para encerrar uma stream, operação terminal, 
 * onde pode ser feito um agrupamentos de informações para gerar um resultado
 * @author Waldir
 *
 */
public class MainReduction {
	
	
	
	public static void main(String[] args) {
		
		/**
		 * List.of() - gera um list de Integer e não um array de int
		 * stream() - joga os valores em uma stream e cada um deles sera mapeado em um inteiro
		 * mapToInt() - retorna um inteiro, dentro dele tem a função que recebe um Integer i -> i.intValue()
		 * intValue() - Método da classe Integer que retorna o int que esta dentro do Integer
		 * toArray() - retorna um novo array de int
		 */
		//int[] array = List.of(3,2,5).stream().mapToInt(i -> i.intValue()).toArray();
		
		// SIMPLIFICANDO COM REFERENCE METHOD
		int[] array = List.of(3, 2, 5, 2, 10).stream().mapToInt(Integer::intValue).toArray();
		
		System.out.println(multiply(array));
		System.out.println(max(array));
		System.out.println(maxIfTernario(array));


		
	}
	
	
	/**
	 * Método que recebe um array de int e multiplica cada elemento através de um reduction
	 * @param array
	 * @return
	 */
	private static int multiply(int[] array) {
		
		/**
		 * Arrays - Obtendo uma stream dos objetos do array, utilizando o Objeto Arrays
		 * reduce() - recebe 2 parametros
		 */
		return Arrays.stream(array).reduce((x , y) -> x * y).orElse(0);

	}
	
	
	/**
	 * Operacão de reduction que encontra o maior elemento dentro do array
	 */
    private static int max(int[] array) {
		
		/**
		 * Arrays - Obtendo uma stream dos objetos do array, utilizando o Objeto Arrays
		 * reduce() - recebe 2 parametros
		 */
		return Arrays.stream(array).reduce((x , y) -> {
			if(x > y) {
				return x;
			}
			return y;
		}).orElse(0);

	}
    
 private static int maxIfTernario(int[] array) {
		
		/**
		 * Arrays - Obtendo uma stream dos objetos do array, utilizando o Objeto Arrays
		 * reduce() - recebe 2 parametros
		 * 
		 * IF Ternario -  x > y ? x : y   SE x fOR > QUE y ? RETORNA x : SENÂO RETORNA y
		 */
		return Arrays.stream(array).reduce((x , y) -> x > y ? x : y).orElse(0);

	}

}


