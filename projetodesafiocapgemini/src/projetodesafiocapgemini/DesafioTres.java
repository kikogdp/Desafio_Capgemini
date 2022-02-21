package projetodesafiocapgemini;

import java.util.ArrayList;

public class DesafioTres {

	public static void main(String[] args) {
		String palavra = "ovo";
		ArrayList<String> anagramas = new ArrayList<String>();

		for (int i = 0; i < palavra.length(); i++) {
			for (int j = 1; j < palavra.length(); j++) {
				if (palavra.charAt(i) == palavra.charAt(j) && i != j && i < j) {
					if (palavra.charAt(i) == palavra.charAt(i + 1)) {
						String x = palavra.substring(i, i + 1);
						anagramas.add(x);
					} else {
						String a = palavra.substring(i, j);
						String b = palavra.substring(i + 1, j + 1);
						String c = palavra.substring(i, i + 1);
						anagramas.add(c);
						anagramas.add(b);
						anagramas.add(a);
					}
				}
			}

		}
		System.out.println(anagramas.size());

	}

}
