package questao3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Integer> lista = new ArrayList<>();
		Set<Integer> conjunto = new HashSet<Integer>();

		lista.add(2);
		lista.add(5);
		lista.add(3);
		lista.add(9);
		lista.add(2);
		lista.add(4);
		lista.add(3);
		lista.add(8);
		lista.add(5);

		conjunto.add(2);
		conjunto.add(5);
		conjunto.add(3);
		conjunto.add(9);
		conjunto.add(2);
		conjunto.add(4);
		conjunto.add(3);
		conjunto.add(8);
		conjunto.add(5);

		System.out.println("Lista: ");

		Iterator<Integer> itr = lista.iterator();
		while (itr.hasNext()) {
			Integer integer = (Integer) itr.next();
			System.out.print(integer);
		}


		System.out.println("Conjunto Set: ");

		Iterator<Integer> itr2 = conjunto.iterator();
		while (itr2.hasNext()) {
			Integer integer = (Integer) itr2.next();
			System.out.print(integer);
		}

		System.out.println("O Conjunto set não imprime numero repitidos e imprime o numero em ondem crescente, diferente da lista, que imprime em odem que foi adcionada e os repetidos tambem. ");

	}

	

}
