package br.com.waldirep.lambdastream;

/**
 * Interface funcioanl � aquela que s� possu� 1 m�todo n�o implementado
 * @author Waldir
 *
 */
/**
 * @FunctionalInterface => Anota��o para ser utilizada nas interfaces funcionais
 *  N�o permite que voce fa�a bobagens, ao tentar implementar outro m�todo que nao seja default 
 *  ocorre um erro em tempo de compila��o
 * @author Waldir
 *
 */
@FunctionalInterface //  - N�o permite que voce fa�a bobagens
public interface Operator {

	int execute (int x, int y);
	
	//int x();
	
	// M�todo default possu� corpo, ou seja esta implementado e n�o invalida o fato de esta esta interface ser funcional
	default void say() {
		System.out.println("M�todo default da inteface Operation");
	}
}
