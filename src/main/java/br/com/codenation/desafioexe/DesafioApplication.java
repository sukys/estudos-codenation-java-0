package br.com.codenation.desafioexe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DesafioApplication {

	public static List<Integer> fibonacci() {
		List<Integer> fibonacci = new ArrayList<>(Arrays.asList(0,1));
		for (int x = 0; x <= 350; ){
			x = fibonacci.get(fibonacci.size() - 1) + fibonacci.get(fibonacci.size() - 2);
			fibonacci.add(x);
		}
		return fibonacci;
	}

	public static Boolean isFibonacci(Integer a) {
		return fibonacci().contains(a);
	}

}