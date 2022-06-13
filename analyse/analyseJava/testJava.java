package analyse;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

import eraser.Eraser;

import java.io.FileReader;
import java.io.IOException;

public class testJava {
    
    public static void main(String[] args) throws IOException {
        //System.out.println(Eraser.erase(args[1]));

        //lie le fichier à l'erase et le fichier qu'on doit obtenir après l'algo
        double tempsDebut = System.currentTimeMillis();

        FileReader fichier = new FileReader("C:\\Users\\ruben\\github-classroom\\IUT-Blagnac\\sae2-02-Aadroman\\src\\texteE.txt");

        String texteEntree = "";
        for(int i=fichier.read();i!=-1; i=fichier.read()){
            texteEntree += (char) i;
        }

        fichier.close();

        FileReader fichier2 = new FileReader("C:\\Users\\ruben\\github-classroom\\IUT-Blagnac\\sae2-02-Aadroman\\src\\texteS.txt");
        String texteSolution = "";
        for(int i=fichier2.read();i!=-1; i=fichier2.read()){
            texteSolution += (char) i;
        }

        fichier2.close();

        double tempsFin = System.currentTimeMillis();
        System.out.println("Temps pris pour lire un fichier : "+(tempsFin-tempsDebut)+" ms");

        //teste 15 fois l'algo
        double[] resultat = new double[100];

        for(int i=0; i<resultat.length; i++){
            tempsDebut = System.currentTimeMillis();

            String texte = EraserSimplicite71.erase(texteEntree);

            tempsFin = System.currentTimeMillis();

            System.out.println("Temps que ça prend : "+(tempsFin-tempsDebut)+" ms");

            resultat[i] = tempsFin - tempsDebut;

            assertEquals(texteSolution,texte);
        }
        
        double somme = 0;
        for(int i=0; i<resultat.length;i++) {
        	somme+=resultat[i];
        }
        System.out.println(somme/resultat.length+" ms");
    }

}
