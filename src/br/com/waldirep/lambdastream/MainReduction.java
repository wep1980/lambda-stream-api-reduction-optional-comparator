package br.com.waldirep.lambdastream;

import java.util.Arrays;
import java.util.List;

/**
 * Reduction - opera��o para encerrar uma stream, opera��o terminal, 
 * onde pode ser feito um agrupamentos de informa��es para gerar um resultado
 * @author Waldir
 *
 */
public class MainReduction {
	
	
	
	public static void main(String[] args) {
		
		/**
		 * List.of() - gera um list de Integer e n�o um array de int
		 * stream() - joga os valores em uma stream e cada um deles sera mapeado em um inteiro
		 * mapToInt() - retorna um inteiro, dentro dele tem a fun��o que recebe um Integer i -> i.intValue()
		 * intValue() - M�todo da classe Integer que retorna o int que esta dentro do Integer
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
	 * M�todo que recebe um array de int e multiplica cada elemento atrav�s de um reduction
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
	 * Operac�o de reduction que encontra o maior elemento dentro do array
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
		 * IF Ternario -  x > y ? x : y   SE x fOR > QUE y ? RETORNA x : SEN�O RETORNA y
		 */
		return Arrays.stream(array).reduce((x , y) -> x > y ? x : y).orElse(0);

	}

}


