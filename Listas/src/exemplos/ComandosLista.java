package exemplos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ComandosLista {

	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
        
		list.add("Maria");
		list.add("Bob");
		list.add("Jamilton");
		list.add("Lucas");
		list.add(2, "Marco");
		
	    
		
		List<String> result = list.stream().filter(x -> x.charAt(0) == 'M').collect(Collectors.toList());
		
		for(String x : result) {
			System.out.println(x);
		}
		System.out.println("---------------------------");
		String name = list.stream().filter(x -> x.charAt(0) == 'N').findFirst().orElse(null);
		System.out.println(name);
	}

}
