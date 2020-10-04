package br.com.waldirep.lambdastream;

import java.util.Map;
import java.util.Optional;

/**
 * A classe Optional tem como objetivo ser invólucro para informações que podem ou não existir
 * 
 * Resolve o problema de métodos que retornam null
 * Usado para retorno de métodos, se não for utilizado para isso é considerado uma má pratica
 * @author Waldir
 *
 */
public class MainOptional {
	
	
	private static final Map<String, Integer> pessoas = Map.of("pedro", 15, "maria", 20, "paulo", 25, "jorge", 10);
	
	
	/**
	 * Método que retorna o nome e o Integer associado
	 * @param name
	 * @return
	 */
	/*private static Integer get(String name) {
		return pessoas.get(name);
	}*/
	
	/**
	 * O Optional náo retorna informações null de métodos, evita ficar fazendo checagem de nulls
	 * 
	 * Exitem 3 opções de chamadas :
	 * 1 - ofNullable() -> opção de colocar ou não um valor null
	 * 2 - of() -> indica que valor não pode ser null
	 * 3 - empty() -> gera um optional vazio com null dentro
	 * 
	 * @param name
	 * @return
	 */
	private static Optional<Integer> get(String name) {
		return Optional.ofNullable(pessoas.get(name));
	}
	
	
	public static void main(String[] args) {
		
		//System.out.println(get("maria"));
		//System.out.println(get("marcelo")); // Retorna null
		
		// Lança uma excessão do tipo 
		//Integer i = get("marcelo");
		
		// A variável i tem o null dentro dela, mas nunca vai ser null pq o retorno e um objeto Optional
		Optional<Integer> opt = get("joana"); 
		
		/**
		 * orElse(0) - Retorna o valor que esta dentro do optional, se o valor não existir então retorna 0
		 * 
		 * OBS : Com 1 linha resolvemos um problema que se fosse com if teria 3 ou 4 linhas
		 */
		//int idade = opt.orElse(0);
		
		
		/**
		 * orElseThrow() - Se o valor null ele lança uma exception do tipo java.util.NoSuchElementException
		 */
		//int idade = opt.orElseThrow();
		
		
		/**
		 * Fornece um supplier que é uma FunctionalInterface ou seja, pode ser substituido por uma expreessão lambda
		 */
		//int idade = opt.orElseThrow(()-> new IllegalArgumentException("Nome inexistente"));
		
		// Simplificando
		//int idade = opt.orElseThrow(IllegalArgumentException::new);
		//System.out.println(idade);
		
		
		/**
		 * Execute uma ação apenas se o dado for encontrado
		 */
		opt.ifPresent(i -> System.out.println("A idade " + i + " foi encontrada"));
		
		
		/**
		 * Recebe 2 parametros
		 * 
		 * Parametro 1 recebe o valor que esta dentro do optional(i)
		 * Parametro 2 é um Runnable não recebe nada , não retorna nada e fala que não foi encontrado
		 */
		opt.ifPresentOrElse(i ->System.out.println( "A idade " + i + " foi encontrada"), 
				() -> System.out.println("Não encontrado"));
		
		//System.out.println(i.intValue());
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
