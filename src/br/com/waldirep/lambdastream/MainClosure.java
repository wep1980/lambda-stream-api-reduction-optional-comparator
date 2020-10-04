package br.com.waldirep.lambdastream;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;


/**
 * Closure - é um recurso do java de acessar de dentro de uma expressão lambda variáveis que estão no enclosed escope(escopo fechado)
 * é um escopo no nível acima
 * 
 * OBS ; todas as variáveis que o java precisa acessar precisam ser imutáveis(não podem ter o valor alterado)
 * @author Waldir
 *
 */
public class MainClosure {

	public static void main(String[] args) {
		
		
		int multiplicador = 2;
		//int count = 0; // Uma possível solucão para incrementar um valor, mas não é possível pois ela não seria imútavel 
		
		/**
		 * Através de um objeto seria possível fazer o count
		 * O AtomicInteger e um objeto que permite fazer incremento getAndIncrement()
		 */
		AtomicInteger count = new AtomicInteger();
		
		/**
		 * Montando uma sequência numérica de 20 números
		 * range() -> Gera uma stream com os números de 1 a 20
		 */
		IntStream.range(1, 21)
		.map(i -> {
			count.getAndIncrement(); // Incrementando o valor
			return  i * multiplicador;  // Multiplicando os valores
		}) 
		.forEach(System.out::println);
		
		System.out.println("O valor de count é : " + count);
	}
}
