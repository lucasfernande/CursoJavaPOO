package application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

	public static void main(String[] args) {
	
          Map<String, String> cookies = new TreeMap<>();
          
          cookies.put("username", "tarikdanovageraçao");
          cookies.put("email", "paulin_pinho@gmail.com");
          cookies.put("phone", "11111111");
          
          cookies.remove("email"); // removendo uma chave
          
          System.out.println("Contains 'phone' key?: " + cookies.containsKey("phone") ); // se usa o contains para verificar se uma chave existe
          System.out.println("Phone number: " + cookies.get("phone")); // get para pegar o valor de uma chave
          System.out.println("Size: " + cookies.size()); // mostrando o tamanho do map
          
          System.out.println("\ncookies: ");
          for (String key : cookies.keySet()) {
        	  System.out.println(key + ": " + cookies.get(key));
          }
		
	}

}
