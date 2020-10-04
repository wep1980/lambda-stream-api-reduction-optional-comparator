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
		
		
		// Expressão lambda
		Comparator<Integer> comparator = (n1, n2) -> -n1.compareTo(n2);
		
		
		/**
		 * Expressão lambda simplificada
		 * Expressão lambda e divida em 2 partes :
		 * Lado direito parametros
		 * Lado esquerdo o que vai ser processado
		 */
		numbers.sort((n1, n2) -> -n1.compareTo(n2));
		
		System.out.println(numbers);
		
		Operator op = (x , y) -> x * y;
		System.out.println(op.execute(5, 2)); 
		
		
		List<String> words = List.of("CARLOS", "JOSÉ", "JOÃO","JOANA","MARIA","CELSO");
		
		/*
		 * stream() - è um fluxo de informações
		 * filter() - faz a filtragem dos elementos
		 * (w -> w.startsWith("J")) - função lambda com um método que verifica se tem elemento que comece com a letra J retornando true ou false
		 * collect() - è uma operação final dentro da stream, pega os dados que sobraram e transforma em algo
		 * map() - Ele pega alguma coisa e transforma em outra coisa, recebe um dado de entrada T e retorna um R na saída
		 * (w -> w.toLowerCase()) - função lambda com um método que que deixa os caracteres com letra minuscula
		 * 
		 * forEach() - Método que imprime os elementos
		 * 
		 * O MÉTODO REFERENCE PODE SER UTILIZADO EM 2 SITUAÇÕES, segue exemplo abaixo no map() e no Systrem.out
		 * :: sintaxe para fazer o método reference
		 * 
		 * 
		 * 
		 * OBS : Métodos void não retornam nada
		 */
		List<String> listaFiltrada = words.stream()
				.filter(w -> w.startsWith("J"))
				//.map(w -> w.toLowerCase())
				// Utilizando o método Reference
				.map(String::toLowerCase) // :: sintaxe para fazer o método reference, o método toLowerCase() é definido como String
				.collect(Collectors.toList());
		
		// As duas linhas fazem a mesma coisa
		listaFiltrada.stream().forEach(w -> System.out.println(w));
		listaFiltrada.forEach(w -> System.out.println(w));
		
		// Utilizando o método Reference
		listaFiltrada.forEach(System.out::println);

		System.out.println(listaFiltrada);
		
		//---------------------------------------------------------------------------------------------------------------------
		
		List<Carro> carros = List.of(new Carro("BMW", 120000), new Carro("Renault", 85000), new Carro("VW", 70000));
		
		carros.stream().forEach(c -> System.out.println(c));
		carros.stream()
		/*
		 * sorted() - Ordena os elementos através do Comparator que recebe 2 parametros
		 * OBS : A comparação vai ser por preço através do getPreco() que retorna um Double, se fosse utilizar ele teria que
		 * escrever o método de comparação na mão. Para resolver esse problema sera utilizado o tipo Wrapper.
		 * Double.valueOf() - Converte o tipo primitivo Double para um objeto double que permitira ter acesso ao método 
		 * CompareTo()
		 * 
		 * peek() - permite que vc execute ações no objeto e possui retorno
		 */
		.sorted((c1, c2) -> Double.valueOf(c1.getPreco()).compareTo(c2.getPreco())) // Expressão lambda que faz a comparação por preço
		.map(c -> new Carro(c.getMarca().toLowerCase(), c.getPreco())) // Transforma os nomes do carro em letra minuscula
		//.peek(c -> c.adicionaTaxa()) // Executando o método que adicionaTaxa()
		.peek(Carro::adicionaTaxa) // Executando o método que adicionaTaxa(), Forma simplificada
		.forEach(System.out::println);
		
		
		
		//----------------------------------------------- OPTIONAL -----------------------------------------------------------
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
