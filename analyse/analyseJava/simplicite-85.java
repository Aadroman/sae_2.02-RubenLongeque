package analyse;

public class EraserSimplicite85 {
    public static String erase(String chaine) {
         String chaineSansEspace = "";
	        
	        //Cas si la saisie utilisateur se compose seulement d'espace ou est vide !
	        if (chaine.length() < 2)
	        	return "";
	        if (chaine.trim() == "" && chaine.charAt(0) == ' ' && chaine.charAt(1) == ' ') {
	        	return chaine;
	        }
	        
	        //Compte le nombre d'espace(s) à la fin de la chaine de caractère
	        int longueur = 0;
	        int c = chaine.length();
	        while (chaine.charAt(c-1) == ' ') {
	        	c--;
	        	longueur++;
	        }
	        
	        //Remplace les espaces à la fin de la chaine
	        chaine = chaine.replaceFirst("\\s++$", "");
	        
	        //Ne remplace que les blancs simples
	        int j = 0;
	        for (int i = 0; i < chaine.length(); i++) {
	        	if (i != chaine.length()) {
		            if (chaine.charAt(i) != ' ') {
		                chaineSansEspace += chaine.charAt(i);
		            } else if (chaine.charAt(i) == ' ' && chaine.charAt(i + 1) == ' ' && j == 0) {
		                chaineSansEspace += chaine.charAt(i);
		                chaineSansEspace += chaine.charAt(i+1);
		                j++;
		            } else if (chaine.charAt(i) == ' ' && chaine.charAt(i + 1) == ' '){
		                chaineSansEspace += chaine.charAt(i+1);
		            }
	        	} else {
	        		if (chaine.charAt(i) != ' ') {
		                chaineSansEspace += chaine.charAt(i);
	        	}
	        }
	    }
	        // Rajoute les espaces (s'il y en avait) à la fin de la chaine de caractère modifiée
	        if (longueur >= 2) {
	        	for (int k = 0; k != longueur; k++ ) {
	        		chaineSansEspace += " ";
	        	}
	        }
			return chaineSansEspace;
    }
}
