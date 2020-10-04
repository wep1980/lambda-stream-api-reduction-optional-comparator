package br.com.waldirep.lambdastream;

/**
 * Interface funcioanl é aquela que só possuí 1 método não implementado
 * @author Waldir
 *
 */
/**
 * @FunctionalInterface => Anotação para ser utilizada nas interfaces funcionais
 *  Não permite que voce faça bobagens, ao tentar implementar outro método que nao seja default 
 *  ocorre um erro em tempo de compilação
 * @author Waldir
 *
 */
@FunctionalInterface //  - Não permite que voce faça bobagens
public interface Operator {

	int execute (int x, int y);
	
	//int x();
	
	// Método default possuí corpo, ou seja esta implementado e não invalida o fato de esta esta interface ser funcional
	default void say() {
		System.out.println("Método default da inteface Operation");
	}
}
