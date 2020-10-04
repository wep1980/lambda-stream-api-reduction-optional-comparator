package br.com.waldirep.lambdastream;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;


/**
 * Closure - � um recurso do java de acessar de dentro de uma express�o lambda vari�veis que est�o no enclosed escope(escopo fechado)
 * � um escopo no n�vel acima
 * 
 * OBS ; todas as vari�veis que o java precisa acessar precisam ser imut�veis(n�o podem ter o valor alterado)
 * @author Waldir
 *
 */
public class MainClosure {

	public static void main(String[] args) {
		
		
		int multiplicador = 2;
		//int count = 0; // Uma poss�vel soluc�o para incrementar um valor, mas n�o � poss�vel pois ela n�o seria im�tavel 
		
		/**
		 * Atrav�s de um objeto seria poss�vel fazer o count
		 * O AtomicInteger e um objeto que permite fazer incremento getAndIncrement()
		 */
		AtomicInteger count = new AtomicInteger();
		
		/**
		 * Montando uma sequ�ncia num�rica de 20 n�meros
		 * range() -> Gera uma stream com os n�meros de 1 a 20
		 */
		IntStream.range(1, 21)
		.map(i -> {
			count.getAndIncrement(); // Incrementando o valor
			return  i * multiplicador;  // Multiplicando os valores
		}) 
		.forEach(System.out::println);
		
		System.out.println("O valor de count � : " + count);
	}
}
