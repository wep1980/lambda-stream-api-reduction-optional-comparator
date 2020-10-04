package br.com.waldirep.lambdastream;

import java.util.Comparator;

public class NumberComparator implements Comparator<Integer>{

	
	@Override
	public int compare(Integer numberOne, Integer numberTwo) {
		return -numberOne.compareTo(numberTwo); // Comparação em ordem decrecente
		
	}

}
