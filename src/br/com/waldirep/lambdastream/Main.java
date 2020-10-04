package br.com.waldirep.lambdastream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>(List.of(5,3,4,1,2));
		
		/* NumberComparator nc = new NumberComparator();
		
		Comparator<Integer> comparator = new Comparator<Integer>() {
			
	    @Override
		public int compare(Integer n1, Integer n2) {
			//TODO Auto-generated method stub
			return -n1.compareTo(n2);
			}
		}; */
		
		
		// Express�o lambda
		Comparator<Integer> comparator = (n1, n2) -> -n1.compareTo(n2);
		
		
		/**
		 * Express�o lambda simplificada
		 * Express�o lambda e divida em 2 partes :
		 * Lado direito parametros
		 * Lado esquerdo o que vai ser processado
		 */
		numbers.sort((n1, n2) -> -n1.compareTo(n2));
		
		System.out.println(numbers);
		
		Operator op = (x , y) -> x * y;
		System.out.println(op.execute(5, 2)); 
		
		
		List<String> words = List.of("CARLOS", "JOS�", "JO�O","JOANA","MARIA","CELSO");
		
		/*
		 * stream() - � um fluxo de informa��es
		 * filter() - faz a filtragem dos elementos
		 * (w -> w.startsWith("J")) - fun��o lambda com um m�todo que verifica se tem elemento que comece com a letra J retornando true ou false
		 * collect() - � uma opera��o final dentro da stream, pega os dados que sobraram e transforma em algo
		 * map() - Ele pega alguma coisa e transforma em outra coisa, recebe um dado de entrada T e retorna um R na sa�da
		 * (w -> w.toLowerCase()) - fun��o lambda com um m�todo que que deixa os caracteres com letra minuscula
		 * 
		 * forEach() - M�todo que imprime os elementos
		 * 
		 * O M�TODO REFERENCE PODE SER UTILIZADO EM 2 SITUA��ES, segue exemplo abaixo no map() e no Systrem.out
		 * :: sintaxe para fazer o m�todo reference
		 * 
		 * 
		 * 
		 * OBS : M�todos void n�o retornam nada
		 */
		List<String> listaFiltrada = words.stream()
				.filter(w -> w.startsWith("J"))
				//.map(w -> w.toLowerCase())
				// Utilizando o m�todo Reference
				.map(String::toLowerCase) // :: sintaxe para fazer o m�todo reference, o m�todo toLowerCase() � definido como String
				.collect(Collectors.toList());
		
		// As duas linhas fazem a mesma coisa
		listaFiltrada.stream().forEach(w -> System.out.println(w));
		listaFiltrada.forEach(w -> System.out.println(w));
		
		// Utilizando o m�todo Reference
		listaFiltrada.forEach(System.out::println);

		System.out.println(listaFiltrada);
		
		//---------------------------------------------------------------------------------------------------------------------
		
		List<Carro> carros = List.of(new Carro("BMW", 120000), new Carro("Renault", 85000), new Carro("VW", 70000));
		
		carros.stream().forEach(c -> System.out.println(c));
		carros.stream()
		/*
		 * sorted() - Ordena os elementos atrav�s do Comparator que recebe 2 parametros
		 * OBS : A compara��o vai ser por pre�o atrav�s do getPreco() que retorna um Double, se fosse utilizar ele teria que
		 * escrever o m�todo de compara��o na m�o. Para resolver esse problema sera utilizado o tipo Wrapper.
		 * Double.valueOf() - Converte o tipo primitivo Double para um objeto double que permitira ter acesso ao m�todo 
		 * CompareTo()
		 * 
		 * peek() - permite que vc execute a��es no objeto e possui retorno
		 */
		.sorted((c1, c2) -> Double.valueOf(c1.getPreco()).compareTo(c2.getPreco())) // Express�o lambda que faz a compara��o por pre�o
		.map(c -> new Carro(c.getMarca().toLowerCase(), c.getPreco())) // Transforma os nomes do carro em letra minuscula
		//.peek(c -> c.adicionaTaxa()) // Executando o m�todo que adicionaTaxa()
		.peek(Carro::adicionaTaxa) // Executando o m�todo que adicionaTaxa(), Forma simplificada
		.forEach(System.out::println);
		
		
		
		//----------------------------------------------- OPTIONAL -----------------------------------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
