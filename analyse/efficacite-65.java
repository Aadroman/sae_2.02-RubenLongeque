package eraser;

import java.util.ArrayList;

public class Eraser2 {

    /*  Principe de cet algorithme : On ajoute petit à petit les lettres dans une ArrayList.
        Quand un espace est rencontré, il est ignoré et la variable etaitEspace passe à true.
        Si juste après un espace est trouvé ET que la variable etaitEspace est à true, on ajoute 2 espaces (pour rattraper l'ignorage précédent).
        Si un 3eme espace est trouvé, il est rajouté normalement, jusqu'à ce qu'un caractère non-espace soit rencontré et que etaitEspace repasse à False.
        Cet algorithme est donc optimisé pour les cas où beaucoup d'espaces SEULS sont rencontrés.
        Après avoir effectué plusieurs tests, cet algorithme est le plus rapide de tous les algorithmes présents.

        Catérogie de l'algorithme : Efficacité
     * 
     * 
     */
    public static String erase(String str) {

        ArrayList<String> arrayList = new ArrayList<String>();
        int len = str.length();
        int indice = 0;

        boolean etaitEspace = false;
        boolean premierPassage = true;

        if (str.equals("")) {
            return "";
        }

        while (indice < len) {

            if (! Character.toString(str.charAt(indice)).equals(" ")) {
                arrayList.add(Character.toString(str.charAt(indice)));
                etaitEspace = false;
            }

            else {
                if (! etaitEspace) {
                    etaitEspace = true;
                    premierPassage = true;
                }
                else {
                    if (premierPassage) {
                        arrayList.add("  ");
                        premierPassage = false;
                    } else {
                        arrayList.add(" ");
                    }
                }
            }
            indice++;
        }
        return String.join("", arrayList);
    }
}