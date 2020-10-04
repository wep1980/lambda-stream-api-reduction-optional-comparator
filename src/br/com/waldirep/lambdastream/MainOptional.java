package br.com.waldirep.lambdastream;

import java.util.Map;
import java.util.Optional;

/**
 * A classe Optional tem como objetivo ser inv�lucro para informa��es que podem ou n�o existir
 * 
 * Resolve o problema de m�todos que retornam null
 * Usado para retorno de m�todos, se n�o for utilizado para isso � considerado uma m� pratica
 * @author Waldir
 *
 */
public class MainOptional {
	
	
	private static final Map<String, Integer> pessoas = Map.of("pedro", 15, "maria", 20, "paulo", 25, "jorge", 10);
	
	
	/**
	 * M�todo que retorna o nome e o Integer associado
	 * @param name
	 * @return
	 */
	/*private static Integer get(String name) {
		return pessoas.get(name);
	}*/
	
	/**
	 * O Optional n�o retorna informa��es null de m�todos, evita ficar fazendo checagem de nulls
	 * 
	 * Exitem 3 op��es de chamadas :
	 * 1 - ofNullable() -> op��o de colocar ou n�o um valor null
	 * 2 - of() -> indica que valor n�o pode ser null
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
		
		// Lan�a uma excess�o do tipo 
		//Integer i = get("marcelo");
		
		// A vari�vel i tem o null dentro dela, mas nunca vai ser null pq o retorno e um objeto Optional
		Optional<Integer> opt = get("joana"); 
		
		/**
		 * orElse(0) - Retorna o valor que esta dentro do optional, se o valor n�o existir ent�o retorna 0
		 * 
		 * OBS : Com 1 linha resolvemos um problema que se fosse com if teria 3 ou 4 linhas
		 */
		//int idade = opt.orElse(0);
		
		
		/**
		 * orElseThrow() - Se o valor null ele lan�a uma exception do tipo java.util.NoSuchElementException
		 */
		//int idade = opt.orElseThrow();
		
		
		/**
		 * Fornece um supplier que � uma FunctionalInterface ou seja, pode ser substituido por uma expreess�o lambda
		 */
		//int idade = opt.orElseThrow(()-> new IllegalArgumentException("Nome inexistente"));
		
		// Simplificando
		//int idade = opt.orElseThrow(IllegalArgumentException::new);
		//System.out.println(idade);
		
		
		/**
		 * Execute uma a��o apenas se o dado for encontrado
		 */
		opt.ifPresent(i -> System.out.println("A idade " + i + " foi encontrada"));
		
		
		/**
		 * Recebe 2 parametros
		 * 
		 * Parametro 1 recebe o valor que esta dentro do optional(i)
		 * Parametro 2 � um Runnable n�o recebe nada , n�o retorna nada e fala que n�o foi encontrado
		 */
		opt.ifPresentOrElse(i ->System.out.println( "A idade " + i + " foi encontrada"), 
				() -> System.out.println("N�o encontrado"));
		
		//System.out.println(i.intValue());
		
	}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
